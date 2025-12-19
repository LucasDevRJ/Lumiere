package com.lucasdevrj.lumiere.stream;

import com.lucasdevrj.lumiere.modelos.Titulo;

public class VelocidadeDaReproducao {

    private double velocidadeDeReproducao = 1;

    public void aumentarVelocidadeDaReproducao(Titulo titulo) {
        if (velocidadeDeReproducao < 3.0 && titulo.getEstaAssistindo() == true) {
            velocidadeDeReproducao += 0.5;
            System.out.printf("O título %s está na velocidade %.1fx de reprodução.\n", titulo.getNome(), velocidadeDeReproducao);
        } else {
            System.out.println("Já atingiu o máximo da velocidade.\n");
        }
    }

    public void diminuirVelocidadeDaReproducao(Titulo titulo) {
        if (velocidadeDeReproducao > 0.0 && titulo.getEstaAssistindo() == true) {
            velocidadeDeReproducao -= 0.5;
            System.out.printf("O título %s está na velocidade %.1fx de reprodução.\n", titulo.getNome(), velocidadeDeReproducao);
        } else {
            System.out.println("Já diminui o máximo da velocidade.\n");
        }
    }

}
