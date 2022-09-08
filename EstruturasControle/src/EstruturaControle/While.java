package EstruturaControle;

public class While {  //While - laço de repetição ate que se cumpra o que se pede

	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}
		while(contador <= 20) {
			System.out.printf("D = %d\n", contador);
			contador++;
		}
		while(contador <= 50) {
			System.out.printf("H = %d\n", contador);
			contador+=2;
		}
	}
}
