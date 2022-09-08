package EstruturaControle;

public class DesafioIf {

	public static void main(String[] args) {

		double nota = 6;

		/*if (nota >= 9); {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!");
		}
		*/
		//havia um erro acima, foi colocado um ;
		//na estrutura de controle if logo apos o 
		//fechamento do parenteses
		
		if (nota >= 9) {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!");
		} 
		if(nota < 9 && nota >= 0) {
			System.out.println("Você não faz parte do quadro de honrarias.");
		} 
	}
}
