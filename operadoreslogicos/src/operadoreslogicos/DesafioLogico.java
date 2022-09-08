package operadoreslogicos;

public class DesafioLogico {

	public static void main(String[] args) {
		
		//se terça 
		// se quarta 
		// se os dois / comprar tv 50 polegadas
		// se um dos dois der certo comprar tv de 32 polegadas
		// se comprar tv de 50 ou 32 toma sorvete 
		
		boolean terca = false;
		boolean quarta = false;
		
		boolean TV50 = terca && quarta;
		System.out.println("Foi ao shoping e comprou TV 50? " + TV50);
		
		boolean TV32 = terca ^ quarta;
		System.out.println("Foi ao shopping e comprou TV 32? " + TV32);
		
		boolean SORVETE = terca || quarta;
		System.out.println("Foi ao shopping e tomou sorvete!" + SORVETE);
		
		//operador unario
		boolean maisSaudavel = !SORVETE; // operador unario 
		System.out.println("Não tomou sorvete e está + saudável!" + maisSaudavel);
	}
}
