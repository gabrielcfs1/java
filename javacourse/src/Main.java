import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String nome = "Gabriel";
		int idade = 23;
		double renda = 4000.0;
		int y = 32;
		double x = 3.70645;
		System.out.println("Hello World JAVA");
		// System.out.print("teste");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US); // Definir . ao inves de , nos separadores decimais
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$:%.2f reais%n", nome, idade, renda);
	}

}
