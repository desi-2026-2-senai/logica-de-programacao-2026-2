// O nome da classe deve ser exatamente igual ao nome do arquivo (ExemploVetor.java)
public class ExemploVetor {
	public static void main(String[] args) {

		// --- DECLARAÇÃO DE VETORES (ARRAYS) ---

		// Um vetor é como uma lista de gavetas onde guardamos dados do mesmo tipo.
		// Os colchetes [] indicam que estamos criando um vetor de Textos (String).
		// Os elementos ficam guardados em posições numeradas chamadas ÍNDICES.
		// IMPORTANTE: A contagem das posições sempre começa no ZERO!
		// Posição 0: "João" | Posição 1: "Maria" | Posição 2: "Carlos" | Posição 3:
		// "Luis"
		String alunos[] = { "João", "Maria", "Carlos", "Luis" };

		// Aqui criamos um vetor de Números Inteiros (int) para as idades.
		// A ordem das idades bate com a ordem dos alunos (João tem 20, Maria tem 19...)
		// Posição 0: 20 | Posição 1: 19 | Posição 2: 25 | Posição 3: 21
		int idades[] = { 20, 19, 25, 21 };

		// --- EXPLORANDO O TAMANHO E ÍNDICES ---

		// O ".length" serve para descobrir o tamanho total do vetor (quantas gavetas
		// ele tem).
		// Como temos 4 nomes, isso vai imprimir o número 4.
		System.out.println(alunos.length);

		// ERRO CLÁSSICO: Se você tentar rodar a linha abaixo, o programa vai dar erro e
		// fechar!
		// O vetor tem tamanho 4, mas as posições vão de 0 até 3. A posição 4 NÃO
		// EXISTE.
		// System.out.println(alunos[4]);

		// Para acessar um elemento específico, colocamos o número da posição dentro dos
		// colchetes:
		// System.out.println(alunos[0]); // Imprime o primeiro elemento: "João"
		// System.out.println(alunos[1]); // Imprime o segundo elemento: "Maria"
		// System.out.println(alunos[2]); // Imprime o terceiro elemento: "Carlos"
		// System.out.println(alunos[3]); // Imprime o quarto elemento: "Luis"

		// --- DESAFIO PROPOSTO ---
		// Criem um vetor de n elementos que contêm a idade dos seus familiares e
		// percorra os dois vetores usando um laço de repetição.
		// (Dica: Você pode criar um vetor chamado 'idadesFamiliares' parecido com o de
		// cima!)

		// --- PERCORRENDO VETORES COM O LAÇO FOR ---

		// O laço 'for' funciona como um contador automático para visitar cada gaveta do
		// vetor.
		// int i = 0; -> Cria uma variável de controle 'i' (índice) começando em 0.
		// i < alunos.length; -> O laço continua rodando enquanto 'i' for menor que o
		// tamanho do vetor (menor que 4, ou seja, até 3).
		// i++ -> Soma +1 na variável 'i' a cada vez que o bloco de código termina.
		for (int i = 0; i < alunos.length; i++) {

			// Usamos a variável 'i' dentro dos colchetes [i] para buscar o aluno e a idade
			// da vez.
			// Na 1ª rodada, i vale 0: alunos[0] ("João") e idades[0] (20)
			// Na 2ª rodada, i vale 1: alunos[1] ("Maria") e idades[1] (19) ... e assim por
			// diante.
			System.out.println("O(a) estudante " + alunos[i] + " tem " + idades[i] + " anos");
		}
	}
}
