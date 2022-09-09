package EstruturaControle;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		//Criar um programa que informa se o ano digitado é bissexto;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano para saber se ele é bissexto: ");
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0) {
			System.out.println(" Este ano é bissexto!");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println("Este é um ano bissexto!");
		} else {
			System.out.println("Este não é um ano bissexto!");
		}
	}
}
