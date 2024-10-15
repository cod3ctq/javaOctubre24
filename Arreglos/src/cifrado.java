import java.util.Scanner;

public class cifrado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el texto: ");
        String texto = sc.nextLine();
        String temp = "";
        String cifrado = "";

        String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };

        //Iterar sobre la cadena original
        for (int i = 0; i < texto.length(); i++) {

            temp = texto.charAt(i) + "";
            temp = temp.toLowerCase();
            //Si no es un espacio
            if (!(temp.equals(" "))) {

                if (temp.equals("z")) {
                    cifrado = cifrado + "a";
                } else {
                    //Busca el caracter dentro del abecedario
                    for (int j = 0; j < abecedario.length; j++) {
                        //Si el caracter de temp es igual al de la posicion del abecedario
                        if (temp.equals(abecedario[j])) {
                            cifrado = cifrado + abecedario[j + 1];
                        }
                    }
                }
            }
        }System.out.println(cifrado);
    }
}
