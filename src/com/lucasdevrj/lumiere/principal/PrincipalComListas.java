package com.lucasdevrj.lumiere.principal;

import com.lucasdevrj.lumiere.modelos.Filme;
import com.lucasdevrj.lumiere.modelos.Serie;
import com.lucasdevrj.lumiere.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Gladiador II", 148, "Épico, Temática militar e Drama");
        Filme filme2 = new Filme("Scooby-Doo", 86, "Familia e Comédia");
        Filme filme3 = new Filme("Top Gun", 109, "Temática militar e Drama");

        Serie serie1 = new Serie("Stranger Things", 5, "Drama e Ficção");
        Serie serie2 = new Serie("Breaking Bad", 5, "Drama e Suspense");

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filme1);
        listaDeTitulos.add(filme2);
        listaDeTitulos.add(filme3);
        listaDeTitulos.add(serie1);
        listaDeTitulos.add(serie2);
        for (Titulo titulo : listaDeTitulos) {
            System.out.println(titulo);
        }
    }
}
