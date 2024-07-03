import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double totalAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou digite -1 para encerrar.");
            nota = leitura.nextDouble();

            if(nota != -1) {
                totalAvaliacao = totalAvaliacao + nota;
                totalDeNotas++;
                // ou: mediaAvaliacao += nota;
            }
        }

        System.out.println("Média de Avaliação: " + totalAvaliacao / totalDeNotas);
    }
}
