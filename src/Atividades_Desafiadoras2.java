import java.util.Random;

public class Atividades_Desafiadoras2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        Random aleatorio = new Random();
        int[][] matriz2 = new int[2][3];

        System.out.println("Matriz Aleatória 3 x 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = aleatorio.nextInt(50);
            }
        }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
        System.out.println("-------------------------");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            matriz2[i][j] = matriz[j][i];
        }
    }
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matriz2[i][j] + " ");
        }
        System.out.println();
    }

    }
}
