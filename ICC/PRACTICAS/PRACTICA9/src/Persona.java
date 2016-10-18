/**
 * Clase que trabaja con la informacion importante de una persona.
 * @author 
 * @version 
 */
public class Persona {
    
    /**
     * variable para almacenar la edad de la persona.
     */
    private int edad;
    /**
     * variable para almacenar el nombre de la persona.
     */
    private String nombre;
    /**
     * variable para almacenar los apellidos de la persona.
     */
    private String apellidos;
    /**
     * variable para almacenar el telefono de la persona.
     */
    private long telefono;
    /**
     * variable para almacenar el pais de la persona.
     */
    private String pais;
    /**
     * Constante que indica la edad predeterminada de una persona.
     */
    private final int EDAD_DEFAULT = 18;
    /**
     * Constante que indica el pais de origen predeterminado de una persona.
     */
    private final String PAIS_DEFAULT = "Mexico";


    /**
     * Constructor de Clase, crea una nueva persona con los datos que recibe como parametro.
     * @param edad La edad de la persona.
     * @param nombre El nombre de la persona.
     * @param apellidos Los apellidos de la persona.
     * @param telefono El telefono de la perona.
     * @param pais El pais donde nacio la persona.
     */
    public Persona(int edad, String nombre, String apellidos, long telefono, String pais) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.pais = pais;
    }

    /**
     * Constructor de Clase, crea una nueva persona con los datos que recibe 
     * como parametro y con pais igual a Mexico.
     * @param edad La edad de la persona.
     * @param nombre El nombre de la persona.
     * @param apellidos Los apellidos de la persona.
     * @param telefono El telefono de la perona.
     */
    public Persona(int edad, String nombre, String apellidos, long telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.pais = PAIS_DEFAULT;
    }

    /**
     * Constructor de Clase, crea una nueva persona con los datos que recibe 
     * como parametro. Se le asigna edad igual a 18 anios y  como pais Mexico.
     * @param nombre El nombre de la persona.
     * @param apellidos Los apellidos de la persona.
     * @param telefono El telefono de la perona.
     */
    public Persona(String nombre, String apellidos, long telefono) {
      this.edad = EDAD_DEFAULT;
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.telefono = telefono;
      this.pais = PAIS_DEFAULT;
    }

    /**
     * Metodo que regresa los apellidos de la persona que lo llama.
     * @return Un String con la informacion.
     */
    public String obtenerApellidos() {
       return this.apellidos;
    }

    /**
     * Metodo que asigna nuevos apellidos a la persona que lo llama.
     * @param apellidos Un String que contiene los nuevos apellidos a asignarse.
     */
    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Metodo que regresa la edad de la persona que lo llama.
     * @return Un int con la informacion.
     */
    public int obtenerEdad() {
        return this.edad;
    }

    /**
     * Metodo que asigna una nueva edad a la persona que lo llama. 
     * Si la edad es negativa asigna una edad default.
     * @param edad Un int que representa la edad de la persona.
     */
    public void asignarEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que regresa el nombre de la persona que lo llama.
     * @return Un String con la informacion.
     */
    public String obtenerNombre() {
        return this.nombre;
    }
    
    /**
     * Metodo que regresa el nombre completo de la persona que lo llama.
     * @return Un String con la informacion iniciando por apellidos.
     */
    public String obtenerNombreCompleto() {
        return this.nombre+" "+this.apellidos;
    }
    
    /**
     * Metodo que asigna un nuevo nombre a la persona que lo llama.
     * @param nombre Un String que tiene el nuevo nombre a asignarse.
     */
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa el pais de origen de la persona que lo llama.
     * @return Un String con la informacion.
     */
    public String obtenerPais() {
       return this.pais;
    }

    /**
     * Metodo que asigna un nuevo pais a la persona que lo llama.
     * @param pais Un String que tiene el nuevo pais a asignarse.
     */
    public void asignarPais(String pais) {
        this.pais= pais;
    }

    /**
     * Metodo que regresa el numero telefonico de la persona que lo llama.
     * @return Un long con la informacion.
     */
    public long obtenerTelefono() {
       return this.telefono;
    }

    /**
     * Metodo que asigna un nuevo numero telefonico a la persona que lo llama.
     * @param telefono El long con el nuevo telefono.
     */
    public void asignarTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Metodo que indica si 2 objetos Persona son iguales.
     * @param obj El segundo objeto a operar.
     * @return True si obj es instancia de la clase Persona y si ambos tienen
     * los mismos datos. False en otro caso.
     */
    @Override
    public boolean equals(Object obj){
            if(obj instanceof Persona){
                if(this.nombre.equals(((Persona)obj).obtenerNombre()) && this.edad == ((Persona)obj).obtenerEdad() && this.apellidos.equals(((Persona)obj).obtenerApellidos()) && this.telefono == ((Persona)obj).obtenerTelefono() && this.pais.equals(((Persona)obj).obtenerPais())){
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
     * de un objeto Persona en un objeto String.
     * @return Un String con la representacion del objeto.
     */
    @Override
    public String toString() {
        return "Nombre: "+ this.nombre +"\n"+
                "Apellidos: "+ this.apellidos+"\n"+
                "Edad: "+ this.edad +"\n" +
                "Telefono: "+ this.telefono+ "\n"+
                "Pais: "+ this.pais+"\n";
    }
    
}
