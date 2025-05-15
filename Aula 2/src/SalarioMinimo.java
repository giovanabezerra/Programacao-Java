
import java.util.Scanner;

     public class SalarioMinimo {
         public static void main (String[] args) {
        	 //Declaração de variáveis 
        	 Scanner leitor = new Scanner (System.in);
        	 double salario = 0;
        	 double qtdSalariosMinimos = 0;
        	 
        	 //Entrada de dados
        	 System.out.print("Digite o seu salário:");
        	 
        	 //Esse é para número quebrado
        	 salario = leitor.nextDouble();
        	 
        	 // Aviso ao computador que não precisa esperar mais para ele processoar mais rápido
        	 leitor.close();
        	 
        	 //Processamento 
        	 qtdSalariosMinimos = (salario / 1518);
        			 
        	// Saída de dados
        	 System.out.println ("A quantidade de salários mínimos é:" + qtdSalariosMinimos);
        	 
         }
}
