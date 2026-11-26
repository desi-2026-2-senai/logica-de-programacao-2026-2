public class Ex2 {
    public static void main(String[] args) {
        // Cria uma matriz 2x2 (2 linhas e 2 colunas) vazia, preenchida com zeros por padrão.
        // Em Java, os índices sempre começam em 0 (linhas 0 e 1; colunas 0 e 1).
        int[][] matriz = new int[2][2];

        // Atribui valores manualmente a cada posição [linha][coluna]:
        matriz[0][0] = 4;   // Linha 0, Coluna 0 (canto superior esquerdo)
        matriz[0][1] = 12;  // Linha 0, Coluna 1 (canto superior direito)
        matriz[1][0] = 2;   // Linha 1, Coluna 0 (canto inferior esquerdo)
        matriz[1][1] = -3;  // Linha 1, Coluna 1 (canto inferior direito)

        // Outra forma de criar e já preencher a matriz na mesma linha (atalho):
        // Cada par interno { ... } representa uma linha da matriz.
        int matriz2[][] = {
            { 4, 12 }, // Linha 0: 4 na coluna 0, 12 na coluna 1
            { 2, -3 }  // Linha 1: 2 na coluna 0, -3 na coluna 1
        };

        // Calcula o determinante de uma matriz 2x2: (diagonal principal) - (diagonal secundária)
        // Diagonal principal: matriz2[0][0] * matriz2[1][1] -> 4 * (-3) = -12
        // Diagonal secundária: matriz2[0][1] * matriz2[1][0] -> 12 * 2 = 24
        // Resultado: -12 - 24 = -36
        int determinante = (matriz2[0][0] * matriz2[1][1]) - (matriz2[0][1] * matriz2[1][0]);

        // Exibe o resultado final no console
        System.out.println("O determinante é " + determinante);
    }
}
