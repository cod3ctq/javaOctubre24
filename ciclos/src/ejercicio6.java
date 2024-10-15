import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        //.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. Cual será la cantidad
        //de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?.

       Scanner sc = new Scanner(System.in);
int inversion = 1000;
double interes_mesual= 0.2;
double suma_total=0;

for (int i=1;i<=12;i++){
    suma_total= ((inversion*interes_mesual)+inversion)*i;
}
        System.out.println(suma_total);
/*1 1200
        //2 1440
       //-3 1728
       //4- 2073.6
       5- 2488.32
       6- 2985.984
       7-3583.1808
       8- 4299.81696
       9-5159.780352
       10- 6191.7364224
       11- 7430.08370688
       12-8916.100448256
 */





    }
}
