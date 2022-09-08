import java.util.Scanner;

public class PotenciaNumeros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um Número: ");
		String num1 = scanner.next().replace(",",".");
		double num = Double.parseDouble(num1);
		
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("Você digitou o número %.1f ", num);
		System.out.printf("\nO quadrado dele é %.1f ", quadrado);
		System.out.printf("\nO cubo dele é %.1f ", cubo);
		
		scanner.close();
	}

}