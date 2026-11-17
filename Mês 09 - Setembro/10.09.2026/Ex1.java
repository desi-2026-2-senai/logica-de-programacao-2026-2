import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		// Cria um objeto Scanner para permitir que o programa
		// receba informações digitadas pelo usuário.
		Scanner input = new Scanner(System.in);

		// Exibe uma mensagem na tela pedindo o primeiro número.
		System.out.println("Insira o número 1");

		// nextInt() lê um número inteiro que o usuário digitou.
		// Esse valor é armazenado na variável numero1.
		int numero1 = input.nextInt();

		System.out.println("Insira o número 2");
		int numero2 = input.nextInt();

		// PROCESSAMENTO
		// Aqui o programa realiza uma operação matemática.
		// O valor de numero1 é somado ao valor de numero2.
		// O resultado é armazenado na variável soma.
		int soma = numero1 + numero2;

		// Calcula o produto (multiplicação) dos dois números.
		int produto = numero1 * numero2;

		// SAÍDA
		// Exibe o resultado da soma na tela.
		// O operador + também pode ser usado para juntar
		// um texto com o valor de uma variável.
		System.out.println("A soma entre os dois números é de " + soma);

		// Exibe o resultado da multiplicação na tela.
		System.out.println("O produto entre os dois número é de " + produto);
	}

}
