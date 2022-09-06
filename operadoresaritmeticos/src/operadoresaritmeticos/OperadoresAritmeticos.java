package operadoresaritmeticos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		System.out.println(2+3);
		
		var x = 34.56;
		double y = 2.2;
		
		//4 operações padrão para valores double / float
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		//4 operações padrao para valores inteiros - divisao sem casa decimal 
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // divisão com numero inteiro
		System.out.println(a / (double)b); // divisao com conversão para mostrar o resto da divisao
		
		//operador de modulo para mostrar o resto da divisão o modulo faz um % entre os valores da divisão
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		// exemplo de uma operação mais complexa e com precedencia
		//a multiplicação e a divisao sempre serão feitas primeiro
		System.out.println(x + y - a * b);
		
		// como colocar e calcular uma potencia colocar um 2² por exemplo 
		
		int t = 3 * 4 - 10;
		//int u = Math.pow(t,3); essa função de potencia o resultado sairá em Double
		//como a variavel esta definida INT precisa fazer um cast como abaixo.
		int u = (int) Math.pow(t,3); //divisao inteira
		double s = Math.pow(t,3); //divisao mostrando casa decimal double/float
		System.out.println(t);
		System.out.println(u);
		System.out.println(s);
	}

}