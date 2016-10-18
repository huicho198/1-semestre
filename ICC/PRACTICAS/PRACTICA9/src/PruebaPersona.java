/**
 * Clase que realiza pruebas con objetos de la clase Persona.
 * @author 
 * @version 
 */
public class PruebaPersona {

    /**
     * Metodo principal de la clase.
     * @param args Argumentos para la linea de comandos.
     */
    public static void main(String[] args) {
        
        System.out.println("Creando 3 objetos Persona...");
        Persona persona1 = new Persona(22, "Salvador", "Lopez", 5517347629L, "Mexico");
        Persona persona2 = new Persona(23, "Eduardo", "Miranda", 5545298319L);
        Persona persona3 = new Persona("Claudia", "Medina", 5587197628L);
        
        System.out.println("Mostrando informacion ...");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        
        System.out.println("Actualizando informacion de persona 3...");
        persona3.asignarApellidos("Medina Santamaria");
        persona3.asignarEdad(21);
        persona3.asignarNombre("Claudia Paola");
        persona3.asignarPais("Argentina");
        persona3.asignarTelefono(5512345678L);
        
        System.out.println("Los datos han sido actualizados correctamente:");
        System.out.println("edad: " + persona3.obtenerEdad());
        System.out.println("nombre completo: " + persona3.obtenerNombreCompleto());
        System.out.println("telefono: " + persona3.obtenerTelefono());
        System.out.println("pais: " + persona3.obtenerPais());
        
        Persona persona4 = new Persona(23, "Eduardo", "Miranda", 5545298319L);
        if(persona2.equals(persona4)) {
            System.out.println("Metodo equals correctamente implementado.");
        } else {
            System.out.println("Metodo equals mal implementado.");
        }
    }
}
