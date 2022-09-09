package EstruturaControle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "preta";
										//sistema de faixas de karate
		switch(faixa.toLowerCase()) {   // o faixa preta domina todas as técnicas
		case "preta":					//ao digitar a cor da faixa
			System.out.println(1);		//ele mostra todas as tecnicas que 
		case "marrom":					//ele domina
			System.out.println(2);
		case "roxa":
			System.out.println(3);
		case "verde":
			System.out.println(4);
		case "laranja":
			System.out.println(5);
		case "vermelha":
			System.out.println(6);
		case "branca":
			System.out.println(7);
			break;
			default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim!");
	}
}
