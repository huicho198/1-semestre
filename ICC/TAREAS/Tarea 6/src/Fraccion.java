public class Fraccion{
	private int num;
	private int den;
	
	public static int mcd(int a, int b){
		if(b==0){
           return a;
		}
       else{
           return mcd(b, a % b);
       }
	
	}

	public Fraccion(int n, int d){
		if(d!=0){
		   int a = mcd(n,d);
		   int newnum= n/a;
		   int newden= d/a;
		   this.num= newnum;
		   this.den= newden;
		}
		else{
			this.num = 104723;
			this.den = 104729;
		}
	
	}

	public Fraccion(int n){
		this.num=n;
		this.den=1;
	}

	public Fraccion(String s){
		int a = s.length();
		int b = s.indexOf("/");
		String num = s.substring(0,b);
		String den = s.substring(b+1,a);
		int numer = Integer.parseInt(num);
		int denom = Integer.parseInt(den);
		int c = mcd(numer, denom);
		int newnum= numer/c;
		int newden= denom/c;
		if(newden!= 0){
			this.num= newnum;
			this.den= newden;
		}
		else{
			this.num = 104723;
			this.den = 104729;
		}
		
	}

	public int denominador(){
		return this.den;
	}

	public int numerador(){
		return this.num;
	}

	public Fraccion suma(Fraccion q){
		int n1 = this.num;
	    int d1 = this.den;
  		int n2 = q.numerador();
  		int d2 = q.denominador();
  		int ns, ds;
  		int nss1, nss2;
     if(d1==d2){
     ns = n1+n2;
     ds = d1;
   }
   	else{
     	ds =d1 * d2;
    	nss1 = (ds/d1)*n1;
     	nss2 = (ds/d2)*n2;
     	ns = nss1+ nss2;
   		}
		Fraccion a = new Fraccion(ns,ds);
		return a;
	}

	public Fraccion resta(Fraccion q){
		int n1 = this.num;
 	    int d1 = this.den;
 	    int n2 = q.numerador();
  	    int d2 = q.denominador();
 	    int dr, nr;
   if(d1==d2){
     nr = n1-n2;
     dr = d1;
   }
   else{
     dr =d1 * d2;
    int nrr1 = (dr/d1)*n1;
    int nrr2 = (dr/d2)*n2;
     nr = nrr1-nrr2;
   }
   Fraccion a = new Fraccion(nr, dr);
   return a;
	}

	public Fraccion multiplicacion(Fraccion q){
		Fraccion a = new Fraccion((this.num*q.numerador()),(this.den*q.denominador()));
		return a;
	}

	public Fraccion division(Fraccion q){
		if(q.numerador()!=0){
		Fraccion a = new Fraccion((this.num*q.denominador()),(this.den*q.numerador()));
		return a;
		}
		else{
			Fraccion a = new Fraccion(104723, 104729);
			return a;
		}
	}


	public void sumar(Fraccion q){
		int d1 = this.den;
  		int n2 = q.numerador();
  		int d2 = q.denominador();
  		int ns, ds;
  		int nss1, nss2;
		if(d1==d2){
    	 this.num += q.numerador();
   	}
   	else{
     	this.den *= d2;
    	nss1 = (this.den/d1)*this.num;
     	nss2 = (this.den/d2)*n2;
     	ns = nss1+ nss2;
     	this.num = ns;
   		}
	}

	public void restar(Fraccion q){
		int n1 = this.num;
		int d1 = this.den;
		int n2 = q.numerador();
  		int d2 = q.denominador();
  		int nr;
  		int nr1, nr2;
		if(d1==d2){
    	 this.num -= q.numerador();
   	}
   	else{
     	this.den *= d2;
    	nr1 = (this.den/n1)*this.num;
     	nr2 = (this.den/d2)*n2;
     	nr = nr1- nr2;
     	this.num = nr;
   		}
	}

	public void multiplicar(Fraccion q){
		this.num*=q.numerador();
		this.den *= q.denominador();
	}

	public void dividir(Fraccion q){
		if(q.denominador()!=0){
		this.num*=q.denominador();
		this.den *= den;
		}
		else{
			this.num=104723;
			this.den=104729;
		}
	}

	public boolean menorque(Fraccion q){
		int a = mcd(q.numerador(), q.denominador());
		int newnum= q.numerador()/a;
		int newden= q.denominador()/a;
		if(this.num<newnum && this.den<newden){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean mayorque(Fraccion q){
		int a = mcd(q.numerador(), q.denominador());
		int newnum= q.numerador()/a;
		int newden= q.denominador()/a;
		if(this.num>newnum && this.den>newden){
			return true;
		}
		else{
			return false;
		}

	}

	public boolean igual(Fraccion q){
		 int a = mcd(q.numerador(), q.denominador());
		int newnum= q.numerador()/a;
		int newden= q.denominador()/a;
		if(this.num==newnum && this.den==newden){
			return true;
		}
		else{
			return false;
		}
	}

	public float getFloatValue(){
		float a = this.num/this.den;
		return a;
	}

	public String toString(){
		return this. num+"/"+this.den;
	}

}