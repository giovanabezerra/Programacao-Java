import java.util.Scanner;

public class VolumeDaEsfera {

       public static void main (String [] args) {
	 
	 // Declaração de variáveis - sempre começo essa 
	 Scanner leitor = new Scanner (System.in);
	 double raio = 0;
	 double volume = 0;
       
	 
	 // Entrada de dados
	 System.out.print("Digite o raio:");
	 
	 //Sempre coloco isso se ele for escrever
	raio = leitor.nextDouble();
	 
       leitor.close();
       
       //Processamento - macth.PI já é uma variável que calcula o pi
   	 volume = ((4 * Math.PI * Math.pow(raio, 3)) / 3);

   	 // Saída de dados - sempre coloco o + mais o nome do meu processamento
	 System.out.println("O volume é" + volume);
  
       }
	 


}
