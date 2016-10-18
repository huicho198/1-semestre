/**
* Programa 6 URI
* Determinar si un numero es Perfecto o no.
*/
import java.util.Scanner;
public class pnum{
	public static void main(String [] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int y;
		int z;
		for(int i = 0; i<b; i++){
			int c= a.nextInt();
			y= 0;
			for(int u = 1; u<c; u++){
				 z = c%u;
				if (z == 0){
					y += u;
				}
			}
			if(y == c){
				System.out.println(c+" eh perfeito");
			}
			else{
				System.out.println(c+" nao eh perfeito");
			}
		}

	}
}