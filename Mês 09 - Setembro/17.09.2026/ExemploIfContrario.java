import java.util.Scanner;

public class ExemploIfContrario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira sua idade");
		int idade = input.nextInt();

		// INÍCIO DA ESTRUTURA IF (SE):
		// Aqui o programa verifica se a idade é menor que 60 (< 60)
		if (idade < 60) { // (idade <= 59) significa a mesma coisa

			// Se a condição acima for VERDADEIRA, executa este bloco
			System.out.println("Você não tem idade para tirar a carteirinha");

		} else { // ESTRUTURA ELSE (SENÃO):

			// Se a condição do "if" for FALSA (ou seja, 60 ou mais), executa este bloco
			System.out.println("Você já tem idade para tirar a carteirinha de idoso");
		}
	}

}
