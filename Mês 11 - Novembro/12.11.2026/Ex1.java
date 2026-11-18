public class Ex1 {
	public static void main(String[] args) {

		// 1. DECLARAÇÃO E CRIAÇÃO DO VETOR
		int numeros[] = new int[100];

		// 2. LAÇO DE REPETIÇÃO PARA PREENCHER E LER O VETOR
		// Usamos o 'for' para percorrer todas as posições do vetor, uma por uma.
		// - 'int i = 0': cria a variável 'i' (índice) começando na primeira gaveta (0).
		// - 'i < numeros.length': repete enquanto 'i' for menor que o tamanho total do
		// vetor (100).
		// Dica: '.length' descobre automaticamente o tamanho do vetor, evitando erros.
		// - 'i++': avança para a próxima gaveta (+1) a cada volta do laço.
		for (int i = 0; i < numeros.length; i++) {

			// 3. GUARDANDO UM VALOR NO VETOR
			numeros[i] = i * i;

			// 4. LENDO E EXIBINDO O VALOR
			System.out.println(numeros[i]);
		}
	}
}
