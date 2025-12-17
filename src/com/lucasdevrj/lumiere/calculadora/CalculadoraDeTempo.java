package com.lucasdevrj.lumiere.calculadora;

import com.lucasdevrj.lumiere.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotalAssistidoEmMinutos;

    public int getTempoTotalAssistidoEmMinutos() {
        return tempoTotalAssistidoEmMinutos;
    }

    public void adicionaTitulo(Titulo titulo) {
        tempoTotalAssistidoEmMinutos += titulo.getDuracao();
        System.out.println("O tempo do título foi adicionado com sucesso.");
    }

    public void exibirQuantidadeDeTempoAssistido() {
        int horas = getTempoTotalAssistidoEmMinutos() / 60;
        int minutos = getTempoTotalAssistidoEmMinutos() % 60;
        System.out.printf("\nVocê assistiu %d horas e %d minutos.", horas, minutos);
    }
}
