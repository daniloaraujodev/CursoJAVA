package EstruturaControle;

import java.util.Scanner;

public class Desafio1 {
	
	//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		String num = entrada.next().replace(",",".");
		int numero = Integer.parseInt(num);
				
		if(numero >= 0 && numero <= 10) {			
		} else {
			System.out.println("Você digitou um número inválido!");
		}
		
		int resultado = numero % 2;
		
		if(numero > 0 && numero < 10 && resultado == 1) {
			System.out.printf("Você digitou o número %d e ele é ímpar", numero);
		}
		if(numero > 0 && numero < 10 && resultado == 0) {
			System.out.printf("Você digitou o número %d e ele é par", numero);
		}
		entrada.close();
	}
}
	

