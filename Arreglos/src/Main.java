import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // declarando el arrau
        int [] calificaciones =new int[5];
        int suma =0;

        // recibir las 5 calificaciones de 5 alumnos
        for (int i = 0; i <calificaciones.length; i++) {
            System.out.println(" Ingrese las calificaciones " +i);

            for (int k = 0; k <calificaciones.length; k++) {
                System.out.println(" calificacion " + k + "alumno " +i);
                calificaciones[k]=sc.nextInt();
                suma+=calificaciones[k];

            }
            System.out.println("promedio :" +i+ ": promedio-" +(suma/calificaciones.length));
            suma =0;

        }

        //ver el interior del array
        // System.out.println(calificaciones[5]);
        //convertir en elntero y ver los valores
        //System.out.println(Arrays.toString(calificaciones));
        }
    }
