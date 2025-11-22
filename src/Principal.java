import com.lucasdevrj.lumiere.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.nome = "Sonic - O Filme";
        filme1.anoDeLancamento = 2020;
        filme1.incluidoNoPlano = true;
        filme1.duracaoEmMinutos = 99;

        filme1.avaliaFilme(7.0);
        filme1.avaliaFilme(6.0);
        filme1.avaliaFilme(9.0);

        filme1.exibeFichaTecnica();

        System.out.println(String.format("Classificação do filme \"%s\": %d de 10", filme1.nome, filme1.getClassificacao()));
        System.out.println(String.format("Total de avaliações do filme \"%s\": %d", filme1.nome, filme1.getTotalDeAvaliacoes()));
    }
}
