package com.lucasdevrj.lumiere.arquivo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lucasdevrj.lumiere.api.ApiOmdb;
import com.lucasdevrj.lumiere.modelos.Titulo;
import com.lucasdevrj.lumiere.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApiOmdbArquivo {

    private String api = "https://www.omdbapi.com";
    private String key = "fa6df38e";
    private String url;
    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();
    List<Titulo> listaDeTitulos = new ArrayList<>();
    private String nomeDoArquivo = "titulos.json";
    Scanner leitura = new Scanner(System.in);

    private void pesquisarTitulo() {
        leitura.nextLine();
        System.out.print("Digite um filme para a busca: ");
        String busca = leitura.nextLine();
        busca = busca.replaceAll(" ", "+");
        url = "%s/?apikey=%s&t=%s".formatted(api, key, busca);
    }

    private HttpClient criaInstanciaDoClienteHttp() {
        HttpClient cliente = HttpClient.newHttpClient();
        return cliente;
    }

    private HttpRequest criaRequisicaoHttp() {
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        return requisicao;
    }

    private String retornaRespostaHttpDoServidor() throws IOException, InterruptedException {
        HttpClient cliente = criaInstanciaDoClienteHttp();
        HttpRequest requisicao = criaRequisicaoHttp();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        String json = resposta.body();
        return json;
    }

    private TituloOmdb serializarTitulo() throws IOException, InterruptedException {
        String json = retornaRespostaHttpDoServidor();
        TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
        return tituloOmdb;
    }

    private Titulo converterTituloOmdbParaTitulo() throws IOException, InterruptedException {
        TituloOmdb tituloOmdb = serializarTitulo();
        Titulo titulo = new Titulo(tituloOmdb);
        return titulo;
    }

    private void adicionarTituloNaLista() throws IOException, InterruptedException {
        Titulo titulo = converterTituloOmdbParaTitulo();
        listaDeTitulos.add(titulo);
        System.out.println("Título adicionado na lista com sucesso!");
    }

    private void escreveTitulosNoArquivo() throws IOException {
        FileWriter escrita = new FileWriter(nomeDoArquivo);
        escrita.write(gson.toJson(listaDeTitulos));
        escrita.close();
        System.out.println("Título escrito no arquivo com sucesso!");
    }

    private void exibeTitulosDoArquivo() {
        System.out.println("--------------------|Títulos do arquivo|--------------------");
        System.out.println(listaDeTitulos);
        System.out.println("------------------------------------------------------------");
    }

    public void consumirApi() throws IOException, InterruptedException {
        System.out.println("1 - Para pesquisar Título");
        System.out.println("2 - Para sair");
        System.out.print("Digite a opção desejada: ");
        int resposta = leitura.nextInt();

        while (resposta == 1) {
            pesquisarTitulo();
            adicionarTituloNaLista();
            escreveTitulosNoArquivo();

            System.out.print("Digite a opção desejada: ");
            resposta = leitura.nextInt();
        }

        exibeTitulosDoArquivo();
        leitura.close();
    }
}
