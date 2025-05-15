import java.util.Scanner;

public class VetorValoresMaiores {
	public static void main (String [] args) {
		
		//Declaração de variáveis 
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorOriginal = new int [10];
		int [] vetorMaior = new int [10];
		
		int limite = 0;
		int quantidade = 0;
		
		//Entrada de dados 
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
 			System.out.print("Digite o valor do índice " + i + ": ");
 			vetorOriginal [i] = leitor.nextInt();
		}
		
		System.out.print("Digite o valor limite: ");
		limite = leitor.nextInt();
		
		leitor.close();
		
		//Processamento 
		for (int i = 0 ; i < vetorOriginal.length ; i++) {
			if (vetorOriginal [i] > limite) {
				
			}
		}
		
		//Saída de dados 
		for (int i = 0 ; i < quantidade ; i++) {
			System.out.println("vetorMaior[" + i + "] = " + vetorMaior[i]);
			
			
		}
		}
	}	
