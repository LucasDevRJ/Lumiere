package com.lucasdevrj.lumiere.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                        .uri(URI.create("https://www.omdbapi.com/?apikey=fa6df38e&t=Shutter+Island"))
                        .build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        System.out.println(resposta.body());
    }
}
