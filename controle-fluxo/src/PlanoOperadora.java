public class PlanoOperadora {
<<<<<<< HEAD
    public static void main(String[] args) {
        String plano = "M";

        if(plano == "B"){
            
        }
=======

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
>>>>>>> 2b7ffc8caa0506d522d2a9eff89e94b0b2529680
    }
}
