/*
*Programa para jugar Volados
*
*
*
*/
import java.util.Scanner;

public class Volados {
	public static void main(String [] args){
	//elementos auxiliares
		Scanner datos;
		datos = new Scanner (System.in);

	//tomar una moneda

	Moneda diezPesos ;
	diezPesos = new Moneda();
	//lanzar moneda al aire
	diezPesos.lanzar();
	//ver que el otro trata de adivinar
	System.out.println("Que pides?");
	respuesta = datos.netLine();
	//ver el resultado
	System.out.println("la cara visible es:" + diezPesos.obtenerCara() +"y tu pediste "+ respuesta );

	//determinar al ganador
	//compara el resultado con la prediccion
	if (respuesta.equals(diezPesos.obtenerCara() == respuesta)){
		// gana el contrincante
		System.out.println("ganaste!!");
	} else {
		// gana la computadora
		System.out.println("ja! ja! ja! perdiste");
	}
	}
}