import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String a = "Hola";
        String b = "hola";

        int c = 90;
        int d = 60;

        //if(a.toUpperCase().equals(b.toUpperCase())){
        if(c>d){
            //Cuando la condicion sea verdadera
            System.out.println("Si se cumple");
        } else {
            // Cuando la condicion sea falsa
            System.out.println("No se cumple la condicion");
        }
        */

        double presupuesto = 850.50;
        String diaSemana = "Jueves";
        boolean promocion = true;
        String clima = "Soleado";

//        //AND
//        System.out.println(presupuesto < 1500 || diaSemana.equals("Viernes"));
//        if (presupuesto > 1500 && diaSemana.equals("Viernes")){
//            System.out.println("Salir");
//        } else {
//            System.out.println("No salimos :c");
//        }
//
//        //OR
//        if(presupuesto < 1500 || diaSemana.equals("Viernes") || clima.equals("Soleado")){
//            System.out.println("Salir");
//        }else {
//            System.out.println("No salir :c");
//        }


//        //NOT
//        if(!promocion){
//            System.out.println("Salir");
//        } else{
//            System.out.println("No salir");
//        }

        Scanner sc = new Scanner(System.in);
        String noControl;
        System.out.println("Ingresa el numero de control: ");
        noControl = sc.nextLine();
        System.out.println(noControl+ " numero ingresado");
        //String numero2 = "17280320";

        //13230463
        System.out.println(noControl.substring(4));

        System.out.println(noControl.substring(2,4));

        //charAt
        System.out.println(noControl.charAt(4));

        //indexOf
        System.out.println(noControl.indexOf("3"));

        //lastIndexOf
        System.out.println(noControl.lastIndexOf("3"));

        //contains
        System.out.println(noControl.contains("7"));

        //Mayusculas Minusculas
        System.out.println(noControl.toUpperCase());
        System.out.println(noControl.toLowerCase());

    }
}