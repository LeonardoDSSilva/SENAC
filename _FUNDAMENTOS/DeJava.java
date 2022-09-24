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

        /**
        Comentário
        de várias
        linhas
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

        //Encadeamento de IF
        if (condicao) {
            //Código
            if (condicao) {
                //Código
            } else {
                //Código
            }
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
        
        //While - Enquanto entrar no laço,  primeiro tem que uma condição antes de executar o bloco de código caso a condição seja verdadeira entra no laço
        while (condicao) { //Enquanto a condição for verdadeira, executa o bloco de código
            //Código
        }
        //Exemplo

        senha = 1234;
        System.out.println("Digite a senha: ");
        int senhaDigitada = iScanner.nextInt(); // For verdadeira não entra no laço caso seja falsa entra no laço
        while (senhaDigitada != senha) {
            System.out.println("Senha incorreta! Digite novamente: ");
            senhaDigitada = iScanner.nextInt();
        }

        //Do While - Primeiro executa o bloco de código e depois verifica a condição
        do {
            //Código
        } while (condicao); //Enquanto a condição for verdadeira, executa o bloco de código

        //Exemplo
        senha = 1234;
        do {
            System.out.println("Digite a senha: ");
            senhaDigitada = iScanner.nextInt();
        } while (senhaDigitada != senha);
        // Pergunta primeiro e depois verifica a condição se for verdadeira continua perguntando se for falsa sai do laço
        

        //For - Para 
        for (int i = 0; i < 10; i++) { //Executa o bloco de código 10 vezes (0 a 9)
            //Código
        }
        //Exemplo
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        } //Printa os números de 0 a 9 e sai do laço quando i for igual a 10


        //Tratamento de Váriaveis
        String nome1 = "João";
        String nomeMaiusculo = nome1.toUpperCase(); //Transforma a String em maiúsculo
        String nomeMinusculo = nome1.toLowerCase(); //Transforma a String em minúsculo

        //Comparação de Strings
        String nome2 = "Lucas";
        String nome3 = "João";

        nome1 == nome2; //Retorna falso
        nome1 == nome3; //Retorna verdadeiro
        nome1.equals(nome2); //Retorna falso
        nome1.equals(nome3); //Retorna verdadeiro

        System.out.print("Informe o 1º nome: ");
        nome01 = iScanner.next().toUpperCase(); // Captura a primeira letra da palavra e transforma em maiúsculo (ex: "João" = "J")
        System.out.print("Informe o 2º nome: ");
        nome02 = iScanner.next().toUpperCase(); // Captura a primeira letra da palavra e transforma em maiúsculo (ex: lucas" = "L")

        nome01 = 'J';
        nome02 = 'L';
        nome01.compareTo(nome02); //Retorna -1 (J é menor que L)
        nome01.compareTo(nome01); //Retorna 0 (J é igual a J)
        nome02.compareTo(nome01); //Retorna 1 (L é maior que J)
        //Retorna 0 se as Strings forem iguais, -1 se a primeira String for menor que a segunda e 1 se a primeira String for maior que a segunda

    }
}