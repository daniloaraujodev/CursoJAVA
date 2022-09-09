package EstruturaControle;

import java.util.Scanner;

public class DesafioDoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0; // armazena a quandidade de notas digitadas
		double nota = 0;           //armazena a nota
		double total = 0;		   //armazena nota + 1 nota
		
		while(nota != -1) {        //se for diferente de -1 ele continua repetindo
			System.out.println("Digite a nota / ou digite -1 para sair");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) { // se nota for menor = 10 ou maior que zero 
				total += nota;			  //ele continua executando, caso contrario
				quantidadeDeNotas++;      //ou a pessoa digitou algo errado
			} else if(nota != -1){
				System.out.println("Nota inválida!");
			}
		}
		
		double media = total / quantidadeDeNotas; // soma e dá a media
		System.out.printf("A média de nota da sala é: %.2f" , media);
		entrada.close();
	}
}
