import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] calificaciones = new int[5];


        Scanner sc = new Scanner(System.in);
        double promedio =0.0;
        int suma =0;

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < 5; k++) {
                System.out.println("Ingrese la calificacion del alumno "+(i+1)+": ");
                calificaciones[k]=sc.nextInt();
                suma = suma + calificaciones[k];

            }
            System.out.println("Promedio:"+(suma/calificaciones.length));
        }


    }
}