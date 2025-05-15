	import java.util.Scanner;
public class ProcurarVetor {
	public static void main (String [] args) {
		
	//Declaração de variáveis 
	Scanner leitor = new Scanner(System.in);
	
	int[] vetor = new int [10];
	int valor = 0;
	int indice = 0;
	
	//Entrada de dados 
	for (int i = 0 ; i < vetor.length ; i++) {
		System.out.print("Digite o valor do índice " + i + " do vetor: ");
		vetor [i] = leitor.nextInt();
	}
	
	System.out.print("Digite um valor a ser pesquisado: ");
	valor = leitor.nextInt();
	
	leitor.close();
	
	//Processamento 
	indice = -1;
	for (int i = 0 ; i < vetor.length ; i++) {
		if (vetor [i] == valor) {
			indice = 1;
			break;
		}
	}
	//Saída de dados
	if (indice == -1) {
		System.out.println ("NÃO achei!");
	} else {
		System.out.println ("ACHEI PORRA!!! Na posição: " + indice);
	}
	}
}
