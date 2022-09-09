package EstruturaControle;

public class BreakRotulado {

	public static void main(String[] args) {
		
		externo:
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if(i == 1) {
						break externo;// se nao usar rotulo o break vai 
					}				 //parar no laço interno e executará o laço externo 
					System.out.printf("[%d %d] " ,i ,j); // ao rotular o laço você controla  melhor o laço
				}
				System.out.println();
			}
		System.out.println("Fim!");
	}
}
