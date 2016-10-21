/**
*Problem No°8
*/
import java.util.Scanner;
public class piramide{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		for(int i=b; i>=1; i--){
			if(i==b){
				for(int j=1; j<=b; j++){
					if(j!=b){
						System.out.print("*");
					}
					if(j==b){
						System.out.println("*");
					}
				}
			}
			if(i!=b){
				for(int j=1; j<=(b-i); j++){
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++){
					if(j==i){
						System.out.println("*");
					}
					else{
						System.out.print("*");
					}
				}
			}

			
		}
		
	}
}