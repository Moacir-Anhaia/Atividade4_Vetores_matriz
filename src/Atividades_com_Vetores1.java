import java.util.Scanner;

public class Atividades_com_Vetores1 {
    public static void main(String[] args) {
        Scanner lerNumeros = new Scanner(System.in);

        System.out.println("Informe 10 numeros inteiros:");

        int[] numerosInteiros = new int[10];

        for (int i = 0; i <= 9; i++) {
            numerosInteiros[i] = lerNumeros.nextInt();
        }

        int maior = numerosInteiros[0];
        int menor = numerosInteiros[0];


        for (int i = 0; i <= 9; i++) {
            if (numerosInteiros[i] > maior) {
                maior = numerosInteiros[i];
            }

            if (numerosInteiros[i] < menor) {
                menor = numerosInteiros[i];
            }
        }
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);

    }

}
