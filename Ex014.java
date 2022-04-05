package estrutura_de_decisão;

import java.util.Scanner;

public class Ex014 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc < 19) {
			System.out.printf("Você não está no peso ideal.");
		} else {
			System.out.printf("Você está no peso ideal.");
	
		}
		
		
	}
}
