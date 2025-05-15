import java.util.Scanner;
public class TrianguloAsteriscos {
	public static void main (String[] args) {
		
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int tamanhoTriangulo = 0;
		
		//Entrada de dados
		System.out.print("Digite o tamanho do triângulo:" );
		tamanhoTriangulo = leitor.nextInt();
		
		leitor.close();
		
		//Processamento
		if (tamanhoTriangulo <= 0) {
			System.out.println ("Vai se foder, porra!");
			return;
			//return - interrompe a execução
		}
		
		//Para cada dimensão, você tem que fazer um laço de repetição
		for (int i = 0 ; i < tamanhoTriangulo ; i++) { // Quantidade de coluna que vai impressa depende do numero da linha
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			// I representa a linha e j representa a coluna
			}
			System.out.println();
		}
		
		
}
}
