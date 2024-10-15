import java.util.Scanner;

public class EjercicioArrays {
    public static void main(String[] args) {

        String[] datos = {"74", "b", "u", "81", "a", "x", "986", "7", "v", "59", "o", "e"};

        //Calcular sumatoria de los numeros
        //Contar y almacenar las vocales
        //Contar y almacenar las consonantes

        Scanner sc = new Scanner(System.in);
        int sumatoria = 0;
        int nvocales = 0;
        int nconsonantes = 0;
        String vocales = " " ;
        String consonantes = " " ;
        String voc = "aeiou" ;
        String numeros = "1234567890" ;

        //1.- Interar sobre el array

        String temp = "" ;
        for (int i = 0; i < datos.length; i++) {
            temp = datos[i];

            try {
                sumatoria = sumatoria + Integer.parseInt(temp);

            } catch (Exception ex) {
                ex.printStackTrace();
                if (numeros.indexOf(temp) >= 0) {    //filtra numeros
                } else if (voc.indexOf(temp.toLowerCase()) >= 0) {   //Filtra vocales
                    nvocales++;
                    vocales = vocales + temp;
                } else {//no me quedan mas que consonantes
                    nconsonantes++;
                    consonantes = consonantes + temp;

                }
                System.out.println(">>>>>>>>> SYNTAX ERROR, PERO SEGUIMOS");
            }

        }
        System.out.println("Cantidad de vocales: " + nvocales);
        System.out.println("Cantidad de consonantes: " + nconsonantes);
        System.out.println("Vocales: " + vocales);
        System.out.println("consonantes: " + consonantes);
        System.out.println("Sumatoria: " + sumatoria);


    }
}
