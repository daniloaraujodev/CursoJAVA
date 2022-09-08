package operadoreslogicos;

public class OperadorUnario {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // incrementa +1
		a--; // decrementa +1
		
		++a; // incrementa +1
		--a; // decrementa +1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio");
		System.out.println(++a == b--);
		// ++a é executado primeiro do que b-- - precedencia
		//ele fala que ta verdadeiro por que ele aumenta primeiro
		//para depois comparar o correto seria (a++ == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
