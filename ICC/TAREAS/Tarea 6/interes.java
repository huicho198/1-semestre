/**
*Problem No° 4
*/
import java.util.Scanner;
public class interes{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		double prestamo = 0;
		double tasa = 0;
		int dias = 0;
		double interes= 0;

		System.out.print("Introduzca el monto del préstamo(-1 para terminar): ");
			prestamo= a.nextDouble();
		while(prestamo!=-1){
			System.out.print("Introduzca la tasa de interés: ");
			tasa = a.nextDouble();
			System.out.print("Introduzca el periodo del préstamo en días: ");
			dias = a.nextInt();
			interes= prestamo*tasa*dias/365;
			System.out.println("El monto del interés es $"+interes);
			System.out.println("");
			System.out.print("Introduzca el monto del préstamo(-1 para terminar): ");
			prestamo= a.nextDouble();
		}
	}
}