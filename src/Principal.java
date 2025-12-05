import com.lucasdevrj.lumiere.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Sonic - O Filme");
        filme1.setAnoDeLancamento(2020);
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(99);

        filme1.avaliaFilme(7);
        filme1.avaliaFilme(6);
        filme1.avaliaFilme(9);

        filme1.exibeFichaTecnica();

        System.out.println(String.format("Classificação do filme \"%s\": %d de 10", filme1.getNome(), filme1.getNota()));
        System.out.println(String.format("Total de avaliações do filme \"%s\": %d", filme1.getNome(), filme1.getTotalDeAvaliacoes()));
    }
}
