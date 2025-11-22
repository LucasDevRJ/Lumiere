//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String titulo;
        String sinopse;
        int anoDeLancamento;
        int quantidadeDeNotas;
        int classificacaoDoFilme;
        int numeroDivisorDaClassificacao;
        boolean incluidoNoPlano;
        double notaDoFilme1;
        double notaDoFilme2;
        double notaDoFilme3;
        double mediaDasNotas;

        titulo = "Gladiador";
        sinopse = """
                A sinopse de %s é sobre Maximus, um leal general romano que é traído pelo ambicioso filho 
                do imperador, Commodus, o qual mata seu pai e assume o trono. Ordem de Commodus, Maximus é dado como 
                morto e é forçado a se tornar um escravo, sendo treinado como gladiador, em busca de vingança contra 
                o imperador.
                """.formatted(titulo);
        anoDeLancamento = 2000;
        quantidadeDeNotas = 3;
        numeroDivisorDaClassificacao = 2;
        incluidoNoPlano = true;
        notaDoFilme1 = 7.2;
        notaDoFilme2 = 6.3;
        notaDoFilme3 = 8.0;
        mediaDasNotas = (notaDoFilme1 + notaDoFilme2 + notaDoFilme3) / quantidadeDeNotas;
        classificacaoDoFilme = (int) mediaDasNotas / numeroDivisorDaClassificacao;

        System.out.println("Bem-vindo ao Lumière");
        System.out.println("com.lucasdevrj.lumiere.filme.Filme: Gladiador");
        System.out.println(sinopse);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Disponível: " + incluidoNoPlano);
        System.out.printf("Nota: %.1f", mediaDasNotas);
        System.out.println("\nClassificação: " + classificacaoDoFilme);
    }
}