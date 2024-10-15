import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Representacion de un archivo dentro del codigo
        File file = new File("C:\\Users\\brend\\Desktop\\Nuevo Documento de texto.txt");
        // String linea =""; //variable temporal
        File file2 = new File("C:\\Users\\brend\\Desktop\\Escritura.txt");
        String linea = ""; //variable temporal
        /*try {
            FileReader fr = new FileReader(file);//cache
            BufferedReader br = new BufferedReader(fr); //lee el cache

            //mientras la linea tenga algun contenido
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

            }

        } catch (Exception ex) {
            ex.printStackTrace();*/
        try {
            for (int i = 0; i < NuevoDocumentodetexto.txt.length; i++) {
            //agregar contenido con el true o borrar lo anterior
            FileWriter fw= new FileWriter(file2, true);
            fw.write("\n mexico es un pais'\n ");
            fw.close(); // guardamos los cambios



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
