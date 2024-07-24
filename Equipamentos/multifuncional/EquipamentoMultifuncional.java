package equipamentos.multifuncional;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora , Impressora{
    public void copiar(){
        System.out.println("Copiando via equipamento multifuncional")
    }
    public void digitalizar(){
        System.out.println("Digitalizando via equipamento multifuncional")

    }
    public void impressora(){
        System.out.println("Imprimindo via equipamento multifuncional")

    }
}