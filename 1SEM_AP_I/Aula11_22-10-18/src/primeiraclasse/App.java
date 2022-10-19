package primeiraclasse;

import animais.Cachorro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String comida = "";

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Totó";
        cachorro.raca = "Vira-lata";
        

        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.idade = 22;
        p1.MensagemBoaNoite();
        p1.Falar();

        System.out.println("Informe o que você está comendo: ");
        comida = scanner.nextLine();

        p1.Comer(comida);
        System.out.println(p1.MensagemBoaTarde(p1.nome));

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);

        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        p2.idade = 25;

        System.out.println("Nome: " + p2.nome);

        Carro c1 = new Carro();
        c1.modelo = "Gol";
        c1.cor = "Preto";
        c1.ano = 2010;
        c1.placa = "ABC-1234";
        c1.marca = "Volkswagen";
        c1.combustivel = "Gasolina";

        System.out.printf("Modelo: %s, Cor: %s, Ano: %d, Placa: %s, Marca: %s, Combustível: %s", c1.modelo, c1.cor, c1.ano, c1.placa, c1.marca, c1.combustivel);

        Computador pc1 = new Computador();
        pc1.marca = "Dell";
        pc1.modelo = "Inspiron 15";
        pc1.cor = "Preto";
        pc1.placaMae = "Intel";
        pc1.processador = "Intel Core i5";
        pc1.memoria = "8GB";
        pc1.hd = "1TB";
        pc1.qtdMemoria = 8;
        pc1.qtdHd = 1;

        System.out.printf("Marca: %s, Modelo: %s, Cor: %s, Placa Mãe: %s, Processador: %s, Memória: %s, HD: %s, Quantidade de Memória: %d, Quantidade de HD: %d", pc1.marca, pc1.modelo, pc1.cor, pc1.placaMae, pc1.processador, pc1.memoria, pc1.hd, pc1.qtdMemoria, pc1.qtdHd);
    }
}
