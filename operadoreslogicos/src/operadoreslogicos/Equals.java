package operadoreslogicos;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		System.out.println("2"=="2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // compara o conteudo
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // aqui da errado mesmo sendo igual
		System.out.println("2".equals(s2.trim())); //usando equals da certo
		
		//.trim() - ignora e retira espaço em branco para nao dar erros de digitação
		
		entrada.close();
		
		
		
	}
}
