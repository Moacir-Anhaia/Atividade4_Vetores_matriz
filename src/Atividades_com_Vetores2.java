import java.util.Random;

public class Atividades_com_Vetores2 {
    public static void main(String[] args) {
        Random numerosAleatorios = new Random();

        int[] numeros = new int[15];
        for (int i = 0; i < 15; i++) {
            int limitador = numerosAleatorios.nextInt(100);
            numeros[i] = limitador;
        }

        for (int i = 0; i < 15; i++) {
            if (numeros[i]%2 == 0){
                System.out.println("Este é numero é par: " + numeros[i]);
            }else {
                System.out.println("Este numero é impar: " + numeros[i]);
            }
        }


    }
}
