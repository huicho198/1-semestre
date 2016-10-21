/**
* Problem No° 2
*/
import java.util.Scanner;
public class promedio{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Escriba 3 enteros diferentes:");
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		int promedio = (b + c + d)/3;
		System.out.println("El promedio es "+promedio);
		int producto = b*c*d;
		System.out.println("El producto es "+producto);
		if(b<=c && b<=d){
			System.out.println("El número más pequeño es "+b);
		}
		if(c<=b && c<=d){
			System.out.println("El número más pequeño es "+c);
		}
		if(d<=b && d<=c){
			System.out.println("El número más pequeño es "+d);
		}
		if(b>=c && b>=d){
			System.out.println("El número más grande es "+b);
		}
		if(c>=b && c>=d){
			System.out.println("El número más grande es "+c);
		}
		if(d>=b && d>=c){
			System.out.println("El número más grande es "+d);
		}





	}
	
}