import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor");
		int valor = input.nextInt();

		// INÍCIO DA ESTRUTURA CONDICIONAL (IF / ELSE)
		// O "if" testa uma condição: "o valor digitado é maior que 10?"
		if (valor > 10) {
			// Se a resposta para a pergunta acima for SIM (verdadeira),
			// o programa executa esta linha:
			System.out.println("É MAIOR QUE 10!");

		} else {
			// A palavra "else" significa "senão".
			// Se a resposta para a pergunta do "if" for NÃO (falsa),
			// ou seja, se o valor for 10 ou menor, o programa executa esta linha:
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		// FIM DA ESTRUTURA CONDICIONAL
	}
}
