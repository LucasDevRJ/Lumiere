package com.lucasdevrj.lumiere.principal;

import com.lucasdevrj.lumiere.modelos.Filme;
import com.lucasdevrj.lumiere.modelos.Serie;
import com.lucasdevrj.lumiere.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Gladiador II", 148, "Épico, Temática militar e Drama");
        filme1.setAnoDeLancamento(2024);
        filme1.setVisualizacoes(310000);

        Filme filme2 = new Filme("Scooby-Doo", 86, "Familia e Comédia");
        filme2.setAnoDeLancamento(2002);
        filme2.setVisualizacoes(220000);

        Filme filme3 = new Filme("Top Gun", 109, "Temática militar e Drama");
        filme3.setAnoDeLancamento(1986);
        filme3.setVisualizacoes(400000);

        Serie serie1 = new Serie("Stranger Things", 5, "Drama e Ficção");
        serie1.setAnoDeLancamento(2016);
        serie1.setVisualizacoes(22000);

        Serie serie2 = new Serie("Breaking Bad", 5, "Drama e Suspense");
        serie2.setAnoDeLancamento(2008);
        serie2.setVisualizacoes(500000);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filme1);
        listaDeTitulos.add(filme2);
        listaDeTitulos.add(filme3);
        listaDeTitulos.add(serie1);
        listaDeTitulos.add(serie2);
        for (Titulo titulo : listaDeTitulos) {
            if (titulo instanceof Filme) {
                Filme filme = (Filme) titulo;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            System.out.println(titulo);
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Humphrey Bogart");
        listaDeArtistas.add("Katharine Hepburn");
        listaDeArtistas.add("Scarlett Johansson");
        listaDeArtistas.add("Samuel L. Jackson");

        System.out.println("Artistas: " + listaDeArtistas);

        Collections.sort(listaDeArtistas);

        System.out.println("Artistas ordenados com Collections: " + listaDeArtistas);

        System.out.print("Lista de Títulos não ordenados: ");
        for (Titulo titulo : listaDeTitulos) {
            System.out.print(titulo.getNome() + ", ");
        }

        System.out.println();

        System.out.print("Lista de Títulos ordenados: ");
        Collections.sort(listaDeTitulos);
        for (Titulo titulo : listaDeTitulos) {
            System.out.print(titulo.getNome() + ", ");
        }

        System.out.println();
        System.out.print("Lista de Títulos ordenados via ano de lançamento: ");
        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        for (Titulo titulo : listaDeTitulos) {
            System.out.print(titulo.getNome() + " (" + titulo.getAnoDeLancamento() + ")" + ", ");
        }

        System.out.println();
        List<Titulo> listaDeTitulos2 = new LinkedList<>();
        listaDeTitulos2.add(filme1);
        listaDeTitulos2.add(filme2);
        listaDeTitulos2.add(filme3);
        listaDeTitulos2.add(serie1);
        listaDeTitulos2.add(serie2);

        System.out.print("Lista usando a Inteface List: ");
        for (Titulo titulo : listaDeTitulos2) {
            System.out.print(titulo.getNome() + ", ");
        }
    }
}
