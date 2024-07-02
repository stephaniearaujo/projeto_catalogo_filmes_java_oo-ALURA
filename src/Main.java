//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Alô Mundo!");
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String nome = "Thiago";
//        System.out.println("Olá, " + nome + "!");
//    }
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;

        String sinopse;

        sinopse = """
Filme de aventura com ator famoso dos anos 80.
Top Gun retrata a vida do Capitão da Marinha norte-americana que tem como objetivo treinar jovens pilotos para uma missão que é mortal e envolve muito sacrifício, trabalho em equipe e resiliência.
Nota do Filme:  """ + notaDoFilme
                ;

        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao + " estrelas");

    }
}