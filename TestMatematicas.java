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
	}
}
