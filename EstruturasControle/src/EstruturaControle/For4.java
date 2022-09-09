package EstruturaControle;

public class For4 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) { //for dentro do outro com duas variaveis
			for(int j = 0; j < 10; j++) { // conta de 0 a 99 
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}
