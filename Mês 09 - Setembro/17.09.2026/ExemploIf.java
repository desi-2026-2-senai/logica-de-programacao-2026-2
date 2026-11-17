import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira sua idade");
		int idade = input.nextInt();

		// INÍCIO DA ESTRUTURA IF (SE):
		// O operador ">=" significa "MAIOR OU IGUAL".
		// Aqui o programa verifica se a idade é 60, 61, 62, etc.
		if (idade >= 60) {

			// Se a idade for 60 ou mais (VERDADEIRO), executa este bloco
			System.out.println("Você já tem idade para tirar a carteirinha de idoso");

		} else { // ESTRUTURA ELSE (SENÃO):

			// Se a idade for menor que 60 (FALSO), o programa entra aqui por exclusão
			System.out.println("Você não tem idade para tirar a carteirinha");
		}

	}

}
