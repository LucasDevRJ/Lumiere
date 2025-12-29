package com.lucasdevrj.lumiere.modelos;

public class Filme extends Titulo {

    private boolean temCenaPosCredito;
    private String studio;
    private String trilhaSonora;

    public Filme() {

    }

    public Filme(String nome, int duracao, String genero) {
        super(nome, duracao, genero);
    }

    public void setTemCenaPosCredito(boolean temCenaPosCredito) {
        this.temCenaPosCredito = temCenaPosCredito;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setTrilhaSonora(String trilhaSonora) {
        this.trilhaSonora = trilhaSonora;
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.printf("Duração: %d minutos\n", super.getDuracao());
        String temCenaPosCreditos = temCenaPosCredito == true ? "Sim" : "Não";
        System.out.println("Cena pós créditos: " + temCenaPosCreditos);
        System.out.println("Studio: " + studio);
        System.out.println("Trilha sonora: " + trilhaSonora);
        System.out.println("---------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Duração: %d minutos
                Gênero: %s
                """.formatted(super.getNome(), super.getDuracao(), super.getGenero());
    }
}
