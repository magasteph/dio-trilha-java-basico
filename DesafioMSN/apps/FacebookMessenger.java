package apps;

public class FacebookMessenger extends ServicoMensagemInstanea{
        public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
            
    }
}