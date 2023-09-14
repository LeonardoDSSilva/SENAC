import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner numScanner = new Scanner(System.in);
    static Scanner strScanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        ArrayList<Animal> animais = new ArrayList<Animal>();

        
        System.out.println("Bem vindo ao Zoo!");

        System.out.print("vamos adicionar alguns animais automaticamente ? (1 - Sim / 2 - Não): ");
        int opcao = numScanner.nextInt();
        if (opcao == 1) {
            System.out.println("Adicionando animais...");
            animais.add(new Animal("Leão", Classificacao.Mamifero.getClassificacao(), Alimentacao.Carnivoro.getAlimentacao()));
            animais.add( new Animal("Tigre", Classificacao.Mamifero.getClassificacao(), Alimentacao.Carnivoro.getAlimentacao()));
            animais.add( new Animal("Cobra", Classificacao.Reptil.getClassificacao(), Alimentacao.Carnivoro.getAlimentacao()));
            animais.add( new Animal("Lagarto", Classificacao.Reptil.getClassificacao(), Alimentacao.Onivoro.getAlimentacao()));
            animais.add( new Animal("Aguia", Classificacao.Ave.getClassificacao(), Alimentacao.Carnivoro.getAlimentacao()));
            animais.add( new Animal("Beija-flor", Classificacao.Ave.getClassificacao(), Alimentacao.Herbivoro.getAlimentacao()));
            animais.add( new Animal("Tubarão", Classificacao.Peixe.getClassificacao(), Alimentacao.Carnivoro.getAlimentacao()));
            animais.add( new Animal("Baleia", Classificacao.Peixe.getClassificacao(), Alimentacao.Herbivoro.getAlimentacao()));
            animais.add( new Animal("Sapo", Classificacao.Anfibio.getClassificacao(), Alimentacao.Onivoro.getAlimentacao()));
            animais.add( new Animal("Salamandra", Classificacao.Anfibio.getClassificacao(), Alimentacao.Herbivoro.getAlimentacao()));
        }else{
            System.out.println("Ok, vamos começar do zero");
        }

        do {
            
            System.out.println();
            System.out.println(" --- Menu ---");
            System.out.println("1 - Listar animais");
            System.out.println("2 - Adicionar mais um animal");
            System.out.println("3 - Remover animal");
            System.out.println("4 - Quantidade de animais");
            System.out.println("5 - Buscar animal");
            System.out.println("6 - Listar animais por classificação");
            System.out.println("7 - Listar animais por alimentação");
            System.out.println("8 - Ordenar animais por nome");
            System.out.println("9 - Estatísticas");
            System.out.println("10 - Limpar lista");
            System.out.println("11 - Sair");
            System.out.print("O que deseja fazer? ");

            opcao = numScanner.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:

                    if (animais.isEmpty()) {
                        System.out.println("Não há animais cadastrados");
                        break;
                    }

                    System.out.println("Animais:");
                    for (Animal animal : animais) {
                        System.out.println(animal);
                    }
                    break;
                case 2:
                
                    Animal animal = adicionarAnimal();
                    if (animal != null) {
                        animais.add(animal);
                        System.out.println(animal);
                        System.out.println("Animal adicionado com sucesso!");
                    }
                    break;

                case 3:

                    if (animais.isEmpty()) {
                        System.out.println("Não há animais cadastrados");
                        break;
                    }

                    for (int i = 0; i < animais.size(); i++) {
                        System.out.printf("%d - %s\n", i, animais.get(i).getNome());
                    }
                    System.out.println("Qual animal deseja remover? ");
                    opcao = numScanner.nextInt();

                    try {
                        animais.remove(opcao);
                        System.out.println("Animal removido com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Opção inválida");
                    }
                    break;

                case 4:
                    
                    if (animais.isEmpty()) {
                        System.out.println("Não há animais cadastrados");
                        break;
                    }

                    System.out.println("Quantidade de animais: " + animais.size());
                    break;

                case 5:

                    if (animais.isEmpty()) {
                        System.out.println("Não há animais cadastrados");
                        break;
                    }

                    System.out.print("Me diga o nome do animal: ");
                    String nomeAnimal = numScanner.next();

                    animal = animais.stream().filter(animalLista -> animalLista.getNome().equals(nomeAnimal)).findFirst().orElse(null);

                    if (animal != null) {
                        System.out.println(animal);
                    } else {
                        System.out.println("Animal não encontrado");
                    }
                    break;

                case 6:

                    if (animais.isEmpty()) {
                        System.out.println("Não há animais cadastrados");
                        break;
                    }

                    for (Classificacao classificacao : Classificacao.values()) {
                        System.out.println(classificacao.ordinal() + " - " + classificacao.getClassificacao());
                    }

                    System.out.println("Qual a classificação do animal?");
                    opcao = numScanner.nextInt();

                    try {
                        Boolean achou = false;
                        String classificacao = Classificacao.values()[opcao].getClassificacao();
                        for (Animal animalLista : animais) {
                            if (animalLista.getClassificacao().equals(classificacao)) {
                                System.out.println(animalLista);
                                achou = true;
                            }
                        }
                        if (!achou) {
                            System.out.println("Nenhum animal encontrado");
                        }
                    } catch (Exception e) {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 7:

                    if (animais.isEmpty()) {
                        System.out.println("Não há animais cadastrados");
                        break;
                    }

                    for (Alimentacao alimentacao : Alimentacao.values()) {
                        System.out.println(alimentacao.ordinal() + " - " + alimentacao.getAlimentacao());
                    }
                    System.out.print("Qual a alimentação do animal?");
                    opcao = numScanner.nextInt();

                    try {
                        String alimentacao = Alimentacao.values()[opcao].getAlimentacao();
                        
                        if (animais.stream().noneMatch(animalLista -> animalLista.getAlimentacao().equals(alimentacao))) {
                            System.out.println("Nenhum animal encontrado");
                        } else{
                            System.out.println("Animais " + alimentacao + ":" );
                            animais.stream().filter(animalLista -> animalLista.getAlimentacao().equals(alimentacao)).forEach(System.out::println);
                        }

                    } catch (Exception e) {
                        System.out.println("Opção inválida");
                    }
                    break;


                case 8:

                    if (verficarHaAnimais(animais)) {
                        break;
                    }

                    animais.sort((animal1, animal2) -> animal1.getNome().compareTo(animal2.getNome()));
                    System.out.println("Animais ordenados por nome:");
                    for (Animal animalLista : animais) {
                        System.out.println(animalLista);
                    }
                    break;

                case 9:
                    exibirEstatisticas(animais);
                    break;
                case 10:
                    animais.clear();
                    break;
                case 11:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 11);
    }

    private static void exibirEstatisticas(ArrayList<Animal> animais) {

        if (verficarHaAnimais(animais)) {
            return;
        }
        System.out.println("Estatísticas:");
        System.out.println("Quantidade de animais: " + animais.size());
        System.out.println("- Classificação:");
        System.out.println("   Quantidade de mamíferos: " + animais.stream().filter(animalLista -> animalLista.getClassificacao().equals(Classificacao.Mamifero.getClassificacao())).count());
        System.out.println("   Quantidade de aves: " + animais.stream().filter(animalLista -> animalLista.getClassificacao().equals(Classificacao.Ave.getClassificacao())).count());
        System.out.println("   Quantidade de répteis: " + animais.stream().filter(animalLista -> animalLista.getClassificacao().equals(Classificacao.Reptil.getClassificacao())).count());
        System.out.println("   Quantidade de peixes: " + animais.stream().filter(animalLista -> animalLista.getClassificacao().equals(Classificacao.Peixe.getClassificacao())).count());
        System.out.println("   Quantidade de anfíbios: " + animais.stream().filter(animalLista -> animalLista.getClassificacao().equals(Classificacao.Anfibio.getClassificacao())).count());
        System.out.println("- Alimentação:");
        System.out.println("   Quantidade de carnívoros: " + animais.stream().filter(animalLista -> animalLista.getAlimentacao().equals(Alimentacao.Carnivoro.getAlimentacao())).count());
        System.out.println("   Quantidade de herbívoros: " + animais.stream().filter(animalLista -> animalLista.getAlimentacao().equals(Alimentacao.Herbivoro.getAlimentacao())).count());
        System.out.println("   Quantidade de onívoros: " + animais.stream().filter(animalLista -> animalLista.getAlimentacao().equals(Alimentacao.Onivoro.getAlimentacao())).count());
    
    }

    private static boolean verficarHaAnimais(ArrayList<Animal> animais) {
        if (animais.isEmpty()) {
            System.out.println("Não há animais cadastrados");
            return true;
        }
        return false;
    }

    public static Animal adicionarAnimal() {

        System.out.println("Digite o nome do animal:");
        String nome = strScanner.next();

        System.out.println("Escolha uma classificação:");
        for (Classificacao classificacao : Classificacao.values()) {
            System.out.println(classificacao.ordinal() + " - " + classificacao.getClassificacao());
        }

        System.out.println("Qual a classificação do animal?");
        int opcao = numScanner.nextInt();
        String classificacao = "";
        try {
            classificacao = Classificacao.values()[opcao].getClassificacao();
        } catch (Exception e) {
            System.out.println("Opção inválida");
            return null;
        }

        System.out.println("Escolha uma alimentação:");
        for (Alimentacao alimentacao : Alimentacao.values()) {
            System.out.println(alimentacao.ordinal() + " - " + alimentacao.getAlimentacao());
        }

        System.out.println("Qual a alimentação do animal?");
        opcao = numScanner.nextInt();
        String alimentacao;

        try {
            alimentacao =  Alimentacao.values()[opcao].getAlimentacao();
        } catch (Exception e) {
            System.out.println("Opção inválida");
            return null;
        }

        if (!nome.equals("") || !classificacao.equals("") || !alimentacao.equals("")) {
            Animal animal = new Animal(nome, classificacao, alimentacao);
            return animal;
        } else {
            System.out.println("Voltando ao menu...");
            return null;
        }

    }
}
