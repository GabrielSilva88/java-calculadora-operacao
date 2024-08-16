/*		Escreva um programa que leia dois números inteiros
 *  	e um operador aritmético (+, -, *, /) e realize a operação correspondente. 
 *	 	Se o operador não for válido, mostre uma mensagem de erro.
 */
package calcularOperacoes;

import java.util.Scanner; 

public class CalculadoraOperacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digeite primeiro número: ");
		int numUm = scan.nextInt();

		System.out.println("Digite segundo número: ");
		int numDois = scan.nextInt();

		System.out.println(" Escolha a operação, + Somar, - subtrair, * multiplicar, / dividir \nDigite a opção: ");
		String operacao = scan.nextLine();

		switch (operacao) {
		case "+": {
			int soma = numUm + numDois;
			System.out.println(soma);
		}
		case "-": {
			int sub = numUm + numDois;
			System.out.println(sub);
		}
		case "*": {
			int mult = numUm + numDois;
			System.out.println(mult);
		}
		case "/": {
			double div = (double) numUm + numDois;
			System.out.println(div);
		}
		default:
			System.out.println("não é uma operação.");
			;
		}
		
		
		/* MODELO COM IF, ELSE IF E ELSE: 
		  	if (operacao.equals("+")) {
			System.out.println(numUm + numDois);
		}else if (operacao.equals("-")) {
			System.out.println(numUm - numDois);
		}else if (operacao.equals("*")) {	
			System.out.println(numUm * numDois);
		}else if (operacao.equals("/")) {
			System.out.println(numUm / numDois);
		}else {
			System.out.println("Não e uma operação.");
		}
		*/
	}
}
