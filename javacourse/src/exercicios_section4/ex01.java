package exercicios_section4;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int val1, val2, soma;

		System.out.println("DIGITE O PRIMEIRO VALOR: ");
		val1 = sc.nextInt();
		System.out.println("DIGITE O SEGUNDO VALOR: ");
		val2 = sc.nextInt();

		soma = val1 + val2;

		System.out.printf("SOMA = " + soma);

		sc.close();
	}

}
