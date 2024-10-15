import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        //1.- Programa un algoritmo que realice la tabla de multiplicar del 12
        Scanner sc = new Scanner(System.in);
        int contador=0,numero;
        System.out.println("Que tabla de multiplicar deceas");
        numero =  sc.nextInt();
        for (int i=0;i<=10;i++) {
            System.out.println(+contador+++"-" +i*numero);

        }
    }
}
