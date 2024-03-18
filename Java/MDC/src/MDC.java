import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Digite um segundo número: ");
        int b = scanner.nextInt();

        System.out.printf("O MDC de %d e %d é %d", a, b, calcularMDC(a, b));
    }
    public static int calcularMDC(int a, int b) {
        int maximoDivisor = 1;

        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                if (b % i == 0) maximoDivisor = i;
            }
        }
        return maximoDivisor;
    }
}