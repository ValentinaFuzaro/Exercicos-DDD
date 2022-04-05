package estrutura_de_decisão;

import java.util.Scanner;

public class Ex11 {
	
	public static void main (String [] args) {
	
	    Scanner ler = new Scanner (System.in); 
	
	    double b, h, area;
	    
	    System.out.printf("Digite o valor da base do retângulo: ");
	    b = ler.nextDouble();
	    
	    System.out.printf("Digite o valor da altura do retângulo: ");
	    h = ler.nextDouble();
	     
	    area = b * h;
	    
	    if (area > 100) {
	    	System.out.printf("Terreno grande");
	    }
	}
}
