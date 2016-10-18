/**
 * Clase que trabaja con empleados de una Empresa.
 * @author 
 * @version 
 */
public class Empleado {
    
    /**
     * Variable que almacena el ID del empleado, debe ser unico para cada objeto.
     */
    private int noEmpleado;
    /**
     * Variable que almacena el nombre completo del empleado.
     */
    private String nombre;
    /**
     * Variable que almacena el RFC del empleado.
     */
    private String rfc;
    /**
     * Variable que almacena el sueldo del empleado, no puede ser menor al minimo
     * establecido.
     */
    private double sueldo;
    /**
     * Variable auxiliar que sera de ayuda para asignar numeros de empleado.
     */
    private static int contador = 10000;
    /**
     * Sueldo menor que puede tener un empleado de la empresa.
     */
    public static final double SUELDO_MINIMO = 2800;
    
    /**
     * Constructor de clase, crea un nuevo empleado con los datos que recibe
     * como parametro. Le asigna automaticamente un numero.
     * @param rfc Un String con el RFC del empleado.
     * @param nombre Un String con el nombre completo del empleado.
     * @param sueldo Un double con el sueldo actual de empleado. Este no puede
     * ser menor al minimo.
     */
    public Empleado(String rfc, String nombre, double sueldo) {
        this.noEmpleado = contador++;
        this.rfc = rfc;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    /**
     * Metodo que regresa el numero del empleado que lo llama.
     * @return Un int con la informacion.
     */
    public int getNoEmpleado() {
        return this.noEmpleado;
    }

    /**
     * Metodo que regresa el RFC del empleado que lo llama.
     * @return Un String con la informacion.
     */
    public String getRfc() {
        return this.rfc;
    }

    /**
     * Metodo que asigna un nuevo RFC al empleado que lo llama.
     * @param rfc El nuevo RFC que tendra el empleado.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    /**
     * Metodo que regresa el nombre completo del empleado que lo llama.
     * @return Un String con la informacion.
     */
    public String getNombre() {
       return this.nombre;
    }

    /**
     * Metodo que asigna un nuevo nombre al empleado que lo llama.
     * @param nombre El nuevo nombre que tendra el empleado.
     */
    public final void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo que regresa el sueldo actual del empleado que lo llama.
     * @return Un double con el valor de dicho sueldo.
     */
    public double getSueldo() {
        return this.sueldo;
    }

    /**
     * Metodo que actualiza el sueldo del empleado que lo llama.
     * Tomar en cuenta las Politicas de la Empresa.
     * @param sueldo Un double con el valor del nuevo sueldo.
     * @return True si la operacion fue exitosa, false en otro caso.
     */
    public boolean setSueldo(double sueldo) {
        if(sueldo>= SUELDO_MINIMO){
            this.sueldo = sueldo;
            return true;
        }
        else{
            return false;
        }
     
    }
    
    /**
     * Metodo que aumenta el sueldo del empleado que lo llama en base a un porcentaje
     * que va de 0 a 100.
     * @param porcentaje El porcentaje de aumento.
     * @return True si la operacion fue exitosa, false en otro caso.
     */
    public boolean aumentarSueldo(int porcentaje) {
        double a = porcentaje / 100;
        double b = this.sueldo * a;
        if(porcentaje<=100 && porcentaje>=0){
            this.sueldo +=b;
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Metodo que indica si 2 objetos Empleado son iguales.
     * @param obj El segundo objeto a operar.
     * @return True si obj es instancia de la clase Empleado y si ambos tienen
     * el mismo numero de empleado. False en otro caso.
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Empleado){
            if(this.noEmpleado == ((Empleado)obj).getNoEmpleado() && this.nombre.equals(((Empleado)obj).getNombre()) && this.rfc.equals(((Empleado)obj).getRfc()) && this.sueldo ==((Empleado)obj).getSueldo() ){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    /**
     * Metodo heredado de la clase Object que devuelve la representacion
     * de un objeto Empleado en un objeto String.
     * @return Un String con la representacion del objeto.
     */
    @Override
    public String toString() {
        return "ID: "+this.noEmpleado+"\n"+
               "Nombre: "+this.nombre+"\n"+
               "RFC: "+this.rfc+"\n"+
               "Sueldo: "+this.sueldo+"\n";
    }
}
