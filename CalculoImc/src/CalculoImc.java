import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		
		Scanner imc = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		String alt = imc.next().replace(",", ".");
		double altura = Double.parseDouble(alt);
		
		System.out.println("Digite seu peso: ");
		String peso = imc.next().replace(",",".");
		double kg = Double.parseDouble(peso);
		
		double massa = kg / (altura * altura);
		
		System.out.printf("Seu índice de massa corporal é: %.2f", massa);
		
		imc.close();
		
	}
}
