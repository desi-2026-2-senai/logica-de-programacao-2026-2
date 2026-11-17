import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		// Cria um objeto Scanner para que o programa
		// consiga receber informações digitadas pelo usuário.
		Scanner input = new Scanner(System.in);

		// ENTRADA
		// Exibe uma mensagem na tela pedindo para o usuário
		// informar o valor do raio.
		System.out.println("Insira o valor do raio");

		// nextDouble() lê um número que pode possuir casas decimais.
		// O valor digitado pelo usuário é armazenado na variável raio.
		//
		// Usamos "double" porque o raio pode ser um número decimal,
		// como 5.5, 10.2, 3.14, etc.
		double raio = input.nextDouble();

		// PROCESSAMENTO
		// Calculamos a área do círculo usando a fórmula:
		//
		// Área = PI * raio²
		//
		// Math.PI representa o valor de PI (aproximadamente 3.14159).
		//
		// Math.pow(raio, 2) significa:
		// "elevar o valor de raio à potência 2".
		//
		// Por exemplo:
		// Se raio = 5
		// Math.pow(5, 2) = 25
		//
		// O resultado do cálculo é armazenado na variável area.
		double area = Math.PI * Math.pow(raio, 2);

		// SAÍDA
		// Exibe o resultado do cálculo na tela.
		//
		// O operador + está juntando o texto
		// com o valor armazenado na variável area.
		System.out.println("O valor da area é de : " + area);

	}

}
