import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  // IF, IF ELSE, SWICTH
        String a ="Hola";
        String b ="HolA";

        int c = 90; //representan numero
        int d = 60;
          // si x es mayor que d
        System.out.println(c>d);
        if (d>c){

     /*estructura de desicion
     = es un operador de asignacion
     para comprara una strin se ocupa el metodo a.equals(b)
     if (a==b){
     }else // que quiero que haga si no se cumple la condicion
      */
        // if (a.toUpperCase().equals(b.toUpperCase())) {// metodo comparacion de Objetos
        // Metodo a.equalsIgnoresCases(B) de compracion que no importa si tiene mayucuslas o minusculas
        // a.toUpperCase().equals(b.toUppercase()))){
        // cuando la condicion es verdadera.
        //  System.out.println(" Si se cumple");
        //  System.out.println(" Si se cumple");
        // }else {
        //   System.out.println("No se cumple");
        //   } */
        double presupuesto = 850.50;
        String diadelasemana = "jueves";
        boolean promocion = true;
        String clima = "soleado ";

        //tablas de verdad
        //and
        System.out.println(presupuesto < 1500 || diadelasemana.equals("viernes"));
        // false        Falde   = falso
        //if (presupuesto>1500 && diadelasemana.equals("viernes ")){
        //       System.out.println("salir");
        //    }else {
        //        System.out.println("No se sale ");
        //   }
        //operadoe OR
        //tru
     /*   if (presupuesto < 1500 || diadelasemana.equals("viernes ")) {
            System.out.println("salir");
        } else {
            System.out.println("No salimos :c ");
        }*/
        // not !
       /* if(!promocion){
            System.out.println("salir ");
            }else {
                    System.out.println("No salgo :c ");
            } */
        // Leer datos del teclado
        Scanner entrada = new Scanner(System.in);
        // clase  objeto = crear nuevos objetos constructor (argumentos de los objetos )

        System.out.println("Ingrese su numero de contol");
        
        String numdControl = entrada.nextLine();
        System.out.println("El Numero de control que ingresaste es :"+numdControl);

    }
    }


