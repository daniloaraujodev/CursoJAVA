package operadoreslogicos;

public class Operadorternario {

	public static void main(String[] args) {
		
		double media = 7;
		String resultadoParcial = media >= 5.0 ? "Em recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial; 
	
		System.out.println("O Aluno está " + resultadoFinal);
		
		double nota = 7;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.println("O Aluno receberá desconto no próximo período, por bom comportamento? " + resultado);
	}
}
