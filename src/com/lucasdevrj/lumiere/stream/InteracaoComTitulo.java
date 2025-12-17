package com.lucasdevrj.lumiere.stream;

import com.lucasdevrj.lumiere.modelos.Titulo;

public class InteracaoComTitulo {

    public void assistir(Titulo titulo) {
        titulo.setEstaAssistindo(true);
        System.out.printf("Você esta assistindo o título '%s'.\n", titulo.getNome());
    }

    public void pausar(Titulo titulo) {
        if (titulo.getEstaAssistindo() == true) {
            System.out.printf("Você pausou o título '%s'.\n", titulo.getNome());
        } else {
            System.out.printf("Tem que começar a assistir o título '%s' para pausa-lo.\n", titulo.getNome());
        }
    }

    public void encerrar(Titulo titulo) {
        if (titulo.getEstaAssistindo() == true) {
            System.out.printf("Você parou de assistir o título '%s'.\n", titulo.getNome());
            titulo.setEstaAssistindo(false);
        } else {
            System.out.printf("Tem que esta assistindo o título '%s' para encerra-lo.\n", titulo.getNome());
        }
    }
}
