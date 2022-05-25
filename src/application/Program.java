package application;

import java.util.Scanner;

import entities.Comportamento;
import entities.MoverParaDireita;
import entities.MoverParaEsquerda;
import entities.MoverParaFrente;
import entities.MoverParaTras;
import entities.PermanecerParado;
import entities.Robo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Comportamento parado = new PermanecerParado();
		Comportamento frente = new MoverParaFrente();
		Comportamento atras = new MoverParaTras();
		Comportamento direita = new MoverParaDireita();
		Comportamento esquerda = new MoverParaEsquerda();
		
		Robo robo = new Robo();
		
		int soma = 0;
		
		System.out.println("Que movimento deseja realizar? \n"
				+ "Digite 1 para permanecer parado \n"
				+ "Digite 2 para mover para frente \n"
				+ "Digite 3 para mover para trás \n"
				+ "Digite 4 para mover para direita \n"
				+ "Digite 5 para mover para esquerda");
		int movimento = sc.nextInt();
		
		while (movimento > 5 || movimento < 1) {
			System.out.println("movimento inválido, digite novamente:");
			movimento = sc.nextInt();
		}
		
		if(movimento == 1) {
			robo.setComportamento(parado);
			robo.mover();
			System.out.println("Fim do turno.");
			}
		if(movimento != 1) {
			System.out.println("Quantas casas gostaria de andar?");
			int n = sc.nextInt();
			
	
			if(movimento == 2 ) {
				for(int i=1; i<=n; i++) {
					soma += 1;
				}
				robo.setComportamento(frente);
			}	
			else if(movimento == 3 ) {
				for(int i=1; i<=n; i++) {
					soma += 1;
				}
				robo.setComportamento(atras);
			}
			else if(movimento == 4) {
				for(int i=1; i<=n; i++) {
					soma += 1;
				}
				robo.setComportamento(direita);
			}
			else if(movimento == 5) {
				for(int i=1; i<=n; i++) {
					soma += 1;
				}
				robo.setComportamento(esquerda);
			}
			
			if(movimento != 1)
				System.out.print("Você se moveu " + n + " casas para ");
				robo.mover();
	
			System.out.println("Fim do turno.");
		}
		sc.close();
	}

}
