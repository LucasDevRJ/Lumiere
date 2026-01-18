package com.lucasdevrj.lumiere.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lucasdevrj.lumiere.modelos.Titulo;
import com.lucasdevrj.lumiere.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiOmdb {

    private String api = "https://www.omdbapi.com";
    private String key = "fa6df38e";
    private String url;

    private void pesquisa() {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um filme para a busca: ");

        var busca = leitura.nextLine();
        busca = busca.replaceAll(" ", "+");

        url = "%s/?apikey=%s&t=%s".formatted(api, key, busca);
    }

    private HttpClient criaInstanciaDeClienteHttp() {
        HttpClient cliente = HttpClient.newHttpClient();
        return cliente;
    }

    private HttpRequest criaRequisicaoHttp() {
        HttpRequest requisicao = null;
        try {
            requisicao = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
        } catch (IllegalArgumentException erro) {
            System.out.println("Valor inválido digitado!");
            System.out.println("Erro: " + erro.getMessage());
        }
        return requisicao;
    }

    private String retornaRespostaDoServidor() throws IOException, InterruptedException {
        HttpClient cliente = criaInstanciaDeClienteHttp();
        HttpRequest requisicao = criaRequisicaoHttp();

        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        String json = resposta.body();

        return json;
    }

    private TituloOmdb converteJsonParaObjeto() throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        return gson.fromJson(retornaRespostaDoServidor(), TituloOmdb.class);
    }

    private Titulo converteTituloOmdbParaTitulo() throws IOException, InterruptedException {
        TituloOmdb tituloOmdb = converteJsonParaObjeto();
        Titulo titulo = new Titulo(tituloOmdb);
        return titulo;
    }

    public void realizarRequisicao() throws IOException, InterruptedException {
        pesquisa();
        String json = retornaRespostaDoServidor();
        System.out.println("--------------------|JSON da API OMDB|--------------------");
        System.out.println(json);
        System.out.println("----------------------------------------------------------");
    }

    public void exibeJsonConvertidoEmObjetoTitulo() throws IOException, InterruptedException {
        TituloOmdb tituloOmdb = converteJsonParaObjeto();
        System.out.println("--------------------|Record do Título|--------------------");
        System.out.println("Título: " + tituloOmdb.title());
        System.out.println("Duração: " + tituloOmdb.runtime());
        System.out.println("Ano: " + tituloOmdb.year());
        System.out.println("Gênero: " + tituloOmdb.genre());
        System.out.println("Diretor: " + tituloOmdb.director());
        System.out.println("Atores: " + tituloOmdb.actors());
        System.out.println("Prêmios: " + tituloOmdb.awards());
        System.out.println("Poster: " + tituloOmdb.poster());
        System.out.println("País: " + tituloOmdb.country());
        System.out.println("----------------------------------------------------------");
    }

    public void exibeTituloConvertido() throws IOException, InterruptedException {
        Titulo titulo = converteTituloOmdbParaTitulo();
        System.out.println("--------------------|Classe Título|--------------------");
        System.out.println(titulo);
        System.out.println("-------------------------------------------------------");
    }
}
