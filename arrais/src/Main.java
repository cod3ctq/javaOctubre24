import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
     int[]calificaciones = new int[5];
     double promedio =0.0;
     int suma=0;
     // escribir 5 calificaciones de 5 alumnos

        for (int i=0;i<calificaciones.length;i++){
            System.out.println("ingresar las calificaciones para el alumno : "+i);

            for (int k=0;k<calificaciones.length;k++){
                System.out.println("calificaciones"  + k +"alumno :" +i);
                calificaciones[k]=sc.nextInt();
                suma=suma+calificaciones[k];

            }
            System.out.println("promedio" + i+" :"+(suma/calificaciones.length));
            suma=0;
        }






    }
}