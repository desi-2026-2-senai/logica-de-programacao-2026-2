public class Ex3 {
    public static void main(String[] args) {
        // Declara e cria a primeira matriz (2 linhas e 3 colunas) com valores iniciais.
        // Os índices começam em 0: linha 0 é {1, 2, 3} e linha 1 é {4, 5, 6}.
        int matriz1[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };

        // Declara e cria a segunda matriz (também com 2 linhas e 3 colunas).
        int matriz2[][] = {
            { 7, 8, 9 },
            { 10, 11, 12 }
        };

        // Cria uma nova matriz vazia para guardar o resultado da soma.
        // matriz1.length pega a quantidade de linhas (2).
        // matriz1[0].length pega a quantidade de colunas da primeira linha (3).
        int matrizSoma[][] = new int[matriz1.length][matriz1[0].length];

        // Laço externo ('i'): percorre cada linha da matriz (de 0 até 1).
        for (int i = 0; i < matriz1.length; i++) {
            // Laço interno ('j'): percorre cada coluna da linha 'i' (de 0 até 2).
            for (int j = 0; j < matriz1[i].length; j++) {
                // Soma os elementos que estão na mesma posição [linha i][coluna j]
                // e salva o resultado na matrizSoma.
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Segundo par de laços: percorre a matrizSoma para exibir os valores na tela.
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                // Imprime o número na mesma linha, separado por espaço.
                System.out.print(matrizSoma[i][j] + " ");
            }
            // Pula para a próxima linha após imprimir todas as colunas da linha atual.
            System.out.println();
        }
    }
}
