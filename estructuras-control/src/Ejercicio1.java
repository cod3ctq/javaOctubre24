import java.util.Date;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //NURN990524
        Scanner sc = new Scanner(System.in);

        String nombreCompleto = "";
        String primerApellido = "";
        String segundoApellido = "";
        String nombre = "";
        String anio = "";
        String mes = "";
        String anioNac = "";
        int dia = 0;
        char sexo;
        String municipio = "";
        String estado = "";
        String curp = "";

        System.out.println("Ingresa el nombre completo");
        nombreCompleto = sc.nextLine();

        System.out.println("Ingresa el año de nacimiento");
        anio = sc.nextLine();
        System.out.println("Ingresa el mes de nacimiento");
        mes = sc.nextLine();
        System.out.println("Ingresa el dia de nacimiento");
        dia = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el sexo (HOMBRE | MUJER)");
        sexo = sc.nextLine().charAt(0);
        System.out.println("Ingresa el estado de nacimiento");
        estado = sc.nextLine();//

        System.out.println("Ingresa el municipio de nacimiento");
        municipio = sc.nextLine();

        primerApellido = nombreCompleto.substring(nombreCompleto.indexOf(" ") + 1,
                nombreCompleto.lastIndexOf(" "));
        System.out.println(primerApellido);

        segundoApellido = nombreCompleto.substring(nombreCompleto.lastIndexOf(" ") + 1);
        System.out.println(segundoApellido);

        nombre = nombreCompleto.substring(0, nombreCompleto.indexOf(" "));

        anioNac = anio.substring(2);

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
        System.out.println(estado);
        System.out.println(municipio);
        //Hombre mexicano cxds01

        curp = primerApellido.substring(0,2) +
                segundoApellido.charAt(0) +
                nombre.charAt(0) +
                anioNac+mes+dia+sexo+estado.charAt(0)+estado.charAt(estado.length()-1)+municipio.charAt(0);

        System.out.println(curp.toUpperCase());




    }
}
