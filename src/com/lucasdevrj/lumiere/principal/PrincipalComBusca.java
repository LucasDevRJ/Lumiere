package com.lucasdevrj.lumiere.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lucasdevrj.lumiere.excecoes.ErroDeCaractereInvalidoException;
import com.lucasdevrj.lumiere.modelos.Titulo;
import com.lucasdevrj.lumiere.modelos.TituloOmdb;

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

        try {
            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest requisicao = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
            String json = resposta.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);

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

            try {
                Titulo titulo = new Titulo(tituloOmdb);
                System.out.println("--------------------|Classe Título|--------------------");
                System.out.println(titulo);
                System.out.println("-------------------------------------------------------");
            } catch (ErroDeCaractereInvalidoException erro) {
                System.out.println("Erro de formatação de valor!");
                System.out.println("Aconteceu um erro: " + erro.getMessage());
            }

        } catch (NullPointerException | IllegalArgumentException erro) {
            System.out.println("Valor inválido digitado!");
            System.out.println("Erro: " + erro.getMessage());
        } finally {
            System.out.println("\nPrograma finalizado.");
        }
    }
}
