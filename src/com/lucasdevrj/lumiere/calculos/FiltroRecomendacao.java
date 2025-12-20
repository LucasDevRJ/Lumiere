package com.lucasdevrj.lumiere.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        int avaliacao = classificavel.getClassificacao();
        if (avaliacao >= 4) {
            System.out.println("O " + classificavel.getNome() + " está entre os favoritos.");
        } else if (avaliacao >= 2) {
            System.out.println("O " + classificavel.getNome() + " é muito bem avaliado no momento.");
        } else {
            System.out.println("Adicione o" + classificavel.getNome() + " na sua lista para assistir mais tarde.");
        }
    }
}
