package exercicios_section4;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double R, A, pi = 3.14159;

		System.out.println("DIGITE O VALOR DO RAIO: ");
		R = sc.nextDouble();
		A = pi * R * R;

		System.out.printf("A ÁREA É IGUAL A: %.4f%n", A);

		sc.close();
	}

}
