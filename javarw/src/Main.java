import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        //Representacion de una archivo dentro del codigo
        File file = new File("C:\\Users\\César\\Desktop\\nota.txt");
        File file2 = new File("C:\\Users\\César\\Desktop\\escritura.txt");
        String linea=""; //temporal
        /*try{
            FileReader fr = new FileReader(file); //Caché
            BufferedReader br = new BufferedReader(fr); //Leee el cache
            //Mientras la linea tenga algun contenido ...
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }*/

        try{
            FileWriter fw = new FileWriter(file2,true);
            fw.write("\n mexico 2026");

            fw.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}