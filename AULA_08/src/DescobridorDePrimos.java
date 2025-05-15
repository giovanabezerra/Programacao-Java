
public class DescobridorDePrimos {
	public static void main(String[] args) {
		long candidatoPrimo = 0;
		
		while(true) {
			boolean ehPrimo = true;
			candidatoPrimo++;
			
			for (long i = 2 ; i < candidatoPrimo/2 ; i++) {
				if (candidatoPrimo % i == 0) {
					ehPrimo = false;
				}
			}
			if (ehPrimo) {
				System.out.println(candidatoPrimo);
			}
		}
	}
}
