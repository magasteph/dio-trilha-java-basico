public class MSNMessenger{

    public void enviarMensagem(){
        //encapsulamento
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectada a Internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}