package EstruturaControle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua nota: ");
		double nota = entrada.nextDouble();
		
		if(nota < 0 && nota > 10 ) {
			System.out.println("Você digitou uma nota inválida");
		} else if(nota >= 9) {
			System.out.println("Sua nota é conceito A!");
		} else if(nota >= 7 && nota < 9) {
			System.out.println("Sua nota é conceito B!");
		} else if(nota <7 && nota >= 5) {
			System.out.println("Sua nota é conceito C");
		} else if(nota < 5 && nota >= 3) {
			System.out.println("Sua nota é conceito D");
		} else if(nota < 3 && nota >=0) {
			System.out.println("Sua nota é conceito E");
		}
		entrada.close();
	}
}
