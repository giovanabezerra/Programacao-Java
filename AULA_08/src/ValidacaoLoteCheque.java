import java.util.Scanner;
public class ValidacaoLoteCheque {
	public static void main (String[] args) {
		
		//Declaração de variáveis 
		Scanner leitor = new Scanner (System.in);
		double quantidadeChequesNoLote = 0;
		double somaValorCheques = 0;
		double valorLote = 0;
		int contadorCheques = 0;
		
		// Entrada de dados
		System.out.print("Informe a quantidade de " + 
						"cheques no lote: ");
		quantidadeChequesNoLote = leitor.nextInt();
		
		System.out.print("Informe o valor total do " +
						"lote: ");
		valorLote = leitor.nextDouble();
		
		do {
			//aqui repete várias vezes até finalizar 
			System.out.print("Informe o valor de cada " +
							"cheque individualmente: ");
			somaValorCheques += leitor.nextDouble();
			contadorCheques ++;
			
			System.out.print("Digite <0> para mais " + 
							"cheques ou <1> para sair: ");
			} while(leitor.nextInt() == 0);
		
		leitor.close();
		
		// Saída de dados
		if((quantidadeChequesNoLote == contadorCheques) &&
			(valorLote == somaValorCheques)) {
			System.out.println("PARABÉNS!! "
					+ "O lote é válido!");
		} else {
			System.out.println("FODEU!!! + "
					+ "Algum corno robou!");
			
		}
	}

}
