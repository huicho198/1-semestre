/**
* Problem 3
*/
import java.util.Scanner;
public class cifrasR{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Introduce un número de 6 cifras:");
		String cifra = a.nextLine();
		String aux1 = cifra.substring(0,1);
		String aux2 = cifra.substring(1,2);
		String aux3 = cifra.substring(2,3);
		String aux4 = cifra.substring(3,4);
		String aux5 = cifra.substring(4,5);
		String aux6 = cifra.substring(5,6);
		System.out.println(aux6+"\t"+aux5+"\t"+aux4+"\t"+aux3+"\t"+aux2+"\t"+aux1);

	}
}