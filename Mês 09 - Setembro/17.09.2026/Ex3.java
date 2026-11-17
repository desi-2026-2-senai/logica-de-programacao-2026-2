import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a quantidade de maçãs compradas");
		int macasCompradas = input.nextInt();

		// O "if" testa se o cliente comprou uma dúzia (12) ou mais maçãs.
		if (macasCompradas >= 12) {
			// Se comprou 12 ou mais, cada maçã custa R$ 1,00.
			// Criamos uma variável do tipo "double" porque o resultado pode ter casas
			// decimais.
			double valorCompra = 1 * macasCompradas;
			System.out.println(valorCompra);
		} else {
			// O "else" entra em ação se o cliente comprou menos de 12 maçãs (1 até 11).
			// Neste caso, não há desconto e cada maçã custa mais caro: R$ 1,30.
			double valorCompra = 1.3 * macasCompradas;
			System.out.println(valorCompra);
		}

	}

}
