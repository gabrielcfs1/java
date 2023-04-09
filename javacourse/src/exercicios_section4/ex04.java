package exercicios_section4;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFuncionario, horasTrabalhadas;
		double valorHora, salario;

		System.out.println("DIGITE O NUMERO DO FUNCIONARIO: ");
		numFuncionario = sc.nextInt();
		System.out.println("DIGITE O VALOR DAS HORAS TRABALHADAS: ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("DIGITE O VALOR POR HORA: ");
		valorHora = sc.nextDouble();
		salario = valorHora * horasTrabalhadas;

		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY: U$ %.2f%n", salario);

		sc.close();

	}

}
