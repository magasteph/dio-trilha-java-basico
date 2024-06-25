import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira um numero inteiro positivo ");
        int parametroum = terminal.nextInt();
        System.out.println("Insira outro numero inteiro positivo: ");
        int parametrodois = terminal.nextInt();

        System.out.println("Numeros escolhidos: ");
        System.out.println(parametroum); 
        System.out.println(parametrodois);

        try{
            contar(parametroum,parametrodois);
        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroum, int parametrodois) throws ParametrosInvalidosException{
        int contagem = parametrodois - parametroum;
        if(parametroum > parametrodois){
            throw new ParametrosInvalidosException();
        }
        else{
            for(int i = 1; i<=contagem ; i++){
                System.out.println("Imprimindo o numero: " + i);
            }
        }
        
    }
}