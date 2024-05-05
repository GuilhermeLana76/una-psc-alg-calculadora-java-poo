import java.util.Scanner;
import CalculadoraPOO.Calculadora;

public class Lista10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CalculadoraPOO.Calculadora calculadora = new Calculadora();

    char operacao;
    double num1, num2;

    System.out.println("Calculadora Simples em Java");
    do {
        System.out.print("Digite a operação (A=Adição, S=Subtração, M=Multiplicação, D=Divisão, P=Potência, R=Raiz, Q=Sair): ");
        operacao = scanner.next().toUpperCase().charAt(0);

        if (operacao == 'Q') {
            System.out.println("Programa encerrado.");
            break;
        }

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        switch (operacao) {
            case 'A':
                calculadora.setSoma(num1,num2);
                break;
            case 'S':
                calculadora.setSubtracao(num1, num2);
                break;
            case 'M':
                calculadora.setMultiplicacao(num1, num2);
                break;
            case 'D':
                if (num2 != 0) {
                calculadora.setDivisao(num1, num2);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case 'P':
                calculadora.setPotencia(num1, num2);
                break;
            case 'R':
                if (num1 >= 0) {
                calculadora.setRaiz(num1);
                } else {
                    System.out.println("Erro: Raiz de número negativo não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
    } while (operacao != 'Q');

    scanner.close();
}
}