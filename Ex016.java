package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex016 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double a, b, c;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextDouble();
		 
		if ((a*a) == (b*b)+(c*c) || (b*b) == (a*a) + (c*c) || (c*c) == (b*b) + (a*a)) {
			System.out.printf("� um tri�ngulo ret�ngulo.");
		}else {
			System.out.printf("N�o � um tri�ngulo ret�ngulo.");
		}
		}
			
	}
	
