import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Daniel\\Desktop\\texto.txt");
        File file2 = new File("C:\\Users\\Daniel\\Desktop\\fechas.txt");
        String linea = "";

//        try {
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//
//            while ((linea=br.readLine())!= null){
//                System.out.println(linea);
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
        FileWriter fw = null;
        try{
            fw = new FileWriter(file2,true);
            fw.write("Que onda perro");

            fw.close();
        } catch (Exception e){

        }

    }
}