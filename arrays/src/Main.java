import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] calificaciones = new int[5];

        Scanner sc = new Scanner(System.in);
        //Recibir las 5 calificaciones de 5 alumnos
        int suma=0;
        for (int i = 0; i<5; i++){
            System.out.println("Ingresa las calificaciones para el alumno: "+i);

            for (int k=0; k<calificaciones.length; k++){
                System.out.println("Calificacion: "+k+", alumno: "+i);
                calificaciones[k] = sc.nextInt();
                suma = suma + calificaciones[k];
            }
            System.out.println("Promedio: "+i+":"+(suma/calificaciones.length));
        }









    }
}