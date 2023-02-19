package ado1;

public class Leopardo {

  private String nome;
  private String habitat;
  private String regiao;

  public Leopardo() {
    this.nome = "Leopardo";
  }
  
  public Leopardo(String nRegiao, String nHabitat) {
    this.nome = "Leopardo";
    this.regiao = nRegiao;
    this.habitat = nHabitat;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nNome) {
    this.nome = nNome;
  }

  public String getHabitat() {
    return habitat;
  }

  public void setHabitat(String nHabitat) {
    this.habitat = nHabitat;
  }

  public String getRegiao() {
    return regiao;
  }

  public void setRegiao(String nRegiao) {
    this.regiao = nRegiao;
  }

  public void Saltar() {
    System.out.println("O leopardo esta saltando");
  }

  public void Correr() {
    System.out.println("O leopardo esta correndo");
  }
}
