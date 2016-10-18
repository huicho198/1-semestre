/**
*Problema URI 4
* imprimir la suma de todos los numeros impares entre 2 numeros
*/
import java.util.Scanner;
public class impares{
	public static void main(String [] args){
Scanner a = new Scanner(System.in);
	int x, y, w, z;
	x = a.nextInt();
	y = a.nextInt();
	int s = 0;
	int q = y+1;
	for (int i = q; i < x; i++){
		z = i;
		w= z%2;
		if(w==1 || w == -1){
			s += z;
		}		
	}
	System.out.println(s);
	

	}
}