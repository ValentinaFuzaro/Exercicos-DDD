package estrutura_de_decisão;

import java.util.Scanner;

public class Ex13 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextInt();
		
		if (a > b) {
			if (a > c) {
			System.out.printf("O primeiro valor inserido é o maior.");
			}
			else {
				System.out.printf("O terceiro valor inserido é o maior.");
			}
		}
		else {
			if (b > c) {
			System.out.printf("O segundo valor inserido é o maior.");
		}
	    else {
			System.out.printf("O terceiro valor inserido é o maior.");
		}
	}
	}
}