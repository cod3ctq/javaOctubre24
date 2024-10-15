import java.util.Scanner;

public class Cifrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un texto: ");
        String texto = sc.nextLine();
        String temp = "";
        String cifrado = "";
        String[] abecedario = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};

        //iterar sobre la cadena orignal

        for (int i = 0; i < texto.length(); i++) {
            temp = texto.charAt(i) + "";// poniendo las comillas ya es un string
            temp = temp.toLowerCase(); // para mayusculas
            //si no es un espacio ...
            if (!(temp.equals(" "))) {
                if (temp.equals("z")) {
                    cifrado = cifrado + "a";
                } else {
                    // busca el caracter  dentro de abecedario
                    for (int j = 0; j < abecedario.length; j++) {
                        // busca el caracter dentro de abecedario
                        if (temp.equals(abecedario[j])){
                            //almacena el cifrado de la letra de la posicion actual
                            cifrado = cifrado + abecedario[j + 1];
                        }

                    }
                }

                //   System.out.println(texto.charAt(i)); // devuelve un caracter
            }

        }
        System.out.println(cifrado);
    }
}


