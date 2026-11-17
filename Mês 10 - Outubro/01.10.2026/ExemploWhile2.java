import java.util.Scanner;

public class ExemploWhile2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome de usuário");
		String nome = input.next(); // Inicialização

		while (!nome.equals("Henrique")) { // Condição
			System.out.println("Nome inválido!");
			System.out.println("Insira o nome de usuário");
			nome = input.next(); // Iteração
		}

		System.out.println("Seja bem vindo, " + nome);

	}

}
