public class Usuario {
  public static void main(String[] args) {

    SmartTV smartTV = new SmartTV();

    System.out.println("Tv ligada? " + smartTV.ligada);
    System.out.println("Canal atual: " + smartTV.canal);
    System.out.println("Volume atual: " + smartTV.volume);

    smartTV.ligar();
    smartTV.mudarCanal(85);
    System.out.println("Tv ligada? " + smartTV.ligada);
    System.out.println("Canal atual: " + smartTV.canal);
    System.out.println("Volume atual: " + smartTV.volume);

    smartTV.aumentarVolume();
    smartTV.aumentarVolume();
    smartTV.aumentarVolume();
    smartTV.baixarVolume();
    smartTV.baixarVolume();
    smartTV.baixarVolume();

    smartTV.aumentarCanal();
    smartTV.aumentarCanal();
    smartTV.aumentarCanal();
    smartTV.aumentarCanal();
    smartTV.baixarCanal();
    smartTV.baixarCanal();
    smartTV.baixarCanal();
    smartTV.baixarCanal();

    smartTV.desligar();
    System.out.println("Tv ligada? " + smartTV.ligada);
    System.out.println("Canal atual: " + smartTV.canal);
    System.out.println("Volume atual: " + smartTV.volume);

  }

}
