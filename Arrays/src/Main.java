import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sumatoria = 0f;
        float[] calificaciones = new float[5];

        for (int i = 0; i < 5; i++) {
            sumatoria = 0;
            System.out.println("Alumno "+(i+1));
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingresa calificacion "+(j+1));
                calificaciones[j] = sc.nextFloat();
                sumatoria += calificaciones[j];
            }
            System.out.println("Promedio de alumno "+(i+1)+ " = "+(sumatoria/calificaciones.length)+"\n");
        }
    }
}