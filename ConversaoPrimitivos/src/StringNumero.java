import javax.swing.JOptionPane;

public class StringNumero {

	public static void main(String[] args) {
	
		String num1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String num2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		System.out.println(num1 + num2);
		
		double valor1 = Double.parseDouble(num1);//entra como String
		double valor2 = Double.parseDouble(num2);//Double.parseDouble converte em double
		
		double soma = valor1 + valor2;
		System.out.printf("%.2f", soma);
		
}
}
