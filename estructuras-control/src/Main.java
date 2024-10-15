import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
        //if, if-else, switch

        String a = "hola";
        String b = "HolA";

        int c =90;
        int d= 60;

        System.out.println(c>d);
        if(c>d){
            System.out.println("Si es mayor");

        }else{
            System.out.println("No es menor ");
        }




        if(a.toUpperCase().equals(b.toUpperCase())){
            System.out.println("si se cumple");
            System.out.println(b.toUpperCase());
            System.out.println(b.toUpperCase());

        }else{
            System.out.println("no se cumple");

        }*/

        // System.out.println("");
        //Operadores Logicos AND, OR, NOT


       // double presupuesto = 0;
        //String diaSemana = ""; //"jueves";
        //boolean promocion = true;
        //String clima = "soleado" ;

        /*

       //AND  &&
        System.out.println(presupuesto >1500 && diaSemana.equals("viernes"));
        if (presupuesto >1500 && diaSemana.equals("viernes")) {
            System.out.println("salir");
        } else {
            System.out.println("no salir ");
        }*/

         /*
        //OR ||
        System.out.println(presupuesto <1500 || diaSemana.equals("viernes")|| clima.equals("soleado"));
        if (presupuesto <1500 || diaSemana.equals("viernes")) {
            System.out.println("salir");
        } else {
            System.out.println("no salir ");
        }
        */

/*
        //NOT !
    //    System.out.println(presupuesto <1500 != diaSemana.equals("viernes"));
        if (!promocion) {
            System.out.println("salir");
        } else {
            System.out.println("no salir ");
        }

        */

/*
        //LEER DATOS DESDE EL TECLADO
        //clase - objeto = new - constructor - (argumentos)




        System.out.println("Ingrese el dia de semana: ");
        String diaSemana = sc.nextLine();
        System.out.println("Ingrese el presupuesto: ");
        float presupuesto = sc.nextFloat(); */
        Scanner sc = new Scanner(System.in);
         System.out.println("Numero de control: ");
       String numerocontrol = sc.nextLine();
        System.out.println(numerocontrol + "numero ingresado");

        /*
        if (presupuesto > 1500 || diaSemana.equals("viernes")) {
            System.out.println("salir");
        } else {
            System.out.println("no salir ");
        } */
        System.out.println(numerocontrol.substring( 2));
        System.out.println(numerocontrol.substring(2,4));
        System.out.println(numerocontrol.charAt(2));
        System.out.println(numerocontrol.indexOf("3"));//Devuelve el indice de un caracter dentro de la cadena, si es que lo encuentra
        System.out.println(numerocontrol.lastIndexOf("3"));//Devuelve true|false, dependienso si encuentra o no a un caracter
        System.out.println(numerocontrol.contains("7"));//mayusculas, minusculas
        System.out.println(numerocontrol.toLowerCase());System.out.println(numerocontrol.toUpperCase());






    }
}