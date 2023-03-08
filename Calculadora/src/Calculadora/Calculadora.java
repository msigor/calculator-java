package Calculadora;

import java.util.Scanner;

/*Author: Igor M. Santos*/

public class Calculadora {

	// Processador procura primeiro na (main) se não encontrar ela procura na (class)

	// Declaração de variáveis de classe
	int x, y;
	int soma;
	int subtracao;
	int divisao;
	int multiplicacao;

	public  void soma() {

		// Processo
		soma = x + y;

		// saída
		System.out.println(("Soma: " + soma));
	}

	public  void subtracao() {

		// Processo
		subtracao = x - y;

		// saída
		System.out.println(("Subtracao: " + subtracao));

	}

	public  void multiplicacao() {

		// Processo
		multiplicacao = x * y;

		// saída
		System.out.println(("Multiplicacao: " + multiplicacao));

	}

	public  void divisao() {

		// Processo
		divisao = x / y;

		// saída
		System.out.println(("Divisao: " + divisao));

	}
}
