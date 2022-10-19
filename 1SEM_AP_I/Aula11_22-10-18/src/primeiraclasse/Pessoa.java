package primeiraclasse;

public class Pessoa {
    String nome;
    int idade;

    public void MensagemBoaNoite() {
        System.out.println("Boa noite!");
    }

    public String MensagemBoaTarde( String nome ) {
        return nome + ", Boa tarde!" ;
    }

    public void Falar() {
        System.out.println("Estou falando...");
    }

    public void Comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }   
}

