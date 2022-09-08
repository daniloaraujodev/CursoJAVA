import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		Scanner temperatura = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		String temperaturaF = temperatura.next().replace("," , ".");
		double temp = Double.parseDouble(temperaturaF);
		
		
		double celsius = (temp - 32) * 5 / 9;
		System.out.printf("A temperatura %.2f ºF", temp);
		System.out.printf("\nCorresponde a %.2f ºC" , celsius);
		
		temperatura.close();
	}
}
