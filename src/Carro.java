public class Carro {
  public void ligar(){
    confereCambio();
    confereCombustivel();
    System.out.println("Carro Ligado");
  }
  private void confereCombustivel(){
    System.out.println("Conferindo combustivel");

  }
  private void confereCambio(){
    System.out.println("Conferindo cambio em P");

  }
}
