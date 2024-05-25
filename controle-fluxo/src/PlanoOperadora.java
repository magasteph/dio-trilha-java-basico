public class PlanoOperadora {

    public static void main(String[] args) {

        String plano = "M";

        // sem o break que dessa forma o 100 minutos entra para todos.
        switch (plano) {
            case "T":
                System.out.println("SGb Youtube");
            case "M":
                System.out.println("Whats e Insta gratuito");
            case "B":
                System.out.println("100 minutos de ligação");
            default:
                break;
        }        
    }
}
