import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String palabra, palabraAlrevez="";
        System.out.println("Escribe una palabra : ");
        palabra = sc.nextLine().toLowerCase();
      for (int i= palabra.length()-1;i>=0;i--){
          palabraAlrevez+=palabra.charAt(i);
      }
if (palabra.equals(palabraAlrevez)){
    System.out.println("Es un palindromo ");
}
else {
    System.out.println("No es un palindromo ");
}







    }
}
