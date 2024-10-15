import java.io.*;

public class EjerciciosArchivo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Daniel\\Desktop\\fechasFormato.txt");
        File file2 = new File("C:\\Users\\Daniel\\Desktop\\texto.txt");
        String dias[] = {
                "primero", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho",
                "diecinueve", "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro",
                "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
                "treinta y uno"
        };
        String meses[] = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        String linea = "";
        String dia = "";
        String mes = "";
        String anio = "";
        String aux = "";


        try {

            FileReader fr = new FileReader(file2);
            BufferedReader bf = new BufferedReader(fr);

            FileWriter fw = new FileWriter(file);
            //Doce de Septiembre de 2024
            while ((linea = bf.readLine())!=null){
                dia = linea.substring(0,2);
                mes = linea.substring(2,4);
                anio = linea.substring(4);

                aux = dias[Integer.parseInt(dia)-1]+ " de "+meses[Integer.parseInt(mes)-1]+" de "+anio;
                fw.write(aux+"\n");

            }
            fw.close();
        } catch (FileNotFoundException fnf){
            System.out.println("El archivo no existe");
        } catch (Exception e){
            System.out.println(e);
            System.out.println("ERROR DESCONOCIDO");
        }



    }
}
