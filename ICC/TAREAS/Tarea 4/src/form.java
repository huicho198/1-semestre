/**
*Problema 8 de URI
* medidor de cadena para saber si se ajusta a 80 caracteres
*/
import java.util.Scanner;
public class form{
	public static void main(String [] args){
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		int c = b.length();
		if(c>=1 && c<=500){
		if(c <= 80){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		}
	}
}