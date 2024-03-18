import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        System.out.println("Digite o número de notas: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println("O total de alunos aprovados foi " + calcularAprovados(N));
    }
    public static int calcularAprovados(int numeroDeNotas) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= numeroDeNotas; i++) {
            System.out.println("Digite a próxima nota: ");
            int nota = scanner.nextInt();

            if (nota >= 50) contador++;
        }
        return contador;
    }
}