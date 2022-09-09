package EstruturaControle;

import java.util.Scanner;

public class Desafio3 {
//Criar um programa que receba duas notas parciais, calcular a média final. /
//Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
//caso contrário imprime no console "Reprovado".
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		String valor1 = entrada.nextLine().replace(",",".");
		double nota1 = Double.parseDouble(valor1);
		
		if(nota1 > 10 || nota1 < 0 ) {
			System.out.println("Você digitou uma nota inválida");
		}
		
		System.out.println("Digite a primeira nota: ");
		String valor2 = entrada.nextLine().replace(",",".");
		double nota2 = Double.parseDouble(valor1);
		
		if(nota2 > 10 || nota2 < 0 ) {
			System.out.println("Você digitou uma nota inválida");
		}
	
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7 && media <= 10) {
			System.out.println("Você foi Aprovado!");
		} else if(media <7 && media >= 4) {
			System.out.println("Você está de recuperação");
		} else if(media >= 0 && media < 4) {
			System.out.println("Você foi reprovado");
		}
		
		entrada.close();
	}
}

/*
 * 	System.out.println("Digite a segunda nota: ");
		String valor2 = entrada.next().replace(",",".");
		double nota2 = Double.parseDouble(valor2);
			
		if(nota2 > 10 || nota2 < 0) {
			System.out.println("Você digitou uma nota inválida");
			return;
		}
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Você foi Aprovado!");
		} else if(media <7 && media >= 4) {
			System.out.println("Você está de recuperação");
		} else if(media >= 0 && media < 4) {
			System.out.println("Você foi reprovado");
		}
		*/
