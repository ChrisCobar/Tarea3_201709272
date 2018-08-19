/**
 *
 * @author cris
 */
import java.util.Scanner;

public class MenuPrincipal {
    
    public static String [] usuarios; //declaracion de un vector llamado usuarios
    public static int contadorNum; // variable que captura el numero entero ingresado por el usuario
    //public static String caracteresNum;
    public static int numeroElecto;
    public static int numMayor, numMenor, numMedio;
    public static int a ,b,c; // variables que almacenaran los numeros para la opcion de mayor a menor en el menu
    public static int matrizAlumnos [][] = new int [6][6]; // matriz en la que se guardaran las notas de los alumnos
    
    
    
    //......................................................................................................................................
    //......................................................................................................................................
    
    public static void menuprincipal(){
        
        try{ // inicio de la evaluacion del codigo, que evitara errores en tiempo de ejecucion
            
        int a;  //declaracion de una variable para evaluar el swich
        Scanner menu = new Scanner(System.in);  //se instancia un objeto de tipo scanner para poder capturar la opcion del usuario
        
        System.out.println("----------------------------------------------------"); // se imprime en consola el menu 
        System.out.println("-------------------------MENU-----------------------");
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
                MenuPrincipal.contadorDigitos();
            break;
            
            case 3:
                MenuPrincipal.mayorMenor();
            break;
            
            case 4:
                MenuPrincipal.promedioAlumnos();
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
        
        System.out.println("-----------------OPCION USUARIOS--------------------");;
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
                System.out.println("---------------------------------------------------");
                System.out.println("ordenados de ultimo a primero: "); // ya que el vector es pequeño, se imprime desde la ultima posicion a la primera
                System.out.println("5: "+usuarios[4]);
                System.out.println("4: "+usuarios[3]);
                System.out.println("3: "+usuarios[2]);
                System.out.println("2: "+usuarios[1]);
                System.out.println("1: "+usuarios[0]);
                System.out.println("----------------------------------------------------");
                MenuPrincipal.usuarios(); // regreso al menu usuarios
            break;
            
            case 3:
                System.out.println("---------------------------------------------------");
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
         System.out.println("---------------------------------------------------");
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
    public static void contadorDigitos(){
        
        int teclado; //declaracion de una variable para evaluar el swich
        Scanner menu = new Scanner(System.in);  //se instancia un onjeto de tipo scanner para poder capturar la opcion que desea el usuario
        
    
        System.out.println("-----------CONTADOR DE DIGITOS----------------------");
        System.out.println("1. Ingresar numero");
        System.out.println("2. Ingresar numero a buscar");
        System.out.println("3. mostrar numero de digitos");
        System.out.println("4. Menu principal");
        teclado = menu.nextInt();
        System.out.println("----------------------------------------------------");
        switch(teclado){
            
            case 1:
                System.out.println("----------------------------------------------------");
                System.out.println("Ingrese Numero: ");
                contadorNum = menu.nextInt(); // se guarda la variable ingresada por el usuario en una variable global
                System.out.println("numero guardado");
                System.out.println("----------------------------------------------------");
                MenuPrincipal.contadorDigitos();
                
                break;
            case 2:
                System.out.println("----------------------------------------------------");
                System.out.println("Ingrese un numero entero entre 0 a 9");
                teclado = menu.nextInt();
                numeroElecto = teclado;
                System.out.println("numero guardado");
                System.out.println("----------------------------------------------------");
                MenuPrincipal.contadorDigitos();
                break;
            case 3:
                
                MenuPrincipal.opcion3Contador();
                MenuPrincipal.contadorDigitos();
                
            case 4:
                MenuPrincipal.menuprincipal(); // metodo de la clase menu que nos permite regresar al menu principal
                break;
            
            default:
                System.out.println("Esta opcion no existe, elegir un numero del 1 al 4"); // como la opcion ingresada es un numero invalido, regresa al menu 
                MenuPrincipal.contadorDigitos();
                break;
        }
    
    }
    //......................................................................................................................................
    //......................................................................................................................................
    public static void opcion3Contador(){
    
        String numero; // se declara una variable de tipo cadena
        numero = Integer.toString(contadorNum); //se utiliza la variable de tipo cadena para convertir el numero a cadena
        
        int contador=0; //contador que servira para registrar cuantas veces se repite el numero
        char letra1;
        char [] vector;
        
                 vector = numero.toCharArray(); // llamamos al metodo que nos optiene todos los caracteres de la cadena
                
                switch(numeroElecto){ // se evalua el numero ingresado en la opcion 2 (numero a buscar)
                    case 0:
                        for (int i = 0; i < vector.length; i++) { //ciclo que recorre el vector en busca de las posiciones donde es igual al caracter
                            letra1 = vector[i];
                             if (letra1 == '0') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 1:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (vector[i] == '1') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 2:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (letra1 == '2') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 3:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (letra1 == '3') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 4:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (letra1 == '4') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 5:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (letra1 == '5') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 6:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (letra1 == '6') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 7:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (letra1 == '7') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 8:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (letra1 == '8') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    case 9:
                        for (int i = 0; i < vector.length; i++) {
                            letra1 = vector[i];
                             if (letra1 == '9') {
                                contador++;                               
                            }      
                        }
                        System.out.println("EL numero "+numeroElecto+" aparece:");
                        System.out.println(+contador+ " veces");
                        break;
                    default:
                        System.out.println("error, intente otra vez");
                        break; 
                }            
    }
    
    //......................................................................................................................................
    //......................................................................................................................................
  
    public static void mayorMenor(){
        
        int opcion; //variable para capturar la opcion del usuario 
        Scanner leer = new Scanner(System.in);
        
        System.out.println("----------TRES_NUMEROS_DE_MAYOR_A_MENOR-------------");
        System.out.println("1. Ingresar Numeros");
        System.out.println("2. Mostrar ordenados");
        System.out.println("3. Menu principal");
        opcion = leer.nextInt();
        leer.nextLine();
        
        switch (opcion){
            case 1:
                System.out.println("Ingrese el primer numero: "); // guardado de los tres numeros en variables locales
                a = leer.nextInt();
                leer.nextLine(); // limpia el buffer

                System.out.println("Ingrese el segundo numero: ");
                b = leer.nextInt();
                leer.nextLine(); // limpia el buffer

                System.out.println("Ingrese el tercer numero: ");
                c = leer.nextInt();
                leer.nextLine(); // limpia el buffer
                
                System.out.println("Numeros Guardados");
                MenuPrincipal.mayorMenor();
                
                break;
            case 2:

                if (a > b && a > c) { // if anidados que encuentran el numero mayor
                    numMayor = a; // se guarda a en la variable numero mayor
                } else if (b > a && b > c){
                    numMayor = b;    // se guarda a en la variable numero mayor
                } else if (c > a && c > b){
                    numMayor = c;    // se guarda a en la variable numero mayor
                }
                
                
                if (a < b && a < c) { // if anidados que encuentran el numero menor
                    numMenor = a; // se guarda a en la variable numero menor
                } else if (b < a && b < c){
                    numMenor = b;    // se guarda a en la variable numero menor
                } else if (c < a && c < b){
                    numMenor = c;    // se guarda a en la variable numero menor
                }
                
                
                
                if (a < numMayor && a > numMenor) { // if anidados que encuentra el numero medio
                    numMedio = a; // se guarda a en la variable numero medio
                } else if (b < numMayor && b > numMenor) {
                    numMedio = b; // se guarda a en la variable numero medio
                } else if (c < numMayor && c > numMenor) {
                    numMedio = c; // se guarda a en la variable numero medio
                } else {
                    System.out.println("Los numeros son iguales");
                }
                System.out.println("el mayor: "+numMayor); // se imprime en pantalla los tres numeros ordenados
                System.out.println("el medio: "+numMedio);
                System.out.println("el menor: "+numMenor);

                MenuPrincipal.mayorMenor();
                
                break;
            case 3:
                MenuPrincipal.menuprincipal();
                break;
            default:
                System.out.println("Opcion no valida, intente otra vez");
                MenuPrincipal.mayorMenor();
                break;
        }
    }
    
    //......................................................................................................................................
    //......................................................................................................................................
    
    public static void promedioAlumnos(){ // metodo de la clase al que se accede al seleccionar la opcion 4
        String titulos [] = {"Id","Nota 1","Nota 2","Nota 3","Nota 4","Promedio"}; // titulos de la tabla donde se mostraran los datos
        Scanner notas = new Scanner(System.in);
        int opcion; //para evaluar el switch
        int fila; // para poder recorrer las filas de la matriz
        int columna; // para poder recorrer las columnas de la matriz
        
        System.out.println("---------------PROMEDIO-DE-ALUMNOS------------------"); // menu que se le muestra al usuario con tres opciones
        System.out.println("1. Regristar Notas");
        System.out.println("2. Mostrar Notas");
        System.out.println("3. Menu Principal");
        opcion = notas.nextInt();
        System.out.println("----------------------------------------------------");
    
        switch(opcion){ 
            case 1:
                    MenuPrincipal.ingresoNotas(); // metodo que sirve para ingresar notas
                
                break;
            case 2:
                
                for (int i = 0; i < titulos.length; i++) { // bucle que imprime los encabezados de la matriz de notas
                    System.out.print("\t"+titulos[i]+" ");     
                }
                System.out.println(""); // salto de linea que sirve para separar los encabezados
                
                for(fila = 0; fila<matrizAlumnos.length; fila++){ // bucle que recorre las filas de a matrizAlumnos
             
                    for(columna = 0; columna<matrizAlumnos.length; columna++){ // bucle que recorre las columnas de la matrizAlumnos
                    System.out.print("\t"+matrizAlumnos[fila][columna]+" "); // imprimir en pantalla fila y columnas
                
                    }
                System.out.println(""); // separacion de fila
                }
                
                System.out.println("----------------------------------------------------");
                MenuPrincipal.promedioAlumnos(); // llamada al metodo para regresar al sub-menu
                
                break;
            case 3:
                MenuPrincipal.menuprincipal(); // llamada al menu principal
                break;   
            default:
                System.out.println("Opcion no valida, intente nuevamente...");
                MenuPrincipal.promedioAlumnos();
        
        }
    }
    
    
    //......................................................................................................................................
    //......................................................................................................................................
  
    public static void ingresoNotas(){
        int id=1; // variable que identifica que numero de alumno es 
        int nota1 = 0,nota2 = 0,nota3 = 0,nota4 = 0,promedio = 0; // para almacenar temporalmente las notas de cada alumno
     
        Scanner notas = new Scanner(System.in); // para poder leer las notas de los alumnos

            while(id < 7){ // bucle que me permite ingresar las notas de cada alumno
                
                System.out.println("----------------------------------------------------");
                System.out.println("Alumno "+id); // bucle que se repite una vez por  alumno
                for (int j = 1; j < 2; j++) {
                    
                System.out.println("Ingrese la primera nota: ");
                nota1 = notas.nextInt();
                notas.nextLine();
                System.out.println("Ingrese la segunda nota: ");
                nota2 = notas.nextInt();
                notas.nextLine();
                System.out.println("Ingrese la tercer nota: ");
                nota3 = notas.nextInt();
                notas.nextLine();
                System.out.println("Ingrese la cuarta nota: ");
                nota4 = notas.nextInt();
                notas.nextLine();
                promedio = ((nota1 + nota2 + nota3 + nota4)/4); //calculo del promedio para el alumno actual
                
                }
            switch (id) { // dependiento del id del alumno, las notas y promedio se guardaran en la fila correspondiente
                case 1:
                    matrizAlumnos [0][0] = id;
                    matrizAlumnos [0][1] = nota1;
                    matrizAlumnos [0][2] = nota2;
                    matrizAlumnos [0][3] = nota3;
                    matrizAlumnos [0][4] = nota4;
                    matrizAlumnos [0][5] = promedio;
                    break;
                case 2:
                    matrizAlumnos [1][0] = id;
                    matrizAlumnos [1][1] = nota1;
                    matrizAlumnos [1][2] = nota2;
                    matrizAlumnos [1][3] = nota3;
                    matrizAlumnos [1][4] = nota4;
                    matrizAlumnos [1][5] = promedio;
                    break;
                case 3:
                    matrizAlumnos [2][0] = id;
                    matrizAlumnos [2][1] = nota1;
                    matrizAlumnos [2][2] = nota2;
                    matrizAlumnos [2][3] = nota3;
                    matrizAlumnos [2][4] = nota4;
                    matrizAlumnos [2][5] = promedio;
                    break;
                case 4:
                    matrizAlumnos [3][0] = id;
                    matrizAlumnos [3][1] = nota1;
                    matrizAlumnos [3][2] = nota2;
                    matrizAlumnos [3][3] = nota3;
                    matrizAlumnos [3][4] = nota4;
                    matrizAlumnos [3][5] = promedio;
                    break;
                case 5:
                    matrizAlumnos [4][0] = id;
                    matrizAlumnos [4][1] = nota1;
                    matrizAlumnos [4][2] = nota2;
                    matrizAlumnos [4][3] = nota3;
                    matrizAlumnos [4][4] = nota4;
                    matrizAlumnos [4][5] = promedio;
                    break;
                case 6:
                    matrizAlumnos [5][0] = id;
                    matrizAlumnos [5][1] = nota1;
                    matrizAlumnos [5][2] = nota2;
                    matrizAlumnos [5][3] = nota3;
                    matrizAlumnos [5][4] = nota4;
                    matrizAlumnos [5][5] = promedio;
                    break;
                default:
                    
                    break;
            }
                
                id++; // incremento que sirve para poder pasar al siguiente alumno, tambien para poder salir del while
                
            }
            System.out.println("Notas guardadas exitosamente"); // mensaje que aparece al finalizar el ingreso de notas
            MenuPrincipal.promedioAlumnos(); //retorno al menu de promedios
        
    }
    
    //......................................................................................................................................
    //......................................................................................................................................
  
    
    public static void main(String[] args) { //metodo principal donde inicia la ejecucion de todo programa en JAVA
        
        MenuPrincipal.menuprincipal(); //llamada al metodo que contiene al menu principal
           
    }
}
