package view;
import controller.Metodos;
import java.util.Scanner;

public class Main {
	public static void main (String args [ ]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Tamanho vetor: ");
		int length = sc.nextInt();
		System.out.printf("Vetor com %d posições! \n", length);
		
		int vet [ ] = new int [length];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * (100 - 1 + 1) +1 );
		}
		
		for (int numero : vet) {
		    System.out.print(numero + " | ");
		}

	    System.out.print("\n");
		
		length -= 1;
		int mn = vet [length]; 
		
		int result = Metodos.mnNumero(vet, mn, length);
		System.out.printf ("Menor número: %d! ", result);
	}
}
