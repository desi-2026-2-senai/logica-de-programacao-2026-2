
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Cria um vetor (array) de números inteiros com 10 posições.
		// Em Java, os índices vão de 0 até 9, e todas as posições começam com valor 0.
		int vetor[] = new int[10];

		System.out.println("Insira o índice em que deseja colocar o valor");
		int indice = input.nextInt();

		System.out.println("Insira o valor a ser colocado no vetor");
		int valor = input.nextInt();

		// Atribui "valor" à posição "indice" do vetor (ex.: vetor[2] = 50 coloca 50 na
		// posição 2)
		// Atenção: se o índice for menor que 0 ou maior/igual a 10, o Java lançará um
		// erro em tempo de execução
		vetor[indice] = valor;

		// Laço "for" para percorrer todo o vetor:
		// - int i = 0: começa no primeiro índice (0)
		// - i < vetor.length: continua enquanto "i" for menor que o tamanho do vetor
		// (10, ou seja, até 9)
		// - i++: aumenta "i" de 1 em 1 a cada repetição
		for (int i = 0; i < vetor.length; i++) {
			// Imprime o conteúdo armazenado na posição "i" do vetor
			System.out.println(vetor[i]);
		}
	}
}
