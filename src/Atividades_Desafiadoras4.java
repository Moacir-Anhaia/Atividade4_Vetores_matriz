import java.util.Scanner;

public class Atividades_Desafiadoras4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrizNota = new double[5][2];
        double [] media =  new double[5];
        System.out.println("-------------Sistema media de 5 alunos-------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Informe a " + (j+1) + "º notas do " + (i+1) + "º Aluno: ");
                matrizNota[i][j] = input.nextDouble();
            }
        }
        System.out.println("---------------Média das notas dos 5 alunos-------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                media[i] = (matrizNota[i][j] + matrizNota[i][j]) / 2;

            }
            System.out.println("Média do " + (i+1) + "º Aluno: " + media[i]);
        }

    }
}
