import java.util.Scanner;

public class VerificadorSequencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numero = entrada.nextInt();
        entrada.close();

        if (verificarSeFibonacci(numero)) {
            System.out.println(numero + " está na sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não está na sequência de Fibonacci.");
        }
    }

    public static boolean verificarSeFibonacci(int numero) {
        int primeiro = 0, segundo = 1, proximo;
        if (numero == primeiro || numero == segundo) return true;

        while (segundo < numero) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            if (segundo == numero) return true;
        }

        return false;
    }
}
