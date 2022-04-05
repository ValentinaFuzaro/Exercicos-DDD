package estrutura_de_decisão;

import java.util.Scanner;

public class Ex015 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextDouble(); 
		
		if (a + b > c && a + c > b && b + c > a) {
			if(a != b && a != c && b != c) { 
			System.out.printf("Triângulo escaleno.");
		}else if(a == b && a != c || b == c && b != a || c == a && c != b){
			System.out.printf("Triângulo isósceles.");
		}else { 
			System.out.printf("Triângulo equilátero.");
		}
		}else { 
			System.out.printf("Isto não é um triângulo.");
		}
			
	}
			
}
			
