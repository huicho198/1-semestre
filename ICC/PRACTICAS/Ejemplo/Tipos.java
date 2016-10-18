/**
* Clase que imlementa los tipos de datos
*/

public class Tipos{
	public static void main(String args []){
		
		String cadena;
		String cadena2;
		/** primitivos	*/
		int entero;
		int sumado1;
		int sumado2;
		char caracter;
		boolean bool;
		boolean bool_verdadero;
		boolean bool_falso;
		float flotante;
		double doble;
		long entero_largo;
		byte entero_mas_corto;
		short entero_corto;
		cadena = "Esta es una cadena";
		cadena2 = "Esta es otra cadena";
		System.out.println(cadena);

		cadena += cadena2 + "";
		//cadena= cadena + cadena2; 
		/** += sirve para acortar la operacion*/
		

		System.out.println(cadena);

		entero = 10;
		flotante = (float)2.000213;
		doble = 1.00232323;
		bool_verdadero = true;
		bool_falso = false;

		System.out.println(entero);
		System.out.println(flotante);
		System.out.println(doble);


		System.out.println(cadena + entero);
		System.out.println(cadena + flotante);
		System.out.println(entero + flotante);

		System.out.println(bool_falso & bool_verdadero);
		System.out.println(bool_verdadero & bool_verdadero);

		System.out.println(bool_falso | bool_verdadero);
		System.out.println(bool_verdadero | bool_verdadero);

		System.out.println(!bool_verdadero);

		entero_largo = 23213;
		sumado1 =10;
		sumado2 =20;

		System.out.println(sumado1+sumado2);



	}
}