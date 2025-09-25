import java.util.Random;

public class Atividade_Matriz2 {
    public static void main(String[] args) {
        int linha = 4;
        int coluna = 4;
        int[][] matriz = new int[linha][coluna];
        Random numeroAleatorio = new Random();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = numeroAleatorio.nextInt(100);
            }
        }
        System.out.println("-------------------------");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        System.out.println("Os valores da diagonal são: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }


}

