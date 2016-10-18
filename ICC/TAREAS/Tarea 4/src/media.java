/**
*Problema 2 URI
*Calcular la media de dos numero Double
*/
import java.util.Scanner;
public class media{
	public static void main(String [] args){
		Scanner a = new Scanner(System.in);
		double b, c;
		b = a.nextDouble();
		c = a.nextDouble();
		System.out.printf("MEDIA = %.5f\n", (((b*.35)+(c*.75))*10)/11 );

	}
}