package estrutura_de_decisão;

import java.util.Scanner;

public class Ex018 {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double aceleração, inicial, tempo, velocidade;
		
		System.out.printf("Digite o valor da aceleração: ");
		aceleração = ler.nextDouble();
		
		System.out.printf("Digite o valor da velocidade inicial: ");
		inicial = ler.nextDouble();
		
		System.out.printf("Digite o tempo em segundos do percurso: ");
		tempo = ler.nextDouble();
		
		velocidade = inicial + aceleração * tempo;
		
		if (velocidade <= 40) {
			System.out.printf("Veículo muito lento.");
		} else if (velocidade > 40 && velocidade <= 60) {
			System.out.printf("Velocidade permitida.");
		} else if (velocidade > 60 && velocidade <= 80) {
			System.out.printf("Velocidade de cruzeiro.");
		} else if (velocidade > 80 && velocidade <= 120) {
			System.out.printf("Veículo rápido."); 
		} else if (velocidade > 120) {
			System.out.printf("Veículo muito rápido.");
		} else {
			
		}
				
	}
	
	

}
