package estabelecimento;
public class Fabrica{
    public static void main(String[] args){
        // Impressora impressora = new Deskjet();
        // impressora.imprimir();
        EquipamentoMultifuncional em = new EquipamentoMultifuncional
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;
        
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}