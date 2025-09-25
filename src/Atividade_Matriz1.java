import java.util.Scanner;

public class Atividade_Matriz1 {
    public static void main(String[] args) {
        Scanner lerMatriz = new Scanner(System.in);
        int linha = 3;
        int coluna = 3;
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Indique o valor da posiçao: " + i + " - " + j);
                matriz[i][j] = lerMatriz.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
