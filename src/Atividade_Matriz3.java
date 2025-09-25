import java.util.Scanner;

public class Atividade_Matriz3 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int linha = 3;
        int coluna = 3;
        int[][] matrizSoma = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Indique o valor da posiçao: " + i + " - " + j);
                matrizSoma[i][j] = valor.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        for (int j = 0; j < 3; j++) {
            int somaLinha = 0;
            for (int k = 0; k < 3; k++) {
                somaLinha = somaLinha + matrizSoma[j][k];
            }
            System.out.println("A soma da " + (j + 1) + "º linha: " + somaLinha);
        }
        System.out.println("-------------------------");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int k = 0; k < 3; k++) {
                somaColuna = somaColuna + matrizSoma[k][j];
            }
            System.out.println("A soma da " + (j + 1) + "º coluna: " + somaColuna);
        }

    }


}

