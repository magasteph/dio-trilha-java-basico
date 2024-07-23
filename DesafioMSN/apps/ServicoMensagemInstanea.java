package apps;

public abstract class ServicoMensagemInstanea{
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validade se esta conectado na internet");
    }
}