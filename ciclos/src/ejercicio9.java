import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        //9. Programa Java que lea dos números y muestre los números pares entre ellos
        Scanner sc = new Scanner(System.in);
        int numero, numero2;
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        System.out.println("Ingrese un numero");
        numero2 = sc.nextInt();
    int mayor;
    int menor;

    if (numero > numero2) {
        mayor = numero;
        menor = numero2;
    }
        else{
            mayor = numero2;
            menor = numero;
    }
            for ( int i=menor;i<=mayor;i++){
                if (i%2==0){
                    System.out.println("Los numeros pares son "+i);
                }
            }




    }
}
