public class Autodromo{
  public static void main(String[] args){
      Carro jeep = new Carro();

      jeep.setChassi("897800");
      jeep.ligar();

      Moto z400 = new Moto();
      z400.setChassi("467789");
      z400.ligar();

      Veiculo coringa = jeep;
      coringa.ligar();

  }
}
