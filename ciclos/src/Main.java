import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int contador = 0;
        int valor = 0;
        int tope = 0;

        System.out.println("ingresar el valor");
        valor = sc.nextInt();
        System.out.println("ingresar el limite");
        tope = sc.nextInt();
        /*while (contador <= tope) { //repite las condiciones
            System.out.println(valor+ "x"+contador+ "=" +(valor*contador) );
            contador++;

    }*/

        /*while (contador <= tope) {
            System.out.println(valor + "x" + contador + "=" + (valor * contador));
            contador++;
        }*/
        /*do {
            System.out.println(valor + "x" + contador + "=" + (valor * contador));
            contador++;

        }while (contador <= tope);*/

        Scanner sc2 = new Scanner(System.in);
        String nombre="";
        String caracter="";
        int contador=0;
        System.out.println("ingresar el nombre");
        nombre = sc2.nextLine();
        System.out.println("ingresar la letra a buscar");
        caracter = sc2.nextLine();
        for (int i=0; i<nombre.length(); i++){

            if (caracter.equals(Character.toString(nombre.charAt(i)))){
                contador++;
            }
        }
        System.out.println(contador);
    }

}
