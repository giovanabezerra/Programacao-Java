import java.util.Scanner;

public class PesquisaSocioeconomica {
public static void main (String[] args) {
		
		//Declaração de variáveis 
		Scanner leitor = new Scanner (System.in);
		double rendaFamiliar = 0;
		double tamanhoFamilia = 0;
		
		double qtdA = 0; 
		double qtdB = 0; 
		double qtdC = 0; 
		double qtdD = 0; 
		double qtdE = 0;
		
		double tamanhoPopulacao = 0;
		
		double classeSocial = 0;
		
		// Entrada de dados
		do {
			System.out.print("Informe a renda familiar: ");
			rendaFamiliar = leitor.nextDouble();
			
			System.out.print("Informe o tamanho da família:");
			tamanhoFamilia = leitor.nextDouble();

			classeSocial = (rendaFamiliar / tamanhoFamilia);
			tamanhoPopulacao += tamanhoFamilia;
			
			if (classeSocial > 10000) {
				qtdA += tamanhoFamilia;
			} else if (classeSocial > 5000) {
				qtdB += tamanhoFamilia;
			} else if (classeSocial > 2000) {
				qtdC += tamanhoFamilia;
			} else if (classeSocial > 1000) {
				qtdD += tamanhoFamilia;
				
			} else {
				qtdE += tamanhoFamilia;
			}

			System.out.print("Digite <1> se tiver mais família" + 
							" ou <0> para sair: ");
			
		} while(leitor.nextDouble() == 1);
		
		
		leitor.close();
		
		// Saída de dados
			System.out.println("Classe A" +
					((100 * qtdA) / tamanhoPopulacao));
			System.out.println("Classe B" +
					((100 * qtdB) / tamanhoPopulacao));
			System.out.println("Classe C" +
					((100 * qtdC) / tamanhoPopulacao));
			System.out.println("Classe D" +
					((100 * qtdD) / tamanhoPopulacao));
			System.out.println("Classe E" +
					((100 * qtdE) / tamanhoPopulacao));
			

}

}
