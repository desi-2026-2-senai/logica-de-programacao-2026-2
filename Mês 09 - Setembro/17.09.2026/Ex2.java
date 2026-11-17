import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor");
		int valor = input.nextInt();

		// O "if" agora usa o operador ">= " (maior ou igual).
		// Ele testa se o número é zero ou qualquer valor acima de zero.
		if (valor >= 0) {
			// Se o número for 0, 1, 2, 3... a condição é VERDADEIRA.
			System.out.println("Positivo");
		} else {
			// O "else" (senão) captura tudo o que sobrou.
			// Se não for maior ou igual a zero, só pode ser menor que zero (-1, -2, -3...).
			System.out.println("Negativo");
		}

	}

}
