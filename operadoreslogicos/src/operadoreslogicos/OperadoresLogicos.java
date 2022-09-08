package operadoreslogicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		//TABELA VERDADE
		System.out.println("\n Tabela Verdade CONDIÇÃO");
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		System.out.println(!!condicao1);
		System.out.println(!!condicao2);
		
		//TABELA VERDADE E (AND)
		System.out.println("\n Tabela Verdade AND");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//TABELA VERDADE OU (OR)
		System.out.println("\n Tabela Verdade OR");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//TABELA VERDADE OU EXCLUSIVO (XOR)
		System.out.println("\n Tabela Verdade OU Exclusivo XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//TABELA VERDADE NOT 
		System.out.println("\n Tabela Verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
	
	}
}
