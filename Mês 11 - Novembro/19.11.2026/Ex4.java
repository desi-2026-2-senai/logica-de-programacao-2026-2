public class Ex4 {
	public static void main(String[] args) {

		// 1. CRIAÇÃO DO VETOR (ARRAY)
		int vetor[] = { 80, 12, 4, 60, 5 };

		// 2. VARIÁVEIS DE CONTROLE
		// Para descobrir o maior e o menor número, começamos "chutando" que ambos
		// são o primeiro valor da lista (posição 0, que vale 80).
		int numeroMaior = vetor[0];
		int numeroMenor = vetor[0];

		// Variável acumuladora para somar todos os números.
		// Usamos 'double' (número com vírgula) para que a divisão da média seja exata
		// depois.
		double somaValores = 0;

		// 3. PERCORRENDO O VETOR (LAÇO DE REPETIÇÃO)
		// 'i' representa o índice (a posição atual que estamos olhando).
		// 'vetor.length' descobre automaticamente o tamanho do vetor (neste caso, 5).
		// O laço vai rodar enquanto 'i' for menor que 5 (ou seja, posições 0, 1, 2, 3 e
		// 4).
		for (int i = 0; i < vetor.length; i++) {

			// Verifica se o número na posição atual 'i' é maior que o recorde atual
			if (vetor[i] > numeroMaior) {
				numeroMaior = vetor[i]; // Atualiza o novo maior número
			}

			// Verifica se o número na posição atual 'i' é menor que o menor registrado até
			// agora
			if (vetor[i] < numeroMenor) {
				numeroMenor = vetor[i]; // Atualiza o novo menor número
			}

			// Pega o valor da posição atual e soma ao total acumulado
			// (É o mesmo que escrever: somaValores = somaValores + vetor[i];)
			somaValores += vetor[i];
		}

		// 4. CÁLCULO DA MÉDIA E EXIBIÇÃO
		double media = somaValores / vetor.length;

		// Mostra os resultados finais na tela
		System.out.println("Maior valor: " + numeroMaior);
		System.out.println("Menor valor: " + numeroMenor);
		System.out.println("Média: " + media);
	}
}
