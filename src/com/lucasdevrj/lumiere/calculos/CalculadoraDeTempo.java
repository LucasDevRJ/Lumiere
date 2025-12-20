package com.lucasdevrj.lumiere.calculos;

import com.lucasdevrj.lumiere.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotalAssistidoEmMinutos = 0;

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
        System.out.println("--------------------|TEMPO ASSSISTIDO|--------------------");
        System.out.printf("Você assistiu no total %d horas e %d minutos de títulos.\n", horas, minutos);
        System.out.println("----------------------------------------------------------");
    }
}
