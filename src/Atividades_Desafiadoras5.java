import java.util.Random;
import java.util.Scanner;

public class Atividades_Desafiadoras5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String[][] marTabuleiro = new String[7][7];
        Random sorteioNavio = new Random();
        int barcos = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                marTabuleiro[i][j] = " ~~ ";

            }
        }

        while (barcos < 3) {
            int Linha = sorteioNavio.nextInt(7);
            int Coluna = sorteioNavio.nextInt(7);

            if (marTabuleiro[Linha][Coluna].equals(" ~~ ")) {
                marTabuleiro[Linha][Coluna] = "Barco";
                barcos++;
            }
        }
        int acertos = 0;
        int tentativas = 0;
        while (acertos < 3) {
            System.out.println("Digite a linha escolhida entre 1 e 7");
            int linhaEscolhida = ler.nextInt();
            System.out.println("Digite a coluna escolhida entre 1 e 7");
            int colunaEscolhida = ler.nextInt();

            if (marTabuleiro[linhaEscolhida - 1][colunaEscolhida - 1].equals("Barco")) {
                System.out.println("Barco acertado");
                acertos++;
            } else {
                System.out.println("Errou o alvo!!");
                marTabuleiro[linhaEscolhida - 1][colunaEscolhida - 1] = " XX ";
            }
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (marTabuleiro[i][j].equals("Barco")) {
                        System.out.print(" ~~ ");
                    } else {
                        System.out.print(marTabuleiro[i][j]);
                    }
                }
                System.out.println();
            }
            tentativas++;
        }
        System.out.println("Parabens voce encontrou todos os barcos!!!");
        System.out.print("N° de tentativas: " + tentativas);


    }
}
