import java.util.Scanner; // Importa a ferramenta para ler o que o usuário digita no teclado

public class Ex5 {
	public static void main(String[] args) {

		// Exemplo de alternativa ao vetor tradicional:
		// ArrayList<Integer> a = new ArrayList<Integer>();
		// a.indexOf(1);

		Scanner input = new Scanner(System.in);

		// DECLARAÇÃO E INICIALIZAÇÃO DO VETOR:

		int vetor[] = { 80, 12, 4, 60, 5 };

		System.out.println("Qual valor você deseja pesquisar");
		int valor = input.nextInt();

		// Variável de controle para guardar a posição (índice) onde o número está.
		// Começa com -1 porque não existe índice negativo em vetores.
		// Se continuar -1 no final, significa que o número não foi encontrado.
		int indice = -1;

		// PERCORRENDO O VETOR (Busca Linear):

		for (int i = 0; i < vetor.length; i++) {
			// 'vetor[i]' acessa o valor guardado na posição 'i'.
			// Compara se o valor da gaveta atual é igual ao valor que o usuário digitou:
			if (vetor[i] == valor) {
				indice = i; // Salva a posição (índice) onde o número foi encontrado
				break; // Encerra o laço 'for' imediatamente, pois já achamos o valor
			}
		}

		// VERIFICAÇÃO DO RESULTADO:
		// Se 'indice' mudou de -1 para outro número, o valor existe no vetor
		if (indice != -1) {
			System.out.println("Valor " + valor + " encontrado no índice " + indice);
		} else {
			System.out.println("Valor não encontrado");
		}

	}
}
