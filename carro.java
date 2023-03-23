public class Carro {
  //Propriedades do carro
  private String marca;
  private String modelo;
  private int ano;
  private String cor;
  private int velocidade;

  //Construtor da classe
  public Carro(String marca, String modelo, int ano, String cor) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
    this.velocidade = 0;
  }

  // Métodos da classe
  public void acelerar() {
    this.velocidade += 10;
  }

  public void frear() {
    this.velocidade -= 10;
  }

  public void ligar() {
    System.out.println("O carro está ligado!");
  }

  public void desligar() {
    System.out.println("O carro está desligado!");
  }

  public void exibirInfo() {
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ano: " + this.ano);
    System.out.println("Cor: " + this.cor);
    System.out.println("Velocidade: " + this.velocidade + " km/h");
  }

}
