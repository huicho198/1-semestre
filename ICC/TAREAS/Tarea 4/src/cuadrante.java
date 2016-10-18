/**
*Problema 3 URI
*Determina el cuadrante dado 2 cordeenadas como un numero flotante.
*/
import java.util.Scanner;
public class cuadrante{
	public static void main(String [] args){
 		Scanner a = new Scanner(System.in);
 		float x, y;
 		x = a.nextFloat();
 		y = a.nextFloat();
 
 		
 		if(x == 0 || y == 0){
 			if(x == 0 && y == 0){
 			System.out.println("Origem");
 			}
 			else{
 				if(x == 0){
 			System.out.println("Eixo Y");
 		}
 		else{
 			System.out.println("Eixo X");
 		}
 			}
 		}

 		
 		if(x>0 && y>0){
 			System.out.println("Q1");
 		}
 		if(x>0 && y<0){
 			System.out.println("Q4");
 		}
 		if(x<0 && y>0){
 			System.out.println("Q2");
 		}
 		if(x<0 && y<0){
 			System.out.println("Q3");
 		}
	}
}
