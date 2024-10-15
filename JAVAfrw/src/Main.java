import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\hache\\OneDrive\\Desktop\\javafrw.txt");
        File file2 = new File("C:\\Users\\hache\\OneDrive\\Desktop\\Fechasfrw.txt");
        String linea = "";
//        try{
//            FileReader fr = new FileReader(file);   //Cache
//            BufferedReader br = new BufferedReader(fr);   //Lee el cache
//
//            //Mientras la linea tenga algun contenido
//            while ((linea=br.readLine())!=null){
//                System.out.println(linea);
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }

        try{
            FileWriter fw = new FileWriter(file2, true);
            fw.write("\n Mexico 2025 \n");

            fw.close();
        }catch(Exception ex){
            ex.printStackTrace();

        }

    }
}