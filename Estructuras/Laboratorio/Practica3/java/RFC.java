/**
*Clase que dados los datos de un usuario devuelve la aproximacion de su RFC
*Alumno: Martinez Monroy Luis Alberto
*Laboratorio ICC 2017-1
*N°cuenta: 314212391
*/
import java.util.Scanner;

public class RFC{

	/**
	*Método principal de la clase
	*/
	public static void main(String args []){
		Scanner leer  = new Scanner(System.in); //Se crea un objeto de la clase Scanner

		String nombre = "";
		String fecha = "";
		
		System.out.println("Dame tu nombre completo empezando por apellidos ");
		nombre = leer.nextLine();
		System.out.println("Dame fecha de nacimiento sin espacios ejemplo:111298 (dia)(mes)(año)");
		fecha = leer.nextLine();

		int tam = nombre.length();
		int var1 = nombre.indexOf(" ");
		String app = nombre.substring(0, var1);
	
		String inp = app.substring(0, 2);
		
		
		String nombre2 = nombre.substring(var1+1, tam);

		int tam2 = nombre2.length();
		int var2 = nombre2.indexOf(" ");
		String apm = nombre2.substring(0, var2);
	
		String inm = apm.substring(0, 1);
		
	
		String nombre3 = nombre2.substring(var2+1, tam2);

		int tam3 = nombre3.length();
		int var3 = nombre3.indexOf(" ");
		String nom = nombre3.substring(0, var3);
	
		String inn = nom.substring(0, 1);
		
		
		String rfc1= inp + inm + inn;
		String dia = fecha.substring(0, 2);

		String mes = fecha.substring(2, 4);
	
		String año = fecha.substring(4, 6);
	

		String rfc2 = año + mes + dia;
	
		

		String rfcf= rfc1 + rfc2 + "qr3";
		System.out.println(rfcf.toUpperCase());



	} 	
}