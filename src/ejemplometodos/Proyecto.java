
package ejemplometodos;

import java.io.IOException;

public class Proyecto  {
 
    public static void main(String[] args) throws IOException {
    metodos op = new metodos ();
    op.contrasenia()  ;
    System.out.println("REGISTRO DE USUARIO.");
    op.registroUsuario();
    System.out.println("REGISTRO DE VOTANTE.");
    System.out.println("Correo de registro de votante: "+op.registroVotantes());
    System.out.println("ADMINISTRACION DE ELECCIONES.");
    op.AdministracionElecciones ();
     System.out.println("ACCESO DEL VOTANTE AL SISTEMA.");
    op.AccesoVotante();
    System.out.println("EJECUCION DE ELECCIONES");
    op.ejecucionElecciones ();
    }
    }
