package estrutura_de_decisão;

import java.util.Scanner;

public class Ex12 {
	
	public static void main (String [] args) {
	
	   Scanner ler = new Scanner (System.in);
	   
	   double b, h, area;
	   
	   System.out.printf("Digite a base do retângulo: ");
	   b = ler.nextDouble();
	   
	   System.out.printf("Digite a altura do retângulo: ");
	   h = ler.nextDouble();
	   
	   area = b * h;
	   
	   if (area > 100) {
		  System.out.printf("Terreno grande");
	   } else {
		   System.out.printf("Terreno pequeno");
		   
	   }
		  
	   }
}
