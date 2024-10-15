import java.util.Scanner;

public class Cifrado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w", "x","y","z"};
        String temp = "";
        String cifrado = "";

        System.out.println("Ingresa texto ");
        String texto = sc.nextLine();


        //Itera sobre la cadena original
        for (int i = 0; i < texto.length(); i++){
            temp=texto.charAt(i)+"";

            //Si no es un espacio . . .
            if( !(temp.equals(" ")) ){

                //Busca el caracter dentro del abecedario

                if(temp.equals("z")){
                    cifrado = cifrado+"a";
                }else{
                    for(int j = 0; j < abc.length; j++){
                        //Si el caracter de temp es igual a l de la posicion del abecedario
                        if(temp.equals(abc[j])){
                            //Almacena en cifrado la letra de la posicion actual + 1
                            cifrado = cifrado + abc[j+1];
                            break;

                        }
                    }
                }


            }else{
                cifrado += " >.< ";
            }

        }
        System.out.println(cifrado);

    }
}
