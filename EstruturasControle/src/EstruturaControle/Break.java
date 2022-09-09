package EstruturaControle;

import java.util.Iterator;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {// i = 0 enquanto for menor que 10
									//ele executa o laço
			if(i == 5) {	//se for = a 5 ele para o laço e mostra o resultado
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Fim!");
		
	}
}

