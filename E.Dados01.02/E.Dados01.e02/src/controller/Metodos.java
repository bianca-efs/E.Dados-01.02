package controller;

public class Metodos {

	public static int mnNumero (int vet [ ], int mn, int length ) {

		// Condição de parada:
		// A recursão para quando o índice do vetor chega antes da primeira posição (length - 1 < 0),
		// ou seja, quando todos os elementos já foram verificados.
		// Nesse momento, o menor valor encontrado (mn) é retornado.

		if (length - 1 < 0) {
			return mn;
		}
		
		// Relação de chamada (passo recursivo):
		// Compara o valor da posição atual do vetor com o menor valor encontrado até o momento (mn).
		// Se o valor atual for menor, ele passa a ser o novo menor.
		// Em seguida, a função chama ela mesma, diminuindo o tamanho (length - 1),
		// para continuar verificando as posições anteriores do vetor.
		
		else {
			if (vet [length - 1] < mn) {
				mn = vet [length - 1];
			
			}
				return mnNumero (vet, mn, length -1);		
		}
	}
}
