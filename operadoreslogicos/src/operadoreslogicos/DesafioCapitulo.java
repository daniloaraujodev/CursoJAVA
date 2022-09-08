package operadoreslogicos;

import java.util.Scanner;

public class DesafioCapitulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		System.out.println(num1);
		
		System.out.println("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		System.out.println(num2);
		
		System.out.println("Informe a operação desejada: ");
		String operacao = entrada.next();
		
		// Logica usada equals para capturar a string digitada
		// interpretar e determinar a formula a ser calculada
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		// o equals faz a comparação da compatibilidade da string 
		// sem dar erro, se detecta a string correta ele executa a operação.
		entrada.close();
	}
}
