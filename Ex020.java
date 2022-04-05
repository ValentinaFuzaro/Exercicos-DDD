package estrutura_de_decisão;

import java.util.Scanner;

public class Ex020 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double p1, p2;
		
		System.out.printf("Digite sua nota da P1: ");
		p1 = ler.nextDouble();
		
		p2 = ((5*3) - p1)/2;
		
		if(p1 >= 0) {
			System.out.printf("Você precisa tirar pelo menos %.1f", p2);
			System.out.printf(" na P2 para ser APROVADO!");
		}
	}

}
