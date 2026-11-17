import java.util.Scanner;

public class ExPrecoComEntrada {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o preço do produto 1");
		double preco1 = input.nextDouble();

		System.out.println("Informe o preço do produto 2");
		double preco2 = input.nextDouble();

		double totalCompra = preco1 + preco2;

		System.out.println("O valor da compra foi de R$ " + totalCompra);

	}

}
