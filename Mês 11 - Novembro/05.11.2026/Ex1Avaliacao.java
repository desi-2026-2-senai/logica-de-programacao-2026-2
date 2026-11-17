import java.util.Scanner; // Importa a ferramenta para ler o que o usuário digitar no teclado

public class Ex1Avaliacao {
	public static void main(String[] args) {

		// Cria um leitor chamado "input" para capturar as entradas do teclado
		Scanner input = new Scanner(System.in);

		// Pede e lê o valor da primeira máquina
		System.out.println("Insira a precisão da máquina 1");
		int maquina1 = input.nextInt();

		// Pede e lê o valor da segunda máquina
		System.out.println("Insira a precisão da máquina 2");
		int maquina2 = input.nextInt();

		// Pede e lê o valor da terceira máquina
		System.out.println("Insira a precisão da máquina 3");
		int maquina3 = input.nextInt();

		// Verifica se todas as três máquinas têm o mesmo valor
		if (maquina1 == maquina2 && maquina1 == maquina3) {
			System.out.println("Máquinas precisas");

			// Se não forem iguais, verifica se pelo menos duas delas são iguais
		} else if (maquina1 == maquina2 || maquina1 == maquina3 || maquina2 == maquina3) {
			System.out.println("Uma máquina precisa de ajuste");

			// Se nenhuma condição acima for verdadeira, significa que todas são diferentes
		} else {
			System.out.println("Todas as máquinas desajustadas");
		}

	}
}
