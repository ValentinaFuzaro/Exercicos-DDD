package estrutura_de_decisão;

import java.util.Scanner;

public class Ex019 {
	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double p1, p2, media;
		
		System.out.printf("Digite sua nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite sua nota da P2: ");
		p2 = ler.nextDouble();
		
		media = p1 + (p2 * p2) / 3;
		
		if (media >= 5) {
			System.out.printf("Sua média foi de %.1f. Você está APROVADO!", media);
		}else {
			System.out.printf("Sua média foi de %.1f. Você está REPROVADO!", media);
			
		}
		
	}

}
