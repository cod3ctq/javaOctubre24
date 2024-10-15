import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        int contador =0;
        Scanner sc = new Scanner(System.in);
        int valor = 0 ;
        int tope = 0 ;
        System.out.println("ingresa el valor ");
        valor = sc.nextInt(); //7 while mientras que
        System.out.println("Ingrese el limite ");
        tope =sc.nextInt();

/*
while ( contador <= tope){
            System.out.println(valor+"*"+contador+"="+(valor*contador));
contador++;
}while ( contador <= tope){
            System.out.println(valor+"+"+contador+"="+(valor*contador));
contador++;
*/
        /*
  do {
      System.out.println(valor + "*" + contador + "=" + (valor * contador));
      contador++;
} while ( contador <= tope);
         */
Scanner sc = new Scanner(System.in);
String nombre ="";
String caracter ="";
int contador =0;
        System.out.println("Ingresa el nombre ");
        nombre = sc.nextLine();
        System.out.println("Ingresa la letra a buscar ");
        caracter =sc.nextLine();
nombre=nombre.toLowerCase(); // se convierten en mayusculas
caracter = caracter.toLowerCase();// normalizar a mayusculas
for (int i = 0 ; i < nombre.length(); i++) {
    if (caracter.equals(Character.toString(nombre.charAt(i)))) {
        contador++;
    }
}
    System.out.println(contador );




  }
}