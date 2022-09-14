import java.util.Scanner;

public class Exm_01 {
    public static void main(String[] args) {
        int dia;
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Informe um dia de 1 ao 7: ");
        dia = iScanner.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else if (dia == 3) {
            System.out.println("Terça");
        } else if (dia == 4) {
            System.out.println("Quarta");
        } else if (dia == 5) {
            System.out.println("Quinta");
        } else if (dia == 6) {
            System.out.println("Sexta");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Dia inválido");
        }

    }
    
}
