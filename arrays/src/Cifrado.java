import java.util.Scanner;

public class Cifrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el texto");
        String texto = sc.nextLine();
        String temp="";
        String cifrado="";
        String[] abecedario = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z"
        };
        //Itera sobre la cadena original
        for (int i = 0; i < texto.length(); i++) {
            temp=texto.charAt(i)+"";
            //Si no es un espacio ...
            if( !(temp.equals(" ")) ){
                //Busca el caracter dentro del abecedario
                if(temp.equals("z")){
                    cifrado = cifrado+"a";
                }else{
                    for (int j = 0; j < abecedario.length; j++) {
                        //Si el caracter de temp es igual al de la posicion del abecedario ...
                        if(temp.equals(abecedario[j])){
                            //almacena en cifrado la letra de la posicion actual + 1
                            cifrado = cifrado + abecedario[j+1];
                        }
                    }
                }
            }
        }
        System.out.println(cifrado);
    }
}
