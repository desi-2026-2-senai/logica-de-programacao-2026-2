import java.util.Scanner;

public class ExemploIfNome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o seu nome");
		String nome = input.next();

		// INÍCIO DA ESTRUTURA IF (SE):
		// ATENÇÃO: Para comparar textos em Java, NÃO usamos "==". Usamos o método
		// ".equals()".
		// O ".equalsIgnoreCase()" compara os textos IGNORANDO letras maiúsculas e
		// minúsculas.
		// Isso significa que "henrique", "HENRIQUE" ou "Henrique" vão funcionar!
		if (nome.equalsIgnoreCase("Henrique")) {

			// Se o nome digitado for igual a "Henrique" (VERDADEIRO), executa este bloco
			// O símbolo "+" serve para JUNTAR (concatenar) a mensagem com o nome guardado
			System.out.println("Seja bem vindo " + nome);

		} else { // ESTRUTURA ELSE (SENÃO):

			// Se o nome for qualquer outra coisa (FALSO), executa este bloco
			System.out.println("Usuário desconhecido");
		}

	}

}
