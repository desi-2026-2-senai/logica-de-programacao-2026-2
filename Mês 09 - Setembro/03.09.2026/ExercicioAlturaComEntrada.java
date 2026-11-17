import java.util.Scanner;

public class ExercicioAlturaComEntrada {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe a altura");
		double altura = input.nextDouble();

		System.out.println("Informe a largura");
		double largura = input.nextDouble();

		double perimetro = (altura + largura) * 2;

		double area = altura * largura;

		System.out.println("A área é de " + area);
		System.out.println("A largura é de " + largura);
	}

}
