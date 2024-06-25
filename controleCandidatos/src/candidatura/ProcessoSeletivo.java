package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		imprimirSelecionados();
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE","MARCIA","JULIA", "PAULO","AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento:");
		
		for(int i = 0; i < candidatos.length ; i++) {
			System.out.println("O candidato de numero " + (i + 1) + " é  " + candidatos[i]);
		}
		
		System.out.println("Forma abreviada de interação for each");
		
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi : " + candidato);
		}
	}
	
	static void selecaoCandidatos(){
		String[] candidatos = {"FELIPE","MARCIA","JULIA", "PAULO","AUGUSTO","MONICA"
				,"FABRICIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + 
					" Solicitou este valor de salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1000,2200);
	}
	
	
	static void analisarCandidato(double salarioPretendido){
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido){
			System.out.println("Ligar para o candidato com contra proposta");
		}else{
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
		
	}
}
