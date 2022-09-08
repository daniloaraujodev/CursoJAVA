package operadoreslogicos;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		c = c + b; // pode ser feito assim c+= b;
		c = c - b; // pode ser feito assim c-= b;
		c = c * b; // pode ser feito assim c *= b;
		c = c / b; // pode ser feito assim c /= b;
		c = c % 2; // % = 2 se der 0 é par se der 1 é impar
		c = c + 1; // c++ incrementa - atribui +1
		c = c - 1; // c-- incrementa - atribui -1
	}

}
