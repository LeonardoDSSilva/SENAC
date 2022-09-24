import java.util.Scanner; // importa a classe Scanner responsável por ler dados do teclado

/**
 * ESTE ARQUIVO NÃO É PARA SER EXECUTADO/COMPILADO
 */

public class DeJava { // Deve ter o mesmo nome do arquivo
    public static void main(String[] args) { // 
    
        // javac compila o código fonte e gera um arquivo .class
        // java executa o arquivo .class
        
        //Escopo de Variáveis é 
        int inteiro = 5;
        double real = 2.5;
        String palavra = "Palavra";
        char letra = 'a';
        boolean verdadeiro = true; // ou false

        //Constantes
        final int inteiroConstante = 5;
        final double PI = 3.14;


        //Prints
        System.out.println(); //Pula uma linha
        System.out.println("Inteiro: " + inteiro); //Printa o valor da variável inteiro e pula uma linha concatenando com o número
        System.out.print("Real: " + real); //Printa o valor da variável real na mesma linha
        System.out.printf("Palavra: %s, Letra: %c, inteiro: %d, real: %d, verdadeiro: %b", palavra, letra, inteiro, real, verdadeiro); 
        //Printa as variáveis com formatação %s = String, %c = char, %d = int, %d = double, %b = boolean
        //Printa o valor das variáveis palavra, letra, inteiro, real, verdadeiro na mesma linha

        // \n //Pula uma linha
        // \t //Tabula


        // Comentário de uma linha
        /*

        Comentário de várias linhas
        */

        //Scanner
        Scanner iScanner = new Scanner(System.in); //Instancia um objeto da classe Scanner

        //Entrada de dados
        letra = iScanner.next(); // Captura a primeira letra da palavra (ex: "Palavra" = "P")
        palavra = iScanner.nextLine(); // Captura a mensagem digitada pelo usuário (ex: "Palavra" = "Palavra")
        inteiro = iScanner.nextInt(); // Captura um numero inteiro (ex: "5" = 5) 
        real = iScanner.nextFloat(); // Captura um numero real (float) com ponto flutuante (ex: "2.5" = 2.5)
        verdadeiro = iScanner.nextBoolean(); // Captura um valor booleano (true/false)

        //Operadores Aritmeticos
        soma = num01 + num02;
        subtracao = num01 - num02;
        multiplicacao = num01 * num02;
        divisao = num01 / num02;
        resto = num01 % num02;

        pemdas = (num01 + num02) * num03 / num04 % num05; 
        //Parênteses, Expoentes, Multiplicação e Divisão (da esquerda para a direita), Adição e Subtração (da esquerda para a direita)
        
        //Operadores Relacionais
        igual = num01 == num02;
        diferente = num01 != num02;
        maior = num01 > num02;
        menor = num01 < num02;
        maiorIgual = num01 >= num02;
        menorIgual = num01 <= num02;

        //Operadores Lógicos
        e = num01 > 0 && num02 > 0; //E (AND) - Verdadeiro se as duas condições forem verdadeiras
        ou = num01 > 0 || num02 > 0; //OU (OR) - Verdadeiro se uma das condições forem verdadeiras
        negacao = !num01 > 0; //Negação (NOT) - Inverte o valor da condição (Verdadeiro para Falso e Falso para Verdadeiro)

        //Operadores de Atribuição
        soma += num01; // -> soma = soma + num01;
        subtracao -= num01; // -> subtracao = subtracao - num01;
        multiplicacao *= num01; // -> multiplicacao = multiplicacao * num01;

        //Operadores de Incremento e Decremento
        num01++; // -> num01 = num01 + 1;
        num01--; // -> num01 = num01 - 1;

        //Estruturas Condicionais
        //IF 
        if (condicao) { //Se a condição for verdadeira, executa o bloco de código
            //Código
        } else if (condicao) { // ou se a condição for verdadeira, executa o bloco de código
            //Código
        } else {
            //Código
        }

        switch (variavel) { //Verifica o valor da variável e executa o bloco de código correspondente
            case 1: //Se a variável for igual a 1, executa o bloco de código
                //Código
                break; //Encerra o bloco de código
            case 2:
                //Código
                break;
            default: //Se a variável não for igual a 1 ou 2, executa o bloco de código
                //Código
                break;
        }

        //Estruturas de Repetição
        
        //While - Enquanto
        while (condicao) { //Enquanto a condição for verdadeira, executa o bloco de código
            //Código
        }

        //Do While - Faça Enquanto (Executa o bloco de código pelo menos uma vez)
        do {
            //Código
        } while (condicao); //Enquanto a condição for verdadeira, executa o bloco de código

        //For - Para 
        for (int i = 0; i < 10; i++) { //Executa o bloco de código 10 vezes (0 a 9)
            //Código
        }

    }
    
}