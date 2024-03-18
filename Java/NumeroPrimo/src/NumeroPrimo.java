import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (ehPrimo(N)) {
            System.out.printf("O número %d é primo!", N);
        } else {
            System.out.printf("O número %d não é primo!", N);
        }
    }
    public static boolean ehPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}