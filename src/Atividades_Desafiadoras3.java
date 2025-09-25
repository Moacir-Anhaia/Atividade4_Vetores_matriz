import java.util.Scanner;

public class Atividades_Desafiadoras3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linha = 0;
        int coluna = 0;
        boolean vitoriaX = false;
        boolean vitoriaO = false;

        String[][] matrizTabuleiro = new String[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTabuleiro[i][j] = " ";
            }
        }
        System.out.println("Para jogar informe primeiro a linha após a coluna (1 - 3)");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ " + matrizTabuleiro[i][j] + " ] ");
            }
            System.out.println();
        }

        boolean ganhou = false;

        do {

            System.out.println("Informe a posiçao para a sua jogada (x) ");
            linha = input.nextInt();
            coluna = input.nextInt();

            matrizTabuleiro[linha - 1][coluna - 1] = "X";


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" [ " + matrizTabuleiro[i][j] + " ] ");
                }
                System.out.println();
            }

            vitoriaX = validarVitoriaX(matrizTabuleiro);

            if (vitoriaX) {
                return;
            }


            System.out.println("Informe a posiçao para a sua jogada (O) ");
            linha = input.nextInt();
            coluna = input.nextInt();

            matrizTabuleiro[linha - 1][coluna - 1] = "O";


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" [ " + matrizTabuleiro[i][j] + " ] ");
                }
                System.out.println();
            }
            vitoriaO = validarVitoriaO(matrizTabuleiro);
            if (vitoriaO) {
                return;
            }


        } while (!vitoriaX && !vitoriaO);
    }

    public static boolean validarVitoriaX(String[][] matrizTabuleiro) {

        for (int i = 0; i < 3; i++) {
            if (matrizTabuleiro[0][i].equals("X") && matrizTabuleiro[1][i].equals("X") && matrizTabuleiro[2][i].equals("X")) {
                System.out.println("Jogador X ganhou!!");
                return true;
            } else if (matrizTabuleiro[i][0].equals("X") && matrizTabuleiro[i][1].equals("X") && matrizTabuleiro[i][2].equals("X")) {
                System.out.println("Jogador X ganhou!!");
                return true;
            } else if (matrizTabuleiro[0][0].equals("X") && matrizTabuleiro[1][1].equals("X") && matrizTabuleiro[2][2].equals("X")) {
                System.out.println("Jogador X ganhou!!");
                return true;
            } else if (matrizTabuleiro[0][2].equals("X") && matrizTabuleiro[1][1].equals("X") && matrizTabuleiro[2][0].equals("X")) {
                System.out.println("Jogador X ganhou!!");
                return true;
            }
        }

        return false;

    }

    public static boolean validarVitoriaO(String[][] matrizTabuleiro) {

        for (int i = 0; i < 3; i++) {
            if (matrizTabuleiro[0][i].equals("O") && matrizTabuleiro[1][i].equals("O") && matrizTabuleiro[2][i].equals("O")) {
                System.out.println("Jogador O ganhou!!");
                return true;
            } else if (matrizTabuleiro[i][0].equals("O") && matrizTabuleiro[i][1].equals("O") && matrizTabuleiro[i][2].equals("O")) {
                System.out.println("Jogador O ganhou!!");
                return true;
            } else if (matrizTabuleiro[0][0].equals("O") && matrizTabuleiro[1][1].equals("O") && matrizTabuleiro[2][2].equals("O")) {
                System.out.println("Jogador O ganhou!!");
                return true;
            } else if (matrizTabuleiro[0][2].equals("O") && matrizTabuleiro[1][1].equals("O") && matrizTabuleiro[2][0].equals("O")) {
                System.out.println("Jogador O ganhou!!");
                return true;
            }
        }

        return false;

    }
}
