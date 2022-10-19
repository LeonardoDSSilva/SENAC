package calculadora;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String opcao = "";
        Scanner sc = new Scanner(System.in);
        
        do {
            cal();
            System.out.println("Deseja continuar? (S/N)");
            opcao = sc.nextLine().toUpperCase();
        } while (opcao.equals("S"));
        
    }
    
    public static void cal() {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int b = sc.nextInt();

        System.out.println("Informe um numero para realizar uma operação: ");
        System.out.println(
          "1 - \t Soma\n2 - \t Subtração\n3 - \t Multicação\n4 - \t Divisão\n");

        System.out.println("Informe a operação desejada: ");
        int op = sc.nextInt();

        switch(op) {
            case 1:
                System.out.println("Resultado da soma: " + calc.soma(a, b));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calc.subtrair(a, b));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + calc.multiplicar(a, b));
                break;
            case 4:
                System.out.println("Resultado da divisão: " + calc.dividir(a, b));
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }

}
