import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

/*
2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, hasta la iteración
deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
23 x 95 = ???;
 */


        Scanner sc = new Scanner(System.in);
        int contador=0,numero,cantidad;
        System.out.println("Que tabla de multiplicar deceas");
        numero =  sc.nextInt();
        System.out.println("dijite la cantidad de multiplicar deceas");
        cantidad= sc.nextInt();
        for (int i=0;i<=cantidad;i++) {
            System.out.println(+contador++ + "-" + i * numero);
        }
    }


}
