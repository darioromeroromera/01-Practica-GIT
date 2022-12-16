import java.util.Scanner;
public class TestMatematicas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int numero = sc.nextInt();
		boolean esPar = Matematicas.esPar(numero);
		if (esPar)
			System.out.println("El número introducido es par");
		else
			System.out.println("El número introducido es impar");
	

		boolean esDivisiblePorTres = Matematicas.esDivisiblePorTres(numero);
		if (esDivisiblePorTres)
			System.out.println("El número introducido es divisible entre tres");
		else
			System.out.println("El número introducido no es divisible entre tres");
	

		boolean esDivisiblePorCinco = Matematicas.esDivisiblePorCinco(numero);
		if (esDivisiblePorCinco)
			System.out.println("El número introducido es divisible entre cinco");
		else
			System.out.println("El número introducido nos es divisible entre cinco");
	}
}
