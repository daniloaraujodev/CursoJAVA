// esta é uma expressão que foi pedido para transformar em codigo JAVA usando 
	// os operadores aritmeticos
	
	//([6*(3+2)]² - ((1-5*)*(2-7))²)³
	//----------- ------------------- 
	//   3*2               2
	// ----------------------------
	//            10³

package operadoresaritmeticos;

public class DesafioAritmetico {
	//esta foi a minha solução
public static void main(String[] args) {
	double a = 6 * (3 + 2);
	double b =  Math.pow(a, 2);
	double c = b / (3 * 2);
	
	double e = (1 - 5) * (2 - 7);
	double f = e / 2;
	double g =  Math.pow(f, 2);
	
	
	double h = c - g;
	double i =  Math.pow(h, 3);
	
	double j = 10;
	double k =  Math.pow(j, 3);
	
	double l = i / k;
	System.out.println(l);
	
	
	//esta foi a resolução do professor.
/*
 package aritmeticos;

public class DesafioAritmetico {
public static void main(String[] args) {

double numeradorA = Math.pow(6 * (3 + 2), 2);
double denominadorA = 3 * 2;

double numeradorB = (1 - 5 ) * (2 - 7);
double denominadorB = 2;

double superiorA = numeradorA / denominadorA;
double superiorB = Math.pow(numeradorB / denominadorB, 2);

double superior = Math.pow(superiorA - superiorB, 3);
double inferior = Math.pow(10, 3);
double resultado = superior / inferior;

	System.out.println("O resultado da expressão é " + resultado);

}
}
 */
	
}
}