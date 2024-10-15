import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

       //JIRC950420HVZMDS04
        Scanner sc=new Scanner(System.in);
        String nombreCompleto;
        String primApe;
        String segApe;
        String nombre;
        String añoNac="";
        String mes="";
        int dia;
        char sexo;
        String estado;
        String municipio;

        String curp="";

        System.out.println("Ingresa el nombre completo" );
        nombreCompleto=sc.nextLine(); //Se guarde una cadena de texto
        System.out.println("Ingrese el año de nacimiento");
        añoNac=sc.nextLine();
        System.out.println("Ingresa el mes de nacimiento");
        mes=sc.nextLine();
        System.out.println("Ingresa el dia de nacimiento");
        dia=sc.nextInt();
        System.out.println("Ingresa el sexo (HOMBRE|MUJER)");
        sc.nextLine();
        sexo=sc.nextLine().charAt(0);
        System.out.println("Ingresa el estado de nacimiento");
        estado=sc.nextLine();
        System.out.println("Ingresa el municipio");
        municipio=sc.nextLine();

        //JIRC950420HVZMDS04




        primApe = nombreCompleto.substring(nombreCompleto.indexOf(" ")+1,
                nombreCompleto.lastIndexOf(" "));


        segApe = nombreCompleto.substring(nombreCompleto.lastIndexOf(" ")+1,
                nombreCompleto.length());


        nombre = nombreCompleto.substring(0,nombreCompleto.lastIndexOf(" "));


        curp = curp + primApe.substring(0,2) +segApe.charAt(0)+nombre.charAt(0);
        añoNac = añoNac.substring(2);
        curp = curp + añoNac;
        mes = mes.toLowerCase(); //convierte a minuscula
        switch (mes){

            case "enero":
                curp = curp + "01";
                break;
            case "febrero":
                curp = curp + "02";
                break;
            case "marzo":
                curp = curp + "03";
                break;
            case "abril":
                curp = curp + "04";
                break;
            case "mayo":
                curp = curp + "05";
                break;
            case "junio":
                curp = curp + "06";
                break;
            case "julio":
                curp = curp + "07";
                break;
            case "agosto":
                curp = curp + "08";
                break;
            case "septiembre":
                curp = curp + "09";
                break;
            case "octubre":
                curp = curp + "10";
                break;
            case "noviembre":
                curp = curp + "11";
                break;
            case "diciembre":
                curp = curp + "12";
                break;
            default:
                System.out.println("Mes no valido");
        }
        curp = curp + dia;
        curp = curp + sexo;
//primer y ultima letra del estado
curp = curp + estado.charAt(0) + estado.charAt(estado.length()-1);
//Municipio
        curp =curp + municipio.charAt(0);
        System.out.println(curp);
    }

}

