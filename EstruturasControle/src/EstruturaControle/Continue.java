package EstruturaControle;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		//desta forma é outra possibilidade que pode ser feito
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) continue;
			System.out.println(i);
		}
		
	}
}
