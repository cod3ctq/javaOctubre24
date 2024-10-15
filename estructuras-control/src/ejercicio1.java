import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombrecompleto;
        String añonac=" ";
        String mes=" ";
        int dia;
        char  sexo;
        String estado ="";
        String municipio="";
        String curp ="";
        String papellido;
        String segape;
        String nombre ;
        System.out.println("ingresar el nombre completo : ");
        nombrecompleto= entrada.nextLine();

        System.out.println("ingresar el año de nacimineto : ");
        añonac = entrada.nextLine();

        System.out.println("ingresar el mes de nacimineto ");
        mes = entrada.nextLine();

        System.out.println("ingresa el dia de nacimineto ");
        dia = entrada.nextInt();
        System.out.println("ingrese el sexo hombre o mujer");
entrada.nextLine();
        sexo = entrada.nextLine().charAt(0);

        System.out.println("Ingrese el estado de nacimineto : ");
        estado = entrada.nextLine();
        System.out.println("Ingrese el municipio : ");
        municipio = entrada.nextLine();

        // JIRC95842DHVZMD584
        // AAAAA aaaaaaaa bbbbbbbb */
        System.out.println(nombrecompleto.indexOf(" ")); // INDICA QUE SE BUSCA EL PRIMER ESPACIO
        System.out.println( nombrecompleto.lastIndexOf(" ")); // INDICA QUE SE BUSCA EL SEGUNDO ESPACIO

       papellido=  nombrecompleto.substring(nombrecompleto.indexOf(" ")+1, nombrecompleto.lastIndexOf(" "));
        System.out.println(papellido);
        segape = nombrecompleto.substring(nombrecompleto.lastIndexOf(" ")+1,nombrecompleto.length());//
        System.out.println(segape);
        nombre = nombrecompleto.substring(0,nombrecompleto.indexOf(" "));
        System.out.println(nombre);
        curp = curp + papellido.substring(0,2)+segape.charAt(0)+nombre.charAt(0);
        añonac = añonac.substring(2);
        System.out.println(añonac);
        curp = curp + añonac;
        mes =mes.toLowerCase();
switch(mes) {
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
    case "julio ":
        curp = curp + "07";
        break;
    case "agosto":
        curp = curp + "08";
        break;
    case "septiembre":
        curp = curp + "09";
        break;
    case "octubre ":
        curp = curp + "10";
        break;
    case "noviembre":
        curp = curp + "11";
        break;
    case "diciembre":
        curp = curp + "12";
        break;
    default:
        System.out.println("mes no valido ");
}
curp= curp+ dia ;
curp= curp + sexo;
//primero y ultima letra del estado
curp = curp +estado.charAt(0)+estado.charAt(estado.length()-1) ;//char at busca el primero carater length = longitud
        // municipio
        curp = curp + municipio.charAt(0);
        System.out.println(curp.toUpperCase());

        // concatenar el dia
        // primer y ultima letra del estado



    }

    }




