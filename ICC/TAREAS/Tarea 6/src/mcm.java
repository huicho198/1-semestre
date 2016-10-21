/**
*Problem No° 7
*/
import java.util.Scanner;
public class mcm{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingresa el valor para a:");
		int a = lector.nextInt();
		System.out.print("Ingresa el valor para b:");
		int b = lector.nextInt();
		int aux;
		int count = 1;
		do{
			
			aux=count*a;
			count +=1;	
		}
		while(aux%b!=0);
		System.out.println("El mcm de ("+a+","+b+") es: "+aux);
	}
}