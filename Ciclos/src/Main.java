import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Ciclo while
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
       // int contador =0, valor =0, tope=0;

    // ciclo while
    //     System.out.println("ingrese un valor ");
       //  valor = entrada.nextInt();

        // repetecion
         //   System.out.println("ingrese el limite ");
            //tope = entrada.nextInt();
     /* while (contador <= tope){

        System.out.println(valor + "x" +contador+ "="+(valor*contador));
        contador++; // cambio se valor si se quita se va al infinito
      //  contador+=2; si se quiere incrementar el valor

        } */
        // do while dos ciclos para que se ejecuten repetidamente
       /* do {
            System.out.println(valor + "x" +contador+ "="+(valor*contador));
            contador++;
        }while(contador <= tope);
*/
        //cliclo fot
        //variable de control, condicion e incremento
        String nombre="";
        String caracter="";
        int contador=0;
        System.out.println("Ingrese el nombre : ");
        nombre= entrada.nextLine();
        System.out.println("Ingrese la letra a buscar : ");
        caracter=entrada.nextLine();
        nombre=nombre.toUpperCase();
        for (int i=0; i<nombre.length(); i++){
                                     //
            if (caracter.equals(Character.toString(nombre.charAt(i)))){
                contador++;

            }
            }
        System.out.println(contador);
}
        }


