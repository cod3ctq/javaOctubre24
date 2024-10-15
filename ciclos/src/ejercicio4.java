import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        //.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado cuántas veces existe esa letra
        //dentro de la frase. Si no existe, imprimir un mensaje “Carácter no encontrado”. 

Scanner sc = new Scanner(System.in);
String Palabra ;
char letra;
int contador =0;
        System.out.println("Dijite una palabra ");
Palabra = sc.nextLine().toLowerCase();
        System.out.println("Dijite una letra ");
letra = sc.nextLine().charAt(0);
for (int i=0;i<Palabra.length();i++){
    if (Palabra.charAt(i)==Character.toLowerCase(letra)){
        contador++;
    }
}
if (contador==0){
    System.out.println(" No se encontro ningun numero");
}
else{
    System.out.println(" las letras encontradas son: "+contador);
}
        }

    }

