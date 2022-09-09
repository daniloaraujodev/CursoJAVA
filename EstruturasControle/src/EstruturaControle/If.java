package EstruturaControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a média: ");
		String med = entrada.next().replace(",",".");
		double media = Double.parseDouble(med);
		
		if(media <=10 && media >= 7.0) {
			System.out.println("Parabéns! Você foi Aprovado!");
		} 
		if(media >10 && media < 0){
			System.out.println("Você digitou uma nota inválida.");
		} 
		if (media <7 && media == 5) {
			System.out.println("Você está de Recuperação");
		} 
		if (media <5) {
			System.out.println("Infelizmente você foi Reprovado.");
		}
		
		entrada.close();
		
	}
}
