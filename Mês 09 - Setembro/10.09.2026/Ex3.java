import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// ENTRADA
		// Exibe uma mensagem na tela pedindo para o usuário
		// informar um valor em dólares.
		System.out.println("Insira o valor em dólares");

		// nextDouble() lê um número que pode possuir casas decimais.
		// O valor digitado é armazenado na variável valorDolar.
		//
		// Usamos "double" porque o valor pode ser decimal.
		// Exemplo: 10.50 dólares.
		double valorDolar = input.nextDouble();

		// PROCESSAMENTO
		// Aqui fazemos a conversão de dólares para reais.
		//
		// Neste exercício, estamos considerando que:
		//
		// 1 dólar = R$ 5,20
		//
		// Por isso, multiplicamos o valor em dólares por 5.2.
		//
		// Exemplo:
		// Se valorDolar = 10
		//
		// valorFinal = 10 * 5.2
		// valorFinal = 52
		//
		// O resultado é armazenado na variável valorFinal.
		double valorFinal = valorDolar * 5.2;

		// SAÍDA
		System.out.println("O valor devolvido é de: R$" + valorFinal);

	}

}
