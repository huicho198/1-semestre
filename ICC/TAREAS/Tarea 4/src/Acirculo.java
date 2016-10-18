/**
* Problema 1 de URI
* Determinar area de un circulo
*/
import java.util.Scanner;
public class Acirculo{
	public static void main(String [] args){
		Scanner lector = new Scanner(System.in);
		double pi, R;
		pi = 3.14159;
		R = lector.nextDouble();
		System.out.printf("A=%.4f\n", pi*(R*R));
	}

	
}
