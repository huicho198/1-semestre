/**
*Programa Uri 10
*dado 3 numero por el usuario, comproBar si puede realizar un viaje en el tiempo o no
*/
import java.util.Scanner;
public class tiempo2{
	public static void main(String [] args){
		Scanner lector = new Scanner(System.in);
		int A,B, C;
		a= lector.nextInt();
		b = lector.nextInt();
		c = lector.nextInt();
		int w,x,y,z;
		x = a+b;
		y = a+c;
		z = b+c;
		if(a>=1 && a<=1000 && b>=1 && b<=1000 && c>=1 && c<=1000){
			if(a== b|| a==c || b== c){
				System.out.println("S");
			}
			if((a==z || b== y || c== x )&& (a!= b && a!= c && b!=c)){
				System.out.println("S");
			}
			if(a!= b && a!=c && b!=c && a!= z && b!=y && c!= x){
				System.out.println("N");
			}
		}

	}
}