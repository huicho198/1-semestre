/**
*Problema URI 7
*Juego para personas sin internet
*/
import java.util.Scanner;
public class juegos{
	public static void main(String [] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		int e = a.nextInt();
		int f = a.nextInt();
		int g = c+d;
	// a = 1 par
	// a = 0 impar
		if(c>= 1 && c<= 100 && d>= 1 && d<= 100 && (b==1 || b== 0)&& (e==1 || e== 0)|| (f==1 || f== 0)){
			if(g%2== 0 && b== 1 && e== 0 && f== 0){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 0 && b== 1 && e== 0 && f== 1){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 0 && b== 1 && e== 1 && f== 0){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 0 && b== 1 && e== 1 && f== 1){
				System.out.println("Jogador 2 ganha!");
			}
			if(g%2== 1 && b== 1 && e== 0 && f== 0){
				System.out.println("Jogador 2 ganha!");
			}
			if(g%2== 1 && b== 1 && e== 0 && f== 1){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 1 && b== 1 && e== 1 && f== 0){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 1 && b== 1 && e== 1 && f== 1){
				System.out.println("Jogador 2 ganha!");
			}
			if(g%2== 0 && b== 0 && e== 0 && f== 0){
				System.out.println("Jogador 2 ganha!");
			}
			if(g%2== 0 && b== 0 && e== 0 && f== 1){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 0 && b== 0 && e== 1 && f== 0){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 0 && b== 0 && e== 1 && f== 1){
				System.out.println("Jogador 2 ganha!");
			}
			if(g%2== 1 && b== 0 && e== 0 && f== 0){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 1 && b== 0 && e== 0 && f== 1){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 1 && b== 0 && e== 1 && f== 0){
				System.out.println("Jogador 1 ganha!");
			}
			if(g%2== 1 && b== 0 && e== 1 && f== 1){
				System.out.println("Jogador 2 ganha!");
			}


		}
	
	}
}