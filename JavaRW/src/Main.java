import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //LECTURA Y ESCRITURA DE ARCHIVOS CON JAVA

        //Representacion de un archivo dentro del codigo
        File file = new File("C:\\Users\\veron\\OneDrive\\Escritorio\\HolaMundo.txt");
        File file2 = new File("C:\\Users\\veron\\OneDrive\\Escritorio\\Escritura.txt");


        String linea=""; //temporal

        /*try {
            FileReader fr = new FileReader(file); //Cache
            BufferedReader br = new BufferedReader(fr); //Lee el cache

            //Mientras la linea tenga algun contenido...
            while ((linea=br.readLine()) !=null){
                System.out.println(linea);
            }
        }catch (Exception ex){
            ex.printStackTrace();*/


        try {
            FileWriter fw = new FileWriter(file2,  true);
            fw.write("\n  \n "  );


            fw.close();//para guardar los cambios

        }catch (Exception e) {

        }


        }
    }

