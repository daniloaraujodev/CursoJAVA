import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		
		Scanner area = new Scanner(System.in);
		System.out.println("Digite a base do triângulo: ");
		String base = area.next().replace(",",".");
		double baseT = Double.parseDouble(base);
		
		System.out.println("Digite a altura do triângulo: ");
		String alt = area.next().replace(",",".");
		double altura = Double.parseDouble(alt);
		
		double areaT = baseT * ( altura / 2 );
		
		System.out.println("A área do triângulo é: " + areaT);
		area.close();
	}
}
