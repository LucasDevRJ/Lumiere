package com.lucasdevrj.lumiere.calculadora;

import com.lucasdevrj.lumiere.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotalAssistidoEmMinutos;

    public int getTempoTotalAssistidoEmMinutos() {
        return tempoTotalAssistidoEmMinutos;
    }

    public void adicionaTitulo(Titulo titulo) {
        tempoTotalAssistidoEmMinutos += titulo.getDuracao();
        System.out.printf("O tempo do título %s foi adicionado com sucesso.\n", titulo.getNome());
    }

    public void exibirQuantidadeDeTempoAssistido() {
        int horas = getTempoTotalAssistidoEmMinutos() / 60;
        int minutos = getTempoTotalAssistidoEmMinutos() % 60;
        System.out.printf("Você assistiu no total %d horas e %d minutos.\n", horas, minutos);
    }
}
