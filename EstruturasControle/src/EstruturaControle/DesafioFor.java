package EstruturaControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		// nao pode usar valor int para controlar o laço
		//tem que usar string
		
		//==========
		// resposta
		//==========
		
		for(String v = "#"; !v.equals("######"); v += "#"){
				System.out.println(v); //enquanto v diferente equals #####
		}							   //ele vai realizar 
	}
}
