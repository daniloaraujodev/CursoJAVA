package EstruturaControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Domingo é o primeiro dia da semana.");
		} else if(dia.equalsIgnoreCase("segunda")){
			System.out.println("Segunda é o segundo dia da semana");
		} else if(dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
			System.out.println("Terça é o terceiro dia da semana");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("Quarta é o quarto dia da semana");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("Quinta é o quinto dia da semana");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("Sexta é o sexto dia da semana");
		} else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")){
			System.out.println("Sábado é o sétimo dia da semana");
		} else {
			System.out.println("Você digitou um dia inválido");
		}
		
		entrada.close();
		//comparação de string usei .equalsIgnoreCase que ignora letra maiuscula
		//.toLowerCase pega a string e converte tudo para minusculo para evitar erros
		// exemplo ("domingo".equals(dia.toLowerCase()))
	}
}
