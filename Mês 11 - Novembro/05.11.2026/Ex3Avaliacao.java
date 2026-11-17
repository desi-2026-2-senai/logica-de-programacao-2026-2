import java.util.Scanner; // Importa a ferramenta para ler o que o usuário digitar

public class Ex3Avaliacao {

	public static void main(String[] args) {

		// Cria o leitor do teclado
		Scanner input = new Scanner(System.in);

		// Pergunta quantos vendedores serão processados para definir o limite do laço
		// (for)
		System.out.println("Insira a quantidade de vendedores");
		int qtdVendedores = input.nextInt();

		// Variáveis acumuladoras e estatísticas (valores iniciais zerados)
		double totalComissoes = 0; // Vai somar todas as comissões pagas no final
		int qtdComissao10 = 0; // Vai contar quantos vendedores ganharam a faixa máxima de 10%
		double maiorComissao = 0; // Vai guardar o maior valor de comissão encontrado

		// Laço de repetição que vai rodar uma vez para cada vendedor
		for (int i = 0; i < qtdVendedores; i++) {

			// Lê o nome do vendedor atual
			System.out.println("Insira o nome do vendedor");
			String nome = input.next();

			// Lê o valor das vendas desse vendedor
			System.out.println("Insira o valor total vendido");
			double totalVendido = input.nextDouble();

			// Cria uma variável para calcular a comissão específica deste vendedor
			double comissaoVendedor = 0;

			// CASO 1: Vendas até R$ 2000 -> Ganha 5% de comissão (0.05)
			if (totalVendido <= 2000) {
				comissaoVendedor = totalVendido * 0.05;
				totalComissoes += comissaoVendedor; // Soma essa comissão ao total geral

				// CASO 2: Vendas entre R$ 2000.01 e R$ 5000 -> Ganha 8% de comissão (0.08)
			} else if (totalVendido > 2000 && totalVendido <= 5000) {
				comissaoVendedor = totalVendido * 0.08;
				totalComissoes += comissaoVendedor; // Soma essa comissão ao total geral

				// CASO 3: Vendas acima de R$ 5000 -> Ganha 10% de comissão (0.1)
			} else {
				comissaoVendedor = totalVendido * 0.1;
				totalComissoes += comissaoVendedor; // Soma essa comissão ao total geral

				// Lógica para descobrir a maior comissão:
				// Se a comissão deste vendedor for maior do que a maior guardada até agora...
				if (comissaoVendedor > maiorComissao) {
					maiorComissao = comissaoVendedor; // ...esta passa a ser a nova maior comissão!
				}

				qtdComissao10++; // Soma +1 na contagem de vendedores que ganharam 10%
			}

			// Mostra o resultado individual deste vendedor antes de passar para o próximo
			// do laço
			System.out.println("O vendedor " + nome + " recebeu R$ " + comissaoVendedor + " de comissão");

		} // Fim do laço 'for' (vai para o próximo vendedor ou sai se atingir a quantidade
			// total)

		// Exibição dos relatórios e estatísticas finais (fora do laço, após processar
		// todos)
		System.out.println("-----------------------------------------------------");
		System.out.println("O total que foi distribuído de comissão foi de R$" + totalComissoes);
		System.out.println(qtdComissao10 + " vendedores tiveram 10% de comissão");
		System.out.println("A maior comissão foi de R$" + maiorComissao);
	}

}
