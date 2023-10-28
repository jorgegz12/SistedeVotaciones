
package ejemplometodos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class metodos {
   
    public void contrasenia (){
        Scanner scan = new Scanner(System.in);
        System.out.println("BIENVENIDO AL SISTEMA DE VOTACIONES");
        String contrasenia;
        System.out.println("Ingrese una contrasenia para el usuario admin");
        contrasenia = scan.next();
        String contraseniaAdmin;
        contraseniaAdmin = contrasenia;
        if (contrasenia == contraseniaAdmin){
        System.out.println("Contrasenia creada con exito.");
      } else {System.out.println("contrasenia incorrecta");} 
      }
    public void registroUsuario () throws IOException{
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Ingrese una opcion:");
        System.out.println("1. Crear usuario del sistema");
        System.out.println("2. Modificar usuario del sistema");
        System.out.println("3. reiniciar contraseña");
        opcion = scan.nextInt();
        switch (opcion){
        case 1: 
                FileWriter fichero = new FileWriter ("C:/Users/jorge/Documents/NetBeansProjects/ejemplometodos/RegistroUsuarios.txt");
                {System.out.println("Ingrese un nombre:");
                String nombre = scan.next();
                System.out.println("ingrese un apellido");
                String apellido = scan.next();
                System.out.println("Ingrese un correo electronico");
                String correo = scan.next();
                System.out.println("Ingrese una contrasenia para su usuario");
                String contraseniaUsuario = scan.next();
                String contraseniaUsuario2 = contraseniaUsuario;
                contraseniaUsuario = contraseniaUsuario2;
                System.out.println("Tipos de roles para asignar al usuario");
                System.out.println("1. Administrador: tendran acceso a todas las funcionalidades del sistema. ");
                System.out.println("2. Registradores de votantes : tendran acceso a realizar el registro de votantes. ");
                System.out.println("3 .Votante: tendran acceso para realizar el voto. ");
                System.out.println("4. Auditor: tendran acceso a los reportes. ");
                   int Administrador = 1;
                   int Registrador = 2;
                   int Votante = 3;
                   int Auditor = 4; 
                   int rol = 1;
                   int i = 0;
                   System.out.println("Elija la opcion de rol o roles asignados al usuario");   
                   System.out.println("Presione 0 para finalizar la asignacion de roles a l usuario");  
                   while ( rol > 0) { 
                        rol = scan.nextInt(); 
                        if (rol == 1){ System.out.println("Administrador");}
                        if (rol == 2){ System.out.println("Registrador");}
                        if (rol == 3){ System.out.println("Votante");}   
                        if (rol == 4){ System.out.println("Auditor");}
                fichero.write("REGISTRO DE USUARIO.\n"+nombre+"\n"+apellido+"\n"+correo+"\n"+contraseniaUsuario+"\n"+rol) ;
                } fichero.close();
       }break;
        case 2: 
                System.out.println("2. Modificar usuario del sistema");  
        break;
        
        case 3:
                System.out.println("3. reiniciar contraseña");
        break;}                    
    }
    public String registroVotantes (){
    Scanner scan = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Ingrese una opcion:");
        System.out.println("1. Agregar Votante");
        System.out.println("2. Modificar Votante");
        System.out.println("3. Reiniciar contraseña de votante");
        System.out.println("4. Registrar fallecimiento de votante");
        opcion = scan.nextInt();
    switch (opcion){    
        case 1:    
        System.out.println("Ingrese nombres completos");
        String nombreCompleto = scan.next();
        System.out.println("Ingrese Apellidos completos");
        String apellidoCompleto = scan.next();
        System.out.println("Ingrese Numero de CUI");
        String Cui = scan.next();
        System.out.println("Ingrese tipo de sexo");
        System.out.println("1.Masculino 2. Femenino");
        String Sexo = scan.next();
        System.out.println("Ingrese fecha de nacimiento");
        String FechadeNacimiento = scan.next();
        System.out.println("Ingrese direccion de resisdencia");
        String direccionResidencia = scan.next();
        System.out.println("Ingrese municipio de residencia");
        String  municipioResidencia= scan.next();
        System.out.println("Ingrese departamento de residencia");
        String departamentoResidencia = scan.next();
        System.out.println("Ingrese pais de residencia");
        String paisResidencia = scan.next();
        System.out.println("Ingrese un correo electronico");
        String correoVotante = scan.next();
        break;
        case 2:
        System.out.println("2. Modificar Votante");
        break;
        case 3:
        System.out.println("3. Reiniciar contraseña de votante");
        break;
        case 4:
        System.out.println("4. Registrar fallecimiento de votante");
        break;
        }  System.out.println("Ingrese un correo de votante nuevamente");
        String correoVotante = scan.next();
        return correoVotante;
    }
    public void AdministracionElecciones(){
    Scanner scan = new Scanner (System.in);
    int opcion = 0;
        System.out.println("Ingrese una opcion:");
        System.out.println("1. Gestionar elecciones");
        System.out.println("2. Gestionar Candidato");
        System.out.println("3. Configurar opcion de eleccion");
        opcion = scan.nextInt();
        switch (opcion) {
        case 1:  
                 System.out.println("Titulo de eleccion"); 
                 String titulo = scan.next(); 
                 System.out.println("Proposito de eleccion"); 
                 String proposito = scan.next();
                 System.out.println("Descripcion de Eleccion"); 
                 String descripcion = scan.next();
                 System.out.println("Digite un codigo unico de identificacion"); 
                 String codigoEleccion = scan.next();
                 System.out.println("Fecha de inscripcion"); 
                 String fechaIns = scan.next();
                 System.out.println("Horario de inscripcion"); 
                 String horarioIns = scan.next();
                 System.out.println("Fecha de Votacion"); 
                 String fechaVot = scan.next();
                 System.out.println("Horario de VOtacion"); 
                 String HorarioVot = scan.next();
            break;
                 
        case 2: 
                System.out.println("Gestion de Candidatos");
                System.out.println("Nombre completo del candidato");
                String nombreCandidato = scan.next();
                System.out.println("Ingrese formacion academica del candidato");
                String formacion = scan.next();
                System.out.println("Ingrese la experiencia profecional del candidato");
                String experiencia = scan.next();
                System.out.println("Ingrese un Codigo unido de identicacion");
                String codigoCandidato = scan.next();
            break;
        case 3: 
                System.out.println("Configuracion de opciones de eleccion");        
                System.out.println("Digite el codigo unico de identificacion que desea configurar");
                codigoEleccion = scan.next();
                codigoCandidato = scan.next();
                System.out.println("Nombre completo del candidato");
                nombreCandidato = scan.next();
                System.out.println("Formacion academica del candidato");
                formacion = scan.next();
                System.out.println("Experiencia profecional del candidato");
                experiencia = scan.next(); 
            break;
            }  
    }
     public void AccesoVotante(){
        Scanner scan = new Scanner (System.in);    
        System.out.println("Ingrese correo electronico de votante");
        String correoVotante = scan.next();
        System.out.println("Ingrese la contraseña provista de votante");
        String contraseniaVotante = scan.next();      
        System.out.println("Ingrese Cui de votante ");
        String cuiVotante = scan.next();
        String Cui;
        Cui = cuiVotante;
    if (Cui == cuiVotante){
        System.out.println(" Verificacion de que la Elección se encuentre activa  en base a las fechas configuradas ");
        }  else {System.out.println("Cui no registrado");  
        }
        }
    public void ejecucionElecciones (){
    System.out.println("Eleccion de candidatos.");  
    Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese una opcion:");
        System.out.println("ELECCION 1");
        System.out.println("ELECCION 2");
        System.out.println("ELECCION 3");
        int opcion = 0;
        opcion = scan.nextInt();  
         int voto;
         int si = 1; 
         int no = 2;
         int seleccion = 0;
             si = 1;
             no = 2;
        switch (opcion) {
        case 1: 
                System.out.println("Candidato 1");
                System.out.println("Confirma que desea votar por el candidato 1?");
                System.out.println("1.Si 2.No)");
               
                seleccion = scan.nextInt(); 
                if (seleccion == si){System.out.println("Voto Confirmado");}
                else {System.out.println("voto no confirmado");}
                if (seleccion == no){System.out.println("seleccione una nuevo candidato");}
        break;
        case 2:
                System.out.println("Candidato 2");
                System.out.println("Confirma que desea votar por el candidato 2?");
                System.out.println("1.Si 2.No)");
                seleccion = scan.nextInt(); 
                if (seleccion == si){System.out.println("Voto Confirmado");}
                else {System.out.println("voto no confirmado");}
                if (seleccion == no){System.out.println("seleccione una nuevo candidato");}
        break;        
        case 3:
                System.out.println("Candidato 3");
                System.out.println("Confirma que desea votar por el candidato 3?");
                System.out.println("1.Si 2.No)");
                seleccion = scan.nextInt(); 
                if (seleccion == si){System.out.println("Voto Confirmado");}
                else {System.out.println("voto no confirmado");}
                if (seleccion == no){System.out.println("seleccione una nuevo candidato");}
        break;
        }
}
}     
     
