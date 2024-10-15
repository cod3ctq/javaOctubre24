import java.util.Arrays;
import java.util.Scanner;

public class cifrado {
    public static void main(String[] args) {

        //Arrays simple

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um valor: ");
//        String texto = sc.nextLine();
//        String[] abcedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//        String tempo = "";
//        String cifrado = "";
//        //Itera sobre la cadena original
//        // for (int i = 0; i < abcedario.length; i++) {} porque si lo hago sobre abecedario lo haria solo hasta "27" veces, si fuera de mas caracteres no te alcanzaria mas
//        for (int i = 0; i < texto.length(); i++) {
//            tempo = texto.toLowerCase().charAt(i) + "";
//            // si no es un espacio
//            if (!(tempo.equals(" "))) {
//                if (tempo.equals("z")) {
//                    cifrado = cifrado + "a";
//                } else {
//                    // System.out.println(texto.charAt(i));
//                    for (int j = 0; j < abcedario.length; j++) {
//                        if (abcedario[j].equals(tempo)) {
////                   if (tempo.equals( abcedario[j])) {
//                            cifrado = cifrado + abcedario[j + 1];
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(cifrado);
        Scanner sc = new Scanner(System.in);

        String  [][] matriz= {{"2","4"},{"5"}};
        matriz[0][0]=" ";
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.println("LLENA LA MATRIZ DE 4X5 EMPEZANDO POR COLUMANAS");
                matriz[i][j]=sc.nextLine();
                    for (int k=0;k<matriz[i][j].length();k++) {

                    }
                System.out.println((matriz[i][j]));


            }
        }
    }
}

