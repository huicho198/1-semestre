/**
*Problem No° 5
*/ 
import java.util.Scanner;
public class square{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		for(int i= 1; i<=b; i++){
			if(i== 1){
				for(int j=1; j<=b; j++){
					if(j!=i){
						System.out.print("*");
					}
					if(j==b){
						System.out.println("*");
					}
				}
			}
			if(i!=b && i!=1){
				for(int j=1; j<=b; j++){
					if(j==1){
						System.out.print("*");

					}
					if(j==b){
						System.out.println("*");
					}
					if(j!=1 && j!=b){
						System.out.print(" ");
					}
					
				}

			}
			if(i==b){
				for(int j=1; j<=b; j++){
					if(j<b){
						System.out.print("*");

					}
					else{
						System.out.println("*");
					}
				}

			}
		}
	}
}