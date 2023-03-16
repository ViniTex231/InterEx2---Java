import java.util.Random;
public class InterEx2 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = rand.nextInt(10);
        }
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = vetor1[vetor1.length - 1 - i];
        }
        System.out.println("Valores originais: ");
        for (int valor : vetor1) {
            System.out.println(valor + " ");
        }
        System.out.println("Valor inversos: ");
        for (int valor : vetor2) {
            System.out.println(valor + " ");
        }
    }
}