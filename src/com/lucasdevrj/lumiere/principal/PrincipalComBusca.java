package com.lucasdevrj.lumiere.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um filme para a busca: ");
        var busca = leitura.nextLine();

        busca = busca.replaceAll(" ", "+");
        String url = "https://www.omdbapi.com/?apikey=fa6df38e&t=" + busca;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        System.out.println(resposta.body());
    }
}
