package operadoreslogicos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 85;
		
		System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 < 4);
		System.out.println(3 >= 4);
		System.out.println(3 <= 4);
		System.out.println(3 != 4);
		
		double nota = 7;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Este aluno recebeu desconto? " + temDesconto);
	}
}
