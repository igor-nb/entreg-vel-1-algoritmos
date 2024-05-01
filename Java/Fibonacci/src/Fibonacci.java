import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de termos da Sequência de Fibonacci: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.print(calcularFibonacci(N));
    }
    public static String calcularFibonacci(int quantidadeDeTermos) {
        int primeiroTermo = 0; int segundoTermo = 1; int aux;
        String sequencia = "";

        for (int i = 1; i <= quantidadeDeTermos; i++) {
            sequencia += primeiroTermo;

            if (i != quantidadeDeTermos) {
                sequencia += ", ";
            }

            aux = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = aux;
        }
        return sequencia;
    }
}