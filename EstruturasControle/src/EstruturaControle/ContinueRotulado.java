package EstruturaControle;

public class ContinueRotulado {

	public static void main(String[] args) {
		
		externo:
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if(i == 1) {
						continue externo;// esse rotulo do continue vai ser executado no laço de fora
					}				 //o laço de dentro vai parar no momento em que for == 1 vai pular o 1 e prosseguir
					System.out.printf("[%d %d] " ,i ,j); // e nao vai continuar
				}
				System.out.println();
			}
		System.out.println("Fim!");
	}
}
