import java.util.Scanner;

public class cifrado {
    public static void main(String[] args) {

//lea una palabra y despues esta se tiene que imprimir con la letras siguiente
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el texto");
        String texto = sc.nextLine();
        String temp = "";
        String cifrado = "";
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"
                , "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};
// vamos a iterar sobre la ca--------dena original
        for (int i = 0; i < texto.length(); i++) {
            temp = texto.charAt(i) + "";// lo convierte a String
//si no es un espacio
            if (!(temp.equals(" "))) {
                if (temp.equals("z")) {
                    cifrado = cifrado + "a";
                } else {
                    for (int j = 0; j < abc.length; j++) {
                        if (temp.equals(abc[j])) {
                            //si el caracter de temp es igual a la posicion del abecedario
                            cifrado = cifrado + abc[j + 1];

                        }


                    }

                }
            }
        }
        System.out.println(cifrado);
    }
}

