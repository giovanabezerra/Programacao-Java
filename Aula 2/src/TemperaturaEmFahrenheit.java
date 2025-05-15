import java.util.Scanner;

public class TemperaturaEmFahrenheit {
	
	// Cógido para o java saber que isso não é classe, é um prgrama 
     public static void main (String [] args) {
    	 
    	 //Declaração de variáveis - sempre começo essa 
    	 Scanner leitor = new Scanner (System.in);
    	 //Váriavel inicia sempre com minuscula para não confundir com classe, e se for duas palavras, você pode colocar letra maiuscula 
    	 double temperaturaCelsius = 0;
    	 double temperaturaFahrenheit = 0; 
    	 
    	 // Entrada de dados - para melhorar essa programação colocar syso CTRL + barra de espaço
    	 System.out.print("Digite a temperatura em graus Celsius:");
    	 temperaturaCelsius = leitor.nextDouble();
    	 
    	 leitor.close();
    	 
    	 // Processamento
    	 temperaturaFahrenheit = (((9 * temperaturaCelsius) / 5) + 32);
    	 
    	 // Saída de dados 
    	 System.out.println("A temperatura em gringo é:" + temperaturaFahrenheit);
    			 
     }
}
