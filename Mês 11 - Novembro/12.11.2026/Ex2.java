public class Ex2 {

	public static void main(String[] args) {

		// 1. INICIALIZAÇÃO DIRETA DO VETOR
		// Aqui já criamos o vetor e colocamos os valores dentro dele de uma vez.
		// O Java conta quantos números existem (6 números) e define o tamanho
		// automaticamente.
		int vetor[] = { 5, 7, 21, 64, 15, 21 };

		// 2. LAÇO NORMAL (DO INÍCIO AO FIM) - DESATIVADO
		// Este laço percorreria o vetor da posição 0 até a 5 (do 5 até o último 21).
		for (int i = 0; i < vetor.length; i++) {
			// System.out.println(vetor[i]);
		}

		// 3. LAÇO INVERTIDO (DO FIM PARA O INÍCIO)
		// Usado quando queremos ler o vetor de trás para frente.
		// - 'int i = vetor.length - 1': começa na ÚLTIMA posição. Como o tamanho é 6,
		// o último índice é 5 (6 - 1 = 5).
		// - 'i >= 0': continua repetindo enquanto não chegar na primeira posição
		// (índice 0).
		// - 'i--': diminui 1 do índice a cada volta (vai de 5 para 4, 3, 2, 1, 0).
		for (int i = vetor.length - 1; i >= 0; i--) {
			// Imprime o valor da posição atual, mostrando: 21, 15, 64, 21, 7, 5.
			System.out.println(vetor[i]);
		}

	}

}
