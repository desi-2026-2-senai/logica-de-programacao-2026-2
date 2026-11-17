import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {
			System.out.println("Insira o " + (i + 1) + "º número");
			int numero = input.nextInt();

			if (numero % 2 == 0) {
				System.out.println("O número é par");
			} else {
				System.out.println("O número é ímpar");
			}
		}

	}
}
