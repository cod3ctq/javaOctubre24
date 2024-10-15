import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //IF, IF-ELSE, SWITCH
        /*
        String a = "hola";
        String b = "HolA";
        int c = 90;
        int d = 60;
        System.out.println(c<d);
        //Toda condicion, se reduce siempre a true o false
        if(c<d){
            //Cuando si se cumplea la condicion
            System.out.println("si se cumple");
        }else{
            System.out.println("No se cumple");
        }*/

        //Operadores logicos: AND, OR, NOT

        double presupuesto=850.50;
        String diaSemana="Jueves";
        boolean promocion = true;
        String clima ="soleado";
        //Tablas de verdad:
        //AND
       // System.out.println(presupuesto<1500 || diaSemana.equals("Viernes"));
            //false              false                      :  false
        /*if(presupuesto>1500 && diaSemana.equals("Viernes")){
            System.out.println("Salir");
        }else{
            System.out.println("No salimos :c");
        }*/
        //OR ||
        //          true
        /*if(presupuesto<1500 || diaSemana.equals("Viernes") || clima.equals("soleado")){
            System.out.println("Salir");
        }else{
            System.out.println("No salimos :c");
        }*/
        //NOT !
        /*if( !promocion){
            System.out.println("Salir");
        }else{
            System.out.println("No salgo");
        }*/

        //Leer datos desde teclado
        Scanner sc = new Scanner(System.in);
        //Clase objeto = new Constructor(Argumentos);
        System.out.println("Ingresa el numero de control:");
        //Declara una variable
        String numeroControl = sc.nextLine();
        System.out.println(numeroControl + "numero ingresado");
        //substring(index) -> devuelve una subcadena a partir del indice dado
        System.out.println(numeroControl.substring(4));
        //substring(index,index)-> devuelve una cadena desde y hasta el indice dado
        System.out.println(numeroControl.substring(2,4));
        //Extra el caracter en una posicion especifa
        System.out.println(numeroControl.charAt(4));
        //Devuelve el indice de un caracter dentro de la cadena, si es que lo encuentra
        System.out.println(numeroControl.indexOf("3"));
        //Devuelve el indice de un caracter dentro de la cadena, si es que lo encuentra
        System.out.println(numeroControl.lastIndexOf("3"));
        //Devuelve true|false, dependienso si encuentra o no a un caracter
        System.out.println(numeroControl.contains("7"));
        //mayusculas, minusculas
        System.out.println(numeroControl.toLowerCase());
        System.out.println(numeroControl.toUpperCase());










    }
}