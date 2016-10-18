/**
*Programa 5 URI
*sumador de los 5 numeros pares consecutivos al numero dado
*/
import java.util.Scanner;
public class pares1{
	public static void main(String [] args){
		Scanner a = new Scanner(System.in);
		int c = a.nextInt();
		int y;
		while(c != 0){	
			if (c%2 ==0){
				y = c +2;
				c+= y;
				y+= 2;
				c+= y;
				y+= 2;
				c+= y;
				y+= 2;
				c+= y;	
					System.out.println(c);
					c = a.nextInt();
			}
			else{
					c+= 1;
					y = c+2;
					c+= y;
					y+= 2;
					c+= y;
					y+= 2;
					c+= y;
					y+= 2;
					c+= y;	
				System.out.println(c);
					c = a.nextInt();
			}
			
			
			}
		
	}
}
