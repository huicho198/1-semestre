/**
*Prueba Main para Fraccion
*/
public class Main{
	public static void main(String[] args){
		//PRUEBA 1. CREAR E IMPRIMIR LA FFRACION 1/1
		Fraccion f = new Fraccion("1/1");
		System.out.println(f);
		Fraccion g = new Fraccion("2/2");
		System.out.println(g);
		//Suma sin modificacion
		System.out.println(g.suma(f));
		//Resta sin modificacion
		System.out.println(g.resta(f));
		//Multiplicacion sin modificacion;
		System.out.println(g.multiplicacion(f));
		//division sin modificacion
		System.out.println(g.division(f));
//Suma con modificacion
		g.sumar(f);
		System.out.println(g);
//Resta con modificacion
		g.restar(f);
		System.out.println(g);
//Multiplicacion con modificacion
		g.multiplicar(f);
		System.out.println(g);
//Division con modificacion
		g.dividir(f);
		System.out.println(g);

		//Crear objeto con denominador 0
		Fraccion b = new Fraccion(1,0);
		System.out.println(b);
		//comparadores
		System.out.println(g.menorque(f));
		System.out.println(g.mayorque(f));
		System.out.println(g.igual(f));

		//convertir un Fraccional  a float
		System.out.println(g.getFloatValue());



	}
}