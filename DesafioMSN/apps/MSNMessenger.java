package apps;


public class MSNMessenger extends ServicoMensagemInstanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Messenger");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Messenger");
            
    }
    
}