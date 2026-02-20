package controller;

public class Metodos {

	public static int mnNumero (int vet [ ], int mn, int length ) {
		if (length - 1 < 0) {
			return mn;
		}
		
		else {
			if (vet [length - 1] < mn) {
				mn = vet [length - 1];
			
			}
				return mnNumero (vet, mn, length -1);		
		}
	}
}
