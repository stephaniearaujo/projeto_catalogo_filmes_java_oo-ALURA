import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double totalAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Em quanto você avalia esse filme?");
            nota = leitura.nextDouble();
            totalAvaliacao = totalAvaliacao + nota;
            // ou: mediaAvaliacao += nota;
        }

        System.out.println("Média de Avaliação: " + totalAvaliacao / 3);
    }
}