import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {


        String [][] matriz1 = new String[4][5];

        for (int i = 0; i < matriz1.length; i++) {//length para la longitud

            for (int x = 0; x < matriz1[i].length; x++) {
                System.out.println(matriz1[i][x]+ " indices" +i+ "-"+x);
                System.out.print("Ingresa un valor ");

            }

        }

    }

}
