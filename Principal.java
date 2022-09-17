package atlas;

import java.util.Date;
import atlas.DTO.Club;
import atlas.DTO.Usuario;
import atlas.DTO.Suscripcion;

public class Principal {
    public static void main(String[] args) {
        int correlativo = 0;
        
        System.out.println("Bienvenido a ATLAS CLUB");
        
        System.out.println("Creando Usuario");
        Usuario c = new Usuario();
        c.setId(1000);
        c.setRun(18742228, '0');
        c.setNombre("dcog");
        c.setEmail("david.cogiolle@gmail.com");
        c.setContrasena("MeBsd3571f");
        c.setEdad(25);
        c.setTelefono(569587658);
        
        System.out.println("Creado cliente: "+ c.getNombre());
        
        System.out.println("Ingresando Suscripción");
        Suscripcion a = new Suscripcion();
        a.setSuscripcion(1000);
        a.setNombre("Usuario1");
        a.setEquipos("ARH11");
        a.setAbonoTotal(25150);
              
        System.out.println("Creado Suscripción: "+ a.getSuscripcion());
    }
}
