public class SmartTV {
  boolean ligada;
  int canal;
  int volume;

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Mudando de canal para o: " + canal);
  }

  public void aumentarCanal() {
    canal++;
    System.out.println("Aumentando o canal para: " + canal);
  }

  public void baixarCanal() {
    canal--;
    System.out.println("Baixando o canal para: " + canal);
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void baixarVolume() {
    volume--;
    System.out.println("Baixando o volume para: " + volume);
  }

  public void ligar() {
    System.out.println("Ligando a TV!");
    ligada = true;
    canal = 1;
    volume = 1;
  }

  public void desligar() {
    System.out.println("Desligando a TV!");
    ligada = false;
    canal = 0;
    volume = 0;
  }
}