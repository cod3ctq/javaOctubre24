import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String linea=""; // temporal
        String escri="doce de septiembre del 2004";
        //representacion de un archivo dentro del codigo
    File file = new File("C:\\Users\\Chucho\\Desktop\\hola.txt"); //tiene numeros
        File file2 = new File("C:\\Users\\Chucho\\Desktop\\escritura.txt"); // nada

    try {

        FileReader fr = new FileReader(file); //cache
        BufferedReader br = new BufferedReader(fr);//lee el cache


        //Mientras la linea tenga algun contenido...
        while ((linea=br.readLine())!=null){
            System.out.println(linea);

            FileWriter fw = new FileWriter(file2,true);
            String file2=file+escri;
                fw.write(escri);
            System.out.println(linea);

            fw.close();
        }



    }catch (IOException e){
        e.printStackTrace();
    }
    }
}

