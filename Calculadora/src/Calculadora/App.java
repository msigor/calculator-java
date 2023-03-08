package Calculadora;

import java.util.Scanner;

/*Author: Igor M. Santos*/

public class App {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		//Instaciação de objetos (objeto "calc")
		Calculadora calc = new Calculadora();
		Calculadora calc2 = new Calculadora();
		
		
		//Entrada de dados
		System.out.print("Digite o valor de x: ");
		calc.x = scanner.nextInt();
		System.out.print("Digite o valor de y: ");
		calc.y = scanner.nextInt();
		
		//Entrada de dados calc2
		System.out.print("Digite o valor de x para calc2: ");
		calc2.x = scanner.nextInt();
		System.out.print("Digite o valor de y para calc2: ");
		calc2.y = scanner.nextInt();
		
		//Chamada para método soma, passando como parametros valores de x e y
		
		System.out.println("");
		System.out.println("======= CALC 1 =======");
		
		calc.soma();
		calc.subtracao();
		calc.multiplicacao();
		calc.divisao();
		
		System.out.println("");
		System.out.println("======= CALC 2 =======");
		
		calc2.soma();
		calc2.subtracao();
		calc2.multiplicacao();
		calc2.divisao();
	}
}
