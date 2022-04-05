package estrutura_de_decisão;

import java.util.Scanner;

public class Ex10 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double a, b;
		
		System.out.printf("Digite um valor qualquer: ");
		a = ler.nextInt();
		
		System.out.printf("Digite outro valor qualquer: ");
		b = ler.nextInt();
		
		if (a > b) {
		  System.out.printf("O primeiro valor digitado é o maior");
		}else if(a == b) {
		  System.out.printf("Os valores são iguais");
		}
		else {
		  System.out.printf("O segundo valor digitado é o maior");
		}  			
	}
}
