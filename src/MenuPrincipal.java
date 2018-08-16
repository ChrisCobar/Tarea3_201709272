/**
 *
 * @author cris
 */
import java.util.Scanner;

public class MenuPrincipal {
    
    public static String [] usuarios; //declaracion de un vector llamado usuarios
    
    public static void main(String[] args) { //metodo principal donde inicia la ejecucion de todo programa en JAVA
        
        MenuPrincipal.menuprincipal(); //llamada al metodo que contiene al menu principal
           
    }
    
    //......................................................................................................................................
    //......................................................................................................................................
    
    public static void menuprincipal(){
        
        try{ // inicio de la evaluacion del codigo, que evitara errores en tiempo de ejecucion
            
        int a;  //declaracion de una variable para evaluar el swich
        Scanner menu = new Scanner(System.in);  //se instancia un objeto de tipo scanner para poder capturar la opcion del usuario
        
        System.out.println("----------------------------------------------------"); // se imprime en consola el menu 
        System.out.println("----------------------------------------------------");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de digitos repetidos");
        System.out.println("3. Tres numeros de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        a = menu.nextInt(); // se guarda en la variable a, la opcion que ingreso el usuario
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        
        switch(a){ // esta estructura de control, permite evaluar a que opcion del menu se desea ingresar
            case 1:
             MenuPrincipal.usuarios(); // nos permite ir al metodo usuarios de la clase MenuPrincipal
             
            break;
            
            case 2:
            break;
            
            case 3:
            break;
            
            case 4:
            break;
            
            case 5:
                System.out.println("ADIOS ;V"); //termina la ejecucion del programa
            break;
            default:
                System.out.println("Esta opcion no existe, elegir un numero del 1 al 5"); // como la opcion ingresada es un numero invalido, regresa al menu principal
                MenuPrincipal.menuprincipal();
                break;
          
        }
        }catch(Exception e){ // permite la captura de cualquier error y nos regresa al menu principal
            System.out.println("ERROR, opcion invalida, intente otra vez");
            MenuPrincipal.menuprincipal();
        }
    }
    //......................................................................................................................................
    //......................................................................................................................................
       
    public static void usuarios(){
        try{ // inicio de la evaluacion del codigo, que evitara errores en tiempo de ejecucion
        int teclado; //declaracion de una variable para evaluar el swich
        Scanner menu = new Scanner(System.in);  //se instancia un onjeto de tipo scanner para poder capturar la opcion que desea el usuario
        
        System.out.println("OPCION USUARIOS");
        System.out.println("1. Ingresar usuario");
        System.out.println("2. Mostrar usuarios ascendente");
        System.out.println("3. Mostrar usuarios descendente");
        System.out.println("4. Menu principal");
        teclado = menu.nextInt();
        
        switch(teclado){
            case 1:
                    
                MenuPrincipal.ingresarUsuarios(); // llamada al metodo ingresar usuarios
                
            break;
            
            case 2:
                System.out.println("ordenados de iltimo a primero: "); // ya que el vector es pequeño, se imprime desde la ultima posicion a la primera
                System.out.println("5: "+usuarios[4]);
                System.out.println("4: "+usuarios[3]);
                System.out.println("3: "+usuarios[2]);
                System.out.println("2: "+usuarios[1]);
                System.out.println("1: "+usuarios[0]);
                System.out.println("----------------------------------------------------");
                MenuPrincipal.usuarios(); // regreso al menu usuarios
            break;
            
            case 3:
                System.out.println("ordenados de primero al ultimo: "); // ya que el vector es pequeño, se imprime desde la primera a la ultima
                System.out.println("1: "+usuarios[0]);
                System.out.println("2: "+usuarios[1]);
                System.out.println("3: "+usuarios[2]);
                System.out.println("4: "+usuarios[3]);
                System.out.println("5: "+usuarios[4]);
                System.out.println("----------------------------------------------------");
                MenuPrincipal.usuarios(); // regreso al menu usuarios
            break;
            
            case 4:
                MenuPrincipal.menuprincipal(); // metodo de la clase menu que nos permite regresar al menu principal
            break; 
            default:
                System.out.println("Esta opcion no existe, elegir un numero del 1 al 4"); // como la opcion ingresada es un numero invalido, regresa al menu 
                MenuPrincipal.usuarios();
                break;
        }
    
        }catch(Exception e){ // permite la captura de cualquier error y nos regresa al menu de usuario
            System.out.println("ERROR, opcion invalida, intente otra vez");
            MenuPrincipal.usuarios();
        }
    }
    
    //......................................................................................................................................
    //......................................................................................................................................
     public static void ingresarUsuarios(){
         
         //String [] usuarios; //declaracion de un vector llamado usuarios
         usuarios = new String[5]; //creacion del vector que guardara los 5 usuarios
         Scanner teclado = new Scanner(System.in);
         String user;
         System.out.println("Bienvenido a ingreso de usuarios");// mensaje en pantalla para el usuario
         System.out.println("Ingrese el usuario 1");
         user = teclado.next();  // lee lo que el usuario ingresa y lo guarda en la variable user
         usuarios [0] = user;    // asigna al vector en la primera posicion el usuario que ingresa el usuario
         System.out.println("Ingrese el usuario 2"); // mensaje para pedir el siguiente usuario
         user = teclado.next(); // almacena en la variable user
         //....
         while(user.equals(usuarios [0])){ //ciclo que evalua si el segundo usuario es igual al primero
             System.out.println("ERROR este usuario ya existe, por favor ingrese uno diferente: ");
             user = teclado.next();
        }
         usuarios [1] = user; // al salir del ciclo guarda el segundo usuario
         
         System.out.println("Ingrese el usuario 3");
         user = teclado.next(); // almacena el la variable user
         while(user.equals(usuarios [0]) || user.equals(usuarios [1])){ //ciclo que evalua si el tercer usuario es igual a alguno de los anteriores
             System.out.println("ERROR este usuario ya existe, por favor ingrese uno diferente: ");
             user = teclado.next();
        }
         usuarios [2] = user; // al salir del ciclo guarda el tercer usuario
         
         System.out.println("ingrese el usuario 4");
         user = teclado.next(); // almacena el la variable user
         while(user.equals(usuarios [0]) || user.equals(usuarios [1]) || user.equals(usuarios [2])){ //ciclo que evalua si el cuarto usuario es igual a alguno de los anteriores
             System.out.println("ERROR este usuario ya existe, por favor ingrese uno diferente: ");
             user = teclado.next();
        }
         usuarios [3] = user; // al salir del ciclo guarda el cuarto usuario
         
         System.out.println("ingrese el usuario 5");
         user = teclado.next(); // almacena el la variable user
         while(user.equals(usuarios [0]) || user.equals(usuarios [1]) || user.equals(usuarios [2]) || user.equals(usuarios [3])){ //ciclo que evalua si el quinto usuario es igual a alguno de los anteriores
             System.out.println("ERROR este usuario ya existe, por favor ingrese uno diferente: ");
             user = teclado.next();
        }
         usuarios [4] = user; // al salir del ciclo guarda el cuarto usuario
         System.out.println("Usuarios guardados exitosamente");// mensaje que confirma el guardado de los usuarios
         System.out.println("----------------------------------------------------");
         
         MenuPrincipal.usuarios(); // metodo que regresa al menu de usuarios
         
     }
     
    //......................................................................................................................................
    //......................................................................................................................................
    
     
    
}
