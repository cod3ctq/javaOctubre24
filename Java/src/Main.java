import java.io.*;

public class Main {
    public static void main(String[] args) {

//"C:\Users\DELL\Desktop\Jrw.txt"

        File file = new File("C:\\Users\\DELL\\Desktop\\Jrw.txt");
        String linea="";
        File file2= new File("C:\\Users\\DELL\\Desktop\\escritura.txt");
        String linea2="";

        /*
        try {
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader(fr);

            while ((linea=br.readLine())!=null) {
                System.out.println(linea);
            }

            }catch(Exception ex){
                ex.printStackTrace();
                */

        try {
            FileWriter fw = new FileWriter(file2, true);
            fw.write("\neres puto\n");

            fw.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}