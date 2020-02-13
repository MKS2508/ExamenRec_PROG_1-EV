import java.util.Scanner;

public class Bucles {
	public static void main(String[] args) {
		Scanner obtenerNumero = new Scanner(System.in);
		int num = obtenerNumero.nextInt();
		double suma = 0;
		
		int base = 2;
		int j;
		for (int i = 1; i <= num; i++) {
		double resultado = 1;
			for (j = 1; j <= i; j++) {
				resultado = resultado * base;

			}
			
			suma=suma+(i/resultado);
		}
		System.out.println(suma);
	}

}
