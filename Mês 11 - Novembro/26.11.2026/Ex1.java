public class Ex1 {
	public static void main(String[] args) {

		// DECLARAÇÃO DA MATRIZ
		// Uma matriz funciona como uma tabela com linhas e colunas.
		// Aqui criamos uma matriz de números inteiros (int) chamada 'matrizLucros'.
		// [12] -> Quantidade de LINHAS (representando os 12 meses do ano).
		// [2] -> Quantidade de COLUNAS (coluna 0 para o número do mês, coluna 1 para o
		// valor do lucro).
		int matrizLucros[][] = new int[12][2];

		// PREENCHIMENTO DA MATRIZ
		// Regra de ouro: Em Java, a contagem das posições (índices) sempre começa no
		// ZERO!
		// Portanto, 12 linhas vão do índice 0 ao 11, e 2 colunas vão do índice 0 ao 1.

		// Linha 0 (1º registro - Janeiro)
		matrizLucros[0][0] = 1; // Linha 0, Coluna 0: guarda o número do mês (1)
		matrizLucros[0][1] = 15000; // Linha 0, Coluna 1: guarda o lucro de janeiro (15000)

		// Linha 1 (2º registro - Fevereiro)
		matrizLucros[1][0] = 2; // Linha 1, Coluna 0: mês 2
		matrizLucros[1][1] = 12300; // Linha 1, Coluna 1: lucro 12300

		// Linha 2 (3º registro - Março)
		matrizLucros[2][0] = 3;
		matrizLucros[2][1] = 18450;

		// Linha 3 (Abril)
		matrizLucros[3][0] = 4;
		matrizLucros[3][1] = 14200;

		// Linha 4 (Maio)
		matrizLucros[4][0] = 5;
		matrizLucros[4][1] = 21000;

		// Linha 5 (Junho)
		matrizLucros[5][0] = 6;
		matrizLucros[5][1] = 19800;

		// Linha 6 (Julho)
		matrizLucros[6][0] = 7;
		matrizLucros[6][1] = 17500;

		// Linha 7 (Agosto)
		matrizLucros[7][0] = 8;
		matrizLucros[7][1] = 16900;

		// Linha 8 (Setembro)
		matrizLucros[8][0] = 9;
		matrizLucros[8][1] = 20100;

		// Linha 9 (Outubro)
		matrizLucros[9][0] = 10;
		matrizLucros[9][1] = 22500;

		// Linha 10 (Novembro)
		matrizLucros[10][0] = 11;
		matrizLucros[10][1] = 28900;

		// Linha 11 (Último registro - Dezembro)
		matrizLucros[11][0] = 12;
		matrizLucros[11][1] = 35400;

		// LEITURA E EXIBIÇÃO DOS DADOS
		// Usamos um laço de repetição 'for' para percorrer a matriz linha por linha.
		// 'matrizLucros.length' retorna o total de LINHAS da matriz (neste caso, 12).
		// A variável 'i' vai variar de 0 até 11, funcionando como o índice da linha
		// atual.
		for (int i = 0; i < matrizLucros.length; i++) {

			// A cada volta do laço, acessamos a linha 'i' e pegamos os valores das colunas
			// fixas [0] e.
			System.out.println("No mês " + matrizLucros[i][0] + " teve um lucro de R$" + matrizLucros[i][1]);
		}
	}
}
