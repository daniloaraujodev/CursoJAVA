import java.util.Scanner;

public class CelsiusFarnheit {

	public static void main(String[] args) {
		
		Scanner temperatura = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		String tempC = temperatura.next().replace(",", ".");
		double temp = Double.parseDouble(tempC);
		
		double farenheit = (temp * 9/5) + 32;
		
		System.out.printf("A temperartura %.1fºC \ncorresponde a %.1fºF", temp, farenheit);
		
		
	}
}
