package com.lucasdevrj.lumiere.api;

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

    private String pesquisa() {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um filme para a busca: ");

        var busca = leitura.nextLine();
        busca = busca.replaceAll(" ", "+");

        url = "%s/?apikey=%s&t=%s".formatted(api, key, busca);

        leitura.close();

        return url;
    }

    private HttpClient criaInstanciaDeClienteHttp() {
        HttpClient cliente = HttpClient.newHttpClient();
        return cliente;
    }

    private HttpRequest criaRequisicaoHttp() {
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        return requisicao;
    }

    private String retornaRespostaDoServidor() throws IOException, InterruptedException {
        HttpClient cliente = criaInstanciaDeClienteHttp();
        HttpRequest requisicao = criaRequisicaoHttp();

        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        String json = resposta.body();

        return json;
    }

    public void realizarRequisicao() throws IOException, InterruptedException {
        pesquisa();
        String json = retornaRespostaDoServidor();
        System.out.println(json);
    }
}
