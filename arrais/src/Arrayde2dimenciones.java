import java.util.Arrays;
import java.util.Scanner;

public class Arrayde2dimenciones {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        String [][]matriz1=new String[4][5];
        for (int i = 0; i <matriz1.length; i++) {

           // System.out.println(Arrays.toString(matriz1[i]));
            for (int x = 0; x < matriz1[i].length; x++) {// mecanismo para saltar de columna en columna
                System.out.println(matriz1[i][x]+"indices "+i+"-"+x);
                System.out.println("Ingrese un valor");
                matriz1[i][x]=sc.nextLine();
            }
        }
String [][] Matriz = {{"3", "4", "#"},
        {"5", "6", "#"}};
        System.out.println(Matriz);




    }
}
