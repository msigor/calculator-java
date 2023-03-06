package Calculadora;

import java.util.Scanner;

/*Author: Igor M. Santos*/

public class Calculadora {
	
	//Processar procura primeiro na (main) se não encontrar ela procura na (class)
	
	//Declaração de variáveis de classe
	static int x,y;
	static int soma;
	static int subtracao;
	static int divisao;
	static int multiplicacao;
	
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Digite o valor de x: ");
		x = scanner.nextInt();
		System.out.print("Digite o valor de y: ");
		y = scanner.nextInt();
		
		//Chamada para método soma, passando como parametros valores de x e y
		soma();
		subtracao();
		multiplicacao();
		divisao();
	}

	private static void soma() {
	
		//Processo
		soma = x+y;
		
		//saída
		System.out.println(("Soma: " +soma));
		
	}
	
	private static void subtracao() {


		
		//Processo
		subtracao = x-y;
		
		//saída
		System.out.println(("Subtracao: " +subtracao));
		
	}
	
	private static void multiplicacao() {


		
		//Processo
		multiplicacao = x*y;
		
		//saída
		System.out.println(("Multiplicacao: " +multiplicacao));
		
	}

	private static void divisao() {

		
		//Processo
		divisao = x/y;
		
		//saída
		System.out.println(("Divisao: " +divisao));
		
	}
}
