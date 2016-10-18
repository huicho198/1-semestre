/**
* Problema 9 URI
* mostrar el promedio de hotdogs comidos por el numero de participiantes
*/
import java.util.Scanner;
public class hotdogs{
	public static void main(String [] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
 
		float d = (float)b/(float)c;
		System.out.printf("%.2f\n", d);
	}
}