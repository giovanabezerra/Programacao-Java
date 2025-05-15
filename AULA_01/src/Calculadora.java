import java.util.Scanner;

public class Calculadora {
     public static void main (String [] args) {
    	 //declaração de variáveis
    	 Scanner leitor = new Scanner (System.in);
    	 int numero1 = 0;
         int numero2 = 0;
    	 int resultado = 0; 
    			
    	 // Entrada de dados
    	 System.out.print("Digite o primeiro número");
    	 numero1 = leitor.nextInt();
    	
    	 System.out.print("Digite o segundo número");
    	 numero2 = leitor.nextInt();
    	
    	 leitor.close();
    	 //leitor.close é para fechar/interromper a comunicação entre o teclado e processador da máquina, e deixar a máquina mais rápida - Processamento
    	 
    	//Processamento
    	 resultado = (numero1 + numero2);
    	 
    	 // Saída de Dados
    	 System.out.println("O resultado da soma é: " + resultado);
    	 
     }
}
