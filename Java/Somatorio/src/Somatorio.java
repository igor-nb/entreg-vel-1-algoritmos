import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de números: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println("O total do somatório foi: " + calcularSomatorio(N));
    }
    public static double calcularSomatorio(int quantidadeDeNumeros) {
        Scanner scanner = new Scanner(System.in);
        double somatorio = 0;

        for (int i = 1; i <= quantidadeDeNumeros; i++) {
            System.out.println("Digite o próximo número: ");
            somatorio += scanner.nextDouble();
        }
        return somatorio;
    }
}