/**
 * Clase que realiza pruebas con objetos de la clase Empleado.
 * @author 
 * @version 
 */
public class PruebaEmpleado {
    
    /**
     * Metodo principal de la clase.
     * @param args Argumentos para la linea de comandos.
     */
    public static void main(String[] args) {
        
        System.out.println("Creando 3 objetos Empleado...");
        Empleado emp1 = new Empleado("ALJM0101013F1", "Manuel Alcantara", 5000);
        Empleado emp2 = new Empleado("LOMS070707297", "Salvador Lopez", 2000);
        Empleado emp3 = new Empleado("MISL020202", "Eduardo Miranda", 10000);
        
        System.out.println("Mostrando informacion ...");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        System.out.println("Actualizando informacion de empleado 3...");
        emp3.setNombre("Luis Eduardo Miranda Sanchez");
        emp3.setRfc("MISL0202028S1");
        emp3.setSueldo(9000);
        
        System.out.println("Los datos han sido actualizados correctamente:");
        System.out.println("numero: " + emp3.getNoEmpleado());
        System.out.println("nombre: " + emp3.getNombre());
        System.out.println("rfc: " + emp3.getRfc());
        System.out.println("sueldo: " + emp3.getSueldo());
        
        System.out.println("Realizando aumento en la nomina...");
        emp1.aumentarSueldo(20);
        emp2.aumentarSueldo(30);
        emp1.aumentarSueldo(200);
        
        System.out.println("Mostrando informacion actualizada...");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        Empleado emp4 = new Empleado("LOMS070707297", "Salvador Lopez", 2000);
        Empleado emp5 = emp2;
        
        if(!emp2.equals(emp4) && emp2.equals(emp5)) {
            System.out.println("Metodo equals correctamente implementado.");
        } else {
            System.out.println("Metodo equals mal implementado.");
        }
        
    }
    
}
