import java.util.Scanner;
public class inversaoVetor {

			public static void main(String[] args) {
				
				//Declaração de variaveis 
			Scanner leitor = new Scanner (System.in);
			int[] vetorOriginal = new int [5];
			int [] vetorInvertido = new int [5];
			
			//Entrada de dados 
			for (int i = 0; i < vetorOriginal.length ; i++) {
				System.out.print("Digite o valor do indice "+ i + " do vetor: ");
				vetorOriginal[i] = leitor.nextInt();
				
			}
			
			leitor.close();
			
			//Processamento 
			for (int i = (vetorOriginal.length - 1) ; i >= 0; i--) {
				vetorInvertido [vetorOriginal.length - 1- i] = vetorOriginal [i];
			}
			//Saída de dados 
			
				for (int i = 0 ; i <vetorInvertido.length ; i++) {
					System.out.println("vetorInvertido[" + i +"] = " + vetorInvertido [i]);
			}
			}
	}

