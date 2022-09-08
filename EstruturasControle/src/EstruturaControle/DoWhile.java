package EstruturaControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {
			System.out.println("Você precisa falar as "
					+ "palavras mágicas!");
					System.out.println("Você deseja sair?");
					texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("sair"));
		
		System.out.println("O programa foi finalizado!");
		entrada.close();
	}
}
