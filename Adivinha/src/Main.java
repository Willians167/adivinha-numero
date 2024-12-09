import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);

        int numeroRandom = r.nextInt(10) + 1;

        System.out.println("Tente adivinhar o número entre 0 e 10!");

        int tentaSorte;
        boolean acertou = false;


        while (!acertou) {
            System.out.print("Digite um número: ");
            tentaSorte = input.nextInt();

            if (tentaSorte == numeroRandom) {
                System.out.println("Parabéns, você acertou! O número era " + numeroRandom);
                acertou = true;
                
            } else if (tentaSorte < numeroRandom) {
                System.out.println("O número gerado é maior que seu palpite. Tente novamente!");
            } else {
                System.out.println("O número gerado é menor que seu palpite. Tente novamente!");
            }
        }

        input.close();
    }
}
