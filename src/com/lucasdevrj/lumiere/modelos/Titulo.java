package com.lucasdevrj.lumiere.modelos;

public class Titulo {

    private String nome;
    private int duracao;
    private String genero;
    private int anoDeLancamento;
    private String sinopse;
    private boolean incluidoNoPlano;
    private int avaliacao;
    private String diretor;
    private String elenco;
    private int classificacaoIndicativa;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean estaAssistindo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        if (classificacaoIndicativa == 0 || classificacaoIndicativa == 10 || classificacaoIndicativa == 12
        || classificacaoIndicativa == 14 || classificacaoIndicativa == 16 || classificacaoIndicativa == 18) {
            this.classificacaoIndicativa = classificacaoIndicativa;
        }
    }

    public int getAvaliacao() {
        if (somaDasAvaliacoes > 0 && totalDeAvaliacoes > 0) {
            return avaliacao = somaDasAvaliacoes / totalDeAvaliacoes;
        }
        return 0;
    }

    public boolean getEstaAssistindo() {
        return estaAssistindo;
    }

    public void setEstaAssistindo(boolean estaAssistindo) {
        this.estaAssistindo = estaAssistindo;
    }

    public void exibirTitulo() {
        System.out.println("--------------------|Resumo sobre o Título|--------------------");
        System.out.println("Nome: " + nome);
        System.out.printf("Avaliação: %d de 10\n", getAvaliacao());
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Gênero: " + genero);
        System.out.println("---------------------------------------------------------------");
    }

    public String estaIncluidoNoPlano() {
        if (incluidoNoPlano) {
            return "Sim";
        }
        return "Não";
    }

    public String indicadoSomenteParaMaioresDeIdade() {
        if (classificacaoIndicativa == 18) {
            return "Título recomendado somente para maiores de 18 anos.";
        }
        return "";
    }

    public void exibirFichaTecnica() {
        System.out.println("--------------------|Informações sobre o Título|--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Incluído no plano: " + estaIncluidoNoPlano());
        System.out.printf("Avaliação: %d de 10\n", getAvaliacao());
        System.out.println("Diretor: " + diretor);
        System.out.println("Elenco: " + elenco);
        String indicacao = classificacaoIndicativa == 0 ? "Livre" : classificacaoIndicativa + " anos";
        System.out.println("Classificação Indicativa: " + indicacao);
        System.out.print(indicadoSomenteParaMaioresDeIdade());
    }

    public void avaliarTitulo(int avaliacao) {
        if (avaliacao > 0 && avaliacao <= 10) {
            this.avaliacao = avaliacao;
            somaDasAvaliacoes += this.avaliacao;
            totalDeAvaliacoes++;
            System.out.println("O título '" + nome + "' foi avaliado com sucesso!");
        } else {
            System.out.println("Avaliação inválida! Digite uma nota entre 0 e 10.");
        }
    }

    public void zerarAvaliacoes() {
        avaliacao = 0;
        somaDasAvaliacoes = 0;
        totalDeAvaliacoes = 0;
        System.out.println("Avaliações foram zeradas.");
    }

    public void assistir() {
        estaAssistindo = true;
        System.out.printf("Você esta assistindo o título '%s'.\n", nome);
    }

    public void pausar() {
        if (estaAssistindo == true) {
            System.out.printf("Você pausou o título '%s'.\n", nome);
        } else {
            System.out.printf("Tem que começar a assistir o título '%s' para pausa-lo.\n", nome);
        }
    }

    public void encerrar() {
        if (estaAssistindo == true) {
            System.out.printf("Você parou de assistir o título '%s'.\n", nome);
            estaAssistindo = false;
        } else {
            System.out.printf("Tem que esta assistindo o título '%s' para encerra-lo.\n", nome);
        }
    }
}
