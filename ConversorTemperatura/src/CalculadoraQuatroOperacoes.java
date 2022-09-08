import java.util.Scanner;

public class CalculadoraQuatroOperacoes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação");
		System.out.println("+ para Adição");
		System.out.println("- para Subtração");
		System.out.println("* para Multiplicação");
		System.out.println("/ para Divisão");
		System.out.println("% para o Módulo resto da divisao");
		
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 :0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		entrada.close();
	}
}
