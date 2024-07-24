public class Iphone implements AparelhoTelefonico, Navegador , Impressora{
    public void ligar(){
        System.out.println("Ligando");
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz")
    }
    public void exibirPagina(){
        System.out.println("Exibindo Pagina");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Pagina");
    }
    public void tocar(){
        System.out.println("Tocando Musica");
    }
    public void pausar(){
        System.out.println("Pausando Musica");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando Musica");
    }
}