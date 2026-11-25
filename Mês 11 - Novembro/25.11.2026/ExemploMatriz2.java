public class ExemploMatriz2 {

	public static void main(String[] args) {

		// Cria uma tabela (matriz) com 4 LINHAS (índices 0 a 3) e 5 COLUNAS (índices 0
		// a 4).
		// Ao todo, temos 20 espaços vazios (4 x 5 = 20) prontos para guardar números
		// inteiros.
		int matriz[][] = new int[4][5];

		// Criamos uma variável comum para gerar números em sequência (1, 2, 3, 4...).
		// Ela vai servir para preencher nossa tabela automaticamente sem precisarmos
		// digitar tudo na mão.
		int contador = 1;

		// =========================================================================
		// ETAPA 1: PREENCHENDO A MATRIZ AUTOMATICAMENTE
		// =========================================================================

		// O laço de fora (variável 'i') escolhe qual LINHA vamos preencher no momento
		// (de 0 a 3).
		for (int i = 0; i < matriz.length; i++) {

			// O laço de dentro (variável 'j') percorre todas as COLUNAS daquela linha (de 0
			// a 4).
			// Dica: Enquanto 'i' está parado na linha 0, o 'j' anda por todas as colunas
			// (0, 1, 2, 3, 4).
			for (int j = 0; j < matriz[i].length; j++) {

				// Guarda o valor atual do 'contador' dentro da célula [linha][coluna]
				matriz[i][j] = contador;

				// Soma +1 no contador para que a próxima célula receba o próximo número
				contador++;
			}
		}

		// =========================================================================
		// ETAPA 2: MOSTRANDO A MATRIZ NA TELA
		// =========================================================================

		// Agora que a tabela está cheia, usamos exatamente a mesma estrutura de laços
		// para ler e imprimir.
		for (int i = 0; i < matriz.length; i++) {

			// Percorre cada coluna da linha atual
			for (int j = 0; j < matriz[i].length; j++) {
				// Imprime o número guardado naquela posição + um espaço em branco para não
				// grudar
				System.out.print(matriz[i][j] + " ");
			}

			// Quando termina de imprimir todas as 5 colunas da linha, pula para a linha de
			// baixo
			System.out.println();
		}

	}

}
