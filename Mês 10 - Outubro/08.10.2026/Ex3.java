import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double somaAlturas = 0;

		for (int i = 0; i <= 4; i++) {
			System.out.println("Insira a altura do atleta");
			double altura = input.nextDouble();
			somaAlturas += altura;
		}

		double media = somaAlturas / 5;

		System.out.println("A média das alturas é de " + media + " metros");

	}

}
