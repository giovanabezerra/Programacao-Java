import java.util.Scanner;

public class Avaliacao {
	 public static void main (String[] args) {
		 
		 //Declaração de variáveis 
		 Scanner leitor = new Scanner (System.in);
		 double notap1 = 0;
		 double notap2 = 0;
		 double notap3 = 0;
		 double notaSubstitutiva = 0;
		 double media = 0;
		 
		 //Entrada de dados
		 
		 System.out.print("Digite a nota da primeira prova:");
		 notap1 = leitor.nextDouble();
		 
		 System.out.print("Digite a nota da segunda prova:");
		 notap2 = leitor.nextDouble();
		 
		 System.out.print("Digite a nota da terceira prova:");
		 notap3 = leitor.nextDouble();
		 
		 //Processamento 
		 
		 media = ((notap1 + notap2 + notap3) / 3);
		 
		 //Saída de dados
		 
		 if (media >= 5) {
			 System.out.println ("PARABÉNS!! Vá beber para comemorar!");
		 } else { 
			 System.out.print ("Digite a nota da substitutiva:");
			 
			 notaSubstitutiva= leitor.nextDouble();
		if (notaSubstitutiva >= 5) {
			
			
			System.out.println ("PARABÉNS!! Vá beber para comemorar!"); 
		} else {
			System.out.println ("SE FODEU!! Tenta de novo ano que vem");
		}
		 }
		 
		 leitor.close();
		 
	 }
}
