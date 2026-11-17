import java.util.Scanner; // Importa a ferramenta para ler o que o usuário digitar no teclado

public class Ex2Avaliacao {

	public static void main(String[] args) {

		// Cria um leitor chamado "input" para capturar as entradas do teclado
		Scanner input = new Scanner(System.in);

		// Pede para o usuário digitar um número e armazena na variável "numero"
		System.out.println("Insira o número");
		int numero = input.nextInt();

		// Estrutura de repetição (Laço FOR) para fazer uma contagem regressiva:
		// 1. int i = numero; -> Cria uma variável de controle "i" que começa com o
		// valor digitado.
		// 2. i >= 0; -> O código vai continuar repetindo ENQUANTO o "i" for maior ou
		// igual a zero.
		// 3. i-- -> A cada repetição, diminui 1 do valor de "i" (subtração).
		for (int i = numero; i >= 0; i--) {
			// Mostra na tela o valor atual de "i" em cada passo da contagem
			System.out.println(i);
		}

	}

}
