import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// ( EJERCICIO 1)
//int[] calificaciones = new int[5];
//int suma=0;
//
//        Scanner sc = new Scanner(System.in);
//calificaciones[3] = 10;
//
//for (int i=0; i<5; i++){
//            System.out.println("ingresa las calificaciones para el alumno "+i);
//            for (int j=0; j<calificaciones.length; j++){
//                System.out.println("calificaciones:" +j+ ", alumno:"+i);
//                calificaciones[j]=sc.nextInt();
//                suma+=calificaciones[j];
//            }
//    System.out.println("promedio" +i+ " :"+ (suma/calificaciones.length) +"\n");
//        }


        // ( EJERCICIO DOS )

        String[] dato = {"102", "b", "u", "80", "A", "x", "900","7","v","55","o","e"};
        int sumatoria = 0, nvocales=0, nconsonantes=0;
        String vocales= "aeiou", consonantes="", numeros = "0123456789", vocaless= "";
        String temp="";
        for (int i =0; i < dato.length;i++){

            temp=dato[i];

            try {
                sumatoria = sumatoria + Integer.parseInt(temp); //filtra numeros


            }catch (Exception ex){
                ex.printStackTrace();
                System.out.println(">>>>>>>> HUBO UN ERROR");

                if (vocales.indexOf(temp.toLowerCase())>=0) {  //filtra vocales
                    nvocales++;
                    vocaless= vocaless+temp;
                    //nvocales = nvocales + Integer.parseInt(temp.toLowerCase());
                } else {
                    nconsonantes++;  //se filtran consonantes
                    consonantes=consonantes+temp;
                }

            }


            }
        System.out.println("cantidad de vocales : "+nvocales);
        System.out.println("cantidad de consonantes : "+nconsonantes);
        System.out.println("vocales : "+vocales);
        System.out.println("consonantes : "+consonantes);
        System.out.println("sumatoria : "+sumatoria);
    }
}