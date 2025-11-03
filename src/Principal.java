public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Sonic";
        meuFilme.anoDeLancamento = 2020;
        meuFilme.incluidoNoPlano = true;
        meuFilme.avaliacao = 8.1;
        meuFilme.totalDeAvaliacoes = 12456;
        meuFilme.duracaoEmMinutos = 99;

        meuFilme.exibeFichaTecnica();
    }
}
