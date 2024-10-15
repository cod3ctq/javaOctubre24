import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        //Leer dos números y mostrar los números desde el menor hasta el mayor
     Scanner sc = new Scanner(System.in);
     int num1;
     int num2;
        System.out.println("Digite un numero");
        num1 = sc.nextInt();
        System.out.println("Digite un numero");
        num2 = sc.nextInt();
        int menor,mayor;

        if (num1<num2) {
            menor = num1;
            mayor = num2;
        }
        else {
            menor = num2;
            mayor = num1;
        }
        for (int i=menor; i<=mayor; i++){
            System.out.println(i);
        }


    }
}
