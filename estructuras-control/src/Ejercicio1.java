import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

            //DASD24124FASF41224

            Scanner sc = new Scanner(System.in);
            String nombrecompleto;
            String año;
            String mes;
            int dia = 0;
            char sexo;
            String estado;
            String municipio;
            String curp = "";
            String nombre1;
            // String nombre2;
            String primerA;
            String segundoA;
            int suma = 0;


            System.out.println("ingresa el nombre completo :");
            nombrecompleto = sc.nextLine();
            System.out.println("ingresa el año de nacimiento  :");
            año = sc.nextLine();

            System.out.println("ingresa el mes de nacimiento  :");
            mes = sc.nextLine();

            System.out.println("ingresa el dia de nacimiento  :");
            dia = sc.nextInt();
            System.out.println("ingresa sexo |HOMBRE - MUJER|  :");
            sc.nextLine();
            sexo = sc.next().charAt(0);

            System.out.println("ingresa estado  :");
            sc.nextLine();
            estado = sc.nextLine();

            System.out.println("ingresa el municipio  :");
            municipio = sc.nextLine();
             //System.out.println(nombrecompleto.substring(0));
            System.out.println();
            System.out.println("tu curp es  :");



            primerA = nombrecompleto.substring(nombrecompleto.indexOf(" ") + 1, nombrecompleto.lastIndexOf(" "));
            segundoA = nombrecompleto.substring(nombrecompleto.lastIndexOf(" ") + 1, nombrecompleto.length());
            nombre1 = nombrecompleto.substring(0, nombrecompleto.indexOf(" "));

//            System.out.println(primerA);
//            System.out.println(segundoA);
//            System.out.println(nombre1);
            //System.out.println(nombre2);
            curp = curp + primerA.substring(0, 2) + segundoA.charAt(0) + nombre1.charAt(0);
            año = año.substring(2);
            curp = curp + año;

            //System.out.println(año);


           /* for (int i = mes.length(); i >= mes.length(); i = mes.length() - 1) {
                for (int j = 0; j == mes.length(); j++) {


                    System.out.println(j);
                }
            } */

            switch (mes.toLowerCase()) {
                case "enero":
                    mes = "01";
                    break;
                case "febrero":
                    mes = "02";
                    break;
                case "marzo":
                    mes = "03";
                    break;
                case "abril":
                    mes = "04";
                    break;
                case "mayo":
                    mes = "05";
                    break;
                case "junio":
                    mes = "06";
                    break;
                case "julio":
                    mes = "07";
                    break;
                case "agosto":
                    mes = "08";
                    break;
                case "septiembre":
                    mes = "09";
                    break;
                case "octubre":
                    mes = "10";
                    break;
                case "noviembre":
                    mes = "11";
                    break;
                case "diciembre":
                    mes = "12";
                    break;
                default:
                    mes = "No valido";
            }

            curp = primerA.substring(0, 2) + segundoA.charAt(0) + nombre1.charAt(0) + año + mes + dia;
            curp = curp + sexo;
            curp = curp + estado.charAt(0)+estado.charAt(estado.length()-1);
            curp = curp + municipio.charAt(0);

            System.out.println(curp.toUpperCase());





    }
}



