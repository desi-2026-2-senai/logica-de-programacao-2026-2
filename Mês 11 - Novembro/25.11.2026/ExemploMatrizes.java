public class ExemploMatrizes {
	public static void main(String[] args) {

		// VETOR (Revisão rápida): É como uma fila única com 4 "gavetas" numeradas de 0
		// a 3.
		int vetor[] = new int[4];

		// MATRIZ: Pense nela como uma tabela do Excel com LINHAS e COLUNAS.
		// O primeiro colchete [5] define a quantidade de LINHAS.
		// O segundo colchete [2] define a quantidade de COLUNAS.
		// Ou seja, temos uma tabela de 5 linhas por 2 colunas (10 espaços no total).
		int matriz[][] = new int[5][2];

		// PREENCHENDO A TABELA:
		// Regra de ouro na programação: a contagem sempre começa do ZERO!
		// Portanto, as 5 linhas são numeradas de 0 a 4, e as 2 colunas são 0 e 1.

		// Preenchendo a 1ª linha (índice 0)
		matriz[0][0] = 4; // Linha 0, Coluna 0 recebe 4
		matriz[0][1] = 5; // Linha 0, Coluna 1 recebe 5

		// Preenchendo a 2ª linha (índice 1)
		matriz[1][0] = 10; // Linha 1, Coluna 0 recebe 10
		matriz[1][1] = 209; // Linha 1, Coluna 1 recebe 209

		// Preenchendo a 3ª linha (índice 2)
		matriz[2][0] = -50; // Linha 2, Coluna 0 recebe -50
		matriz[2][1] = 40; // Linha 2, Coluna 1 recebe 40

		// Preenchendo a 4ª linha (índice 3)
		matriz[3][0] = 5; // Linha 3, Coluna 0 recebe 5
		matriz[3][1] = 2; // Linha 3, Coluna 1 recebe 2

		// Preenchendo a 5ª e última linha (índice 4)
		matriz[4][0] = 7; // Linha 4, Coluna 0 recebe 7
		matriz[4][1] = 8; // Linha 4, Coluna 1 recebe 8

		// MOSTRANDO A MATRIZ NA TELA:
		// Para ler uma tabela inteira, precisamos de dois laços de repetição (um dentro
		// do outro).

		// 1º Laço (variável 'i'): Controla as LINHAS (vai de 0 até 4).
		// 'matriz.length' descobre automaticamente quantas linhas a matriz tem (no
		// caso, 5).
		for (int i = 0; i < matriz.length; i++) {

			// 2º Laço (variável 'j'): Controla as COLUNAS da linha atual (vai de 0 até 1).
			// 'matriz[i].length' descobre quantas colunas existem naquela linha específica
			// (no caso, 2).
			for (int j = 0; j < matriz[i].length; j++) {
				// Imprime o valor na posição [linha][coluna] e dá um espaço.
				// Usamos 'print' (sem o 'ln') para os números ficarem lado a lado na mesma
				// linha.
				System.out.print(matriz[i][j] + " ");
			}

			// Quando termina de imprimir todas as colunas daquela linha,
			// este comando pula para a linha de baixo, formando o visual de tabela.
			System.out.println();
		}
	}
}
