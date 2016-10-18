import java.util.Scanner;
//import java.util.*;

public class Entrada2{

	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in); //se crea el lector

	System.out.println( " Por favor ingrese su nombre "); // Se pide un dato

	String nombre = sc.nextLine(); //Se lee el nombre con nextLine () que retorna un String
	
	System.out.println("Bienvenido"+ "" + nombre + ".Por favor ingrese su edad"); 
	
	int edad = sc.nextInt(); //Se guarda la edad directamente con nextInt()
	//Notese que ya no hubo necesidad de usar parse() pues nextInt nos retorna un entero

	System.out.println("Gracias" + nombre + " en 10 años usten tendrá " + (edad + 10) + "años." ); 
}
}