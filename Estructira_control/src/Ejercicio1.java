import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
    //JIRC95042GHVZMDS04
        Scanner entrada = new Scanner(System.in);
        String  nombreCompleto,añonac = "", nombre, mes = "", estado, municipio, curp="", primerap, segape; //se definen las variables
        int dia;
        char sex;
         // se solicita los datos del usuario
        System.out.println("Ingrese su Nombre completo: ");
        nombreCompleto = entrada.nextLine(); //se guarda la cadena de tecto en la varible nombre
        System.out.println("Ingrese el Año de de nacimiento: ");
        añonac = entrada.nextLine();
        System.out.println("Ingrese el Mes de nacimiento: ");
        mes = entrada.nextLine();
        System.out.println("Ingrese el Dia de nacimiento: ");
        dia = entrada.nextInt(); // es una variable de tipo entero
        entrada.nextLine();
        System.out.println("Ingrese el Sexo: ");
        sex = entrada.nextLine().charAt(0); // variable es de tipo carecter solo va hacer la primera letra
        System.out.println("Ingrese el Estado: ");
        //
        estado = entrada.nextLine();
        System.out.println("Ingrese el municipio: ");
        municipio = entrada.nextLine();
        //JIRC95042GHVZMDS04 //GAGB880912MVZRRR06
        System.out.println(nombreCompleto.indexOf(" "));
       // System.out.println(nombreCompleto.lastIndexOf(" "));

        primerap = nombreCompleto.substring(nombreCompleto.indexOf(" ")+1,nombreCompleto.lastIndexOf(" "));
        //System.out.println(primerap);

        segape = nombreCompleto.substring(nombreCompleto.lastIndexOf(" ")+1, nombreCompleto.length());
       // System.out.println(segape);

        nombre= nombreCompleto.substring(0,nombreCompleto.indexOf(" "));
       // System.out.println(nombre);

        curp = curp+primerap.substring(0,2)+segape.charAt(0)+nombre.charAt(0);
        añonac= añonac.substring(2);
        curp= curp+añonac;


        System.out.println(añonac);

        mes = mes.toLowerCase().trim(); // convierte en minusculas lo que hay en la variable
        System.out.println(mes);
        switch (mes){
            case "enero":
                curp =curp+ "01" ;
                break;
            case "febrero":
                curp =curp+ "02" ;
                 break;
            case "marzo":
                curp =curp+ "03" ;
                break;

            case "abril":
                curp += "04" ;
            break;
            case "mayo":
                curp += "05" ;
            break;
            case "junio":
                curp += "06" ;
            break;
            case "julio":
                curp += "07" ;
            break;
            case "agosto":
                curp =curp + "08" ;
            break;
            case "septiembre":
                curp = curp +"09" ;
            break;
            case "octubre":
                curp =curp+ "10" ;
            break;
            case "noviembre":
                curp =curp+ "11" ;
            break;
            case "diciembre":
                curp =curp+ "12" ;
            break;

            default: System.out.println("El mes que ingresaste es incorrecto");
        }
        //conectar el dia
        curp = curp+dia;
        curp = curp+sex;

        // primer  y ultima letra del estado
        curp =curp + estado.charAt(0)+estado.charAt(estado.length()-1);
        // Municipio
       curp = curp+municipio.charAt(0);

       System.out.println(curp.toUpperCase());


    }
}
