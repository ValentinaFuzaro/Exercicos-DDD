package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex08 {
	
	  public static void main (String [] args) {  
		  
	  Scanner ler = new Scanner(System.in); 
		  
	  int a, b;
		  
	  System.out.printf("Digite um valor: ");
	  a = ler.nextInt();
		  
	  System.out.printf("Digite outro valor: ");
	  b = ler.nextInt();
		  
		 if (a > b) {
		  System.out.printf("O primeiro valor inserido � o maior");
	  } else { 
		  System.out.printf("O segundo valor inserido � o maior");
	    }
	  }

}
