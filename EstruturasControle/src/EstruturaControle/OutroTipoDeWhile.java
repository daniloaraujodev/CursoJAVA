package EstruturaControle;

import java.util.Scanner; 			//esse while repete por tempo indeterminado
									//ate que digite sair
public class OutroTipoDeWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) { 	//negação enquanto nao for sair
			System.out.println("Você diz: ");		//nao desliga
			valor = entrada.next();
			
		}
		
		entrada.close();
	}
}
