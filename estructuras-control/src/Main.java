import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// if else switch
        /*
        String a = "hola ";
        String b = "holA ";
        if (a.toUpperCase().equals(b.toUpperCase())){
            // cuando si se cumpla la condicion
            System.out.println(a.toUpperCase());
            System.out.println(b.toUpperCase());
        }else{
            System.out.println("no se cumple ");
        }
        int c = 90;
        int d = 80;
        if (c < d) {
            System.out.println("no se cumple ");
        } else {
            System.out.println("se cumple ");
        }
*/
        double presupuesto = 850.50;
        String dia_semana = "jueves ";
        boolean promocion = true ;
        String clima = " soleado ";

        System.out.println(presupuesto>1500 && dia_semana.equals("viernes"));
/*
        if (presupuesto>1500 && dia_semana.equals("viernes")){
            System.out.println("Salir ");

        }else {
            System.out.println("no salimos ");
        }
*/
        /*
        if (presupuesto<1500 || dia_semana.equals("viernes")|| clima.equals("soleado")) {
            System.out.println("Salir ");
        }
        else {
            System.out.println("no salimos ");
        }
        // NOT
        /*
        if (!promocion ){
            System.out.println("salir ");

        }else {
            System.out.println("no salgo ");
        }*/
        // leer datos desde el teclado

        Scanner entrada = new Scanner(System.in);
//      clase   objeto = new constructor (argumentos de objeto);

        // declara una variable
        System.out.println("escribe tu numero de control ");
        String numerocontrol;

        numerocontrol= entrada.nextLine();
        System.out.println("el numero de control es : "+numerocontrol);
        // subString (index)-> uns subcadena a partir dek indice dado (corta)
        System.out.println(numerocontrol.substring(4));

// substring (index, index )-> devuelve una cadean desde hasta el indice dado (extrae)
        System.out.println(numerocontrol.substring(2,4));
        // extrae un numero en especifico
        System.out.println(numerocontrol.charAt(4));
        // devuelve el caracter pero solo el primero
        System.out.println(numerocontrol.indexOf("3"));
        // este metodo sirve para tomar un caracter desde el ultimo al primero
        System.out.println(numerocontrol.lastIndexOf("3"));
// devuelce un true o false, depende si encuentra o no el caracter
        System.out.println(numerocontrol.contains("7"));
// mayusculas , minusculas
        System.out.println(numerocontrol.toLowerCase());
        System.out.println(numerocontrol.toUpperCase());







    }
}