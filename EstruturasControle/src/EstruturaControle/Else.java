package EstruturaControle;

import javax.swing.JOptionPane;

public class Else {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Este número é par");
		} else {
			System.out.println("Este número é ímpar");;
		}
	}
}
