import java.util.Arrays;
import java.util.Scanner;

public class xx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] calificaciones = new int[5];
        int suma = 0;


        //Recibir las 5 calificaciones de 5 alumnos
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingresa las calificaciones para el alumno:" + 1);

            for (int k = 0; k < calificaciones.length; k++) {
                System.out.println("Calificacion:" + k + ", alumno" + i);
                calificaciones[k] = sc.nextInt();
                suma = suma + calificaciones[k];
            }
            System.out.println("promedio:" + i + ":" + (suma / calificaciones.length));
            suma = 0;
        }

    }
}