package operations;

import java.util.Scanner;

public class CalculadoraSalario {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String valor1 = salario.next().replace(",",".");
		
		System.out.println("Digite o primeiro salário: ");
		String valor2 = salario.next().replace(",",".");
		
		System.out.println("Digite o primeiro salário: ");
		String valor3 = salario.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor3);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("você digitou os salários: %.2f | %.2f | %.2f ", salario1, salario2, salario3);
		System.out.printf("\nA sua média salarial é de R$ %.2f" , media);
	}
}
