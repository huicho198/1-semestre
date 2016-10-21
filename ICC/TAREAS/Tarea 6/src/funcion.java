/**
*Problem No° 6
*/
public class funcion{
	public static void main(String[] args){
		int resultado;
		for(int i=-10; i<=10; i++){
			switch(i){
				case -10:
				case -9:
				case -8:
				case -7:
				case -6:
				case -5:
				case -3:
				case -2:
				case -1:
				case 1:
				case 2:
				case 4:
				case 5:
				case 7:
				case 8:
				case 9:
				case 10:
				System.out.println("x="+i+"\t"+"f(x)= 0");
				break;

				case 3:
				resultado= 3+1;
				System.out.println("x="+i+"\t"+"f(x)= "+resultado);
				break;

				case 6:
				resultado= 2*6;
				System.out.println("x="+i+"\t"+"f(x)= "+resultado);
				break;

				case -4:
				resultado= -4*-4;
				System.out.println("x="+i+"\t"+"f(x)= "+resultado);
				break;

				case 0:
				resultado= -3;
				System.out.println("x="+i+"\t"+"f(x)= "+resultado);
				break;


			}
		}

	}
}