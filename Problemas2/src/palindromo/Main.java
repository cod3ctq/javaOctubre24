package palindromo;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int tope = 0;
        int contador = 0, contadorr = 0, contador2 = 0, contadort = 0;
        int opcion, longi;
        String palabra = "";
        boolean salir = false, Error = false;


        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Opcion 1:" + "Tabla del 12");
            System.out.println("Opcion 2:\"  \"Tabla de multiplicar deseada\"");
            System.out.println("Opcion 3:\" \"Determinación\"");
            System.out.println("Opcion 4:\"  \"Tabla del 12\"");
            System.out.println("Opcion 5:\"  \"Tabla del 12\"");
            System.out.println("Opcion 6:\"  \"Tabla del 12\"");
            System.out.println("Opcion 7:\"  \"Tabla del 12\"");
            System.out.println("Opcion 8:\"  \"Tabla del 12\"");
            System.out.println("Opcion 9:\"  \"Tabla del 12\"");
            System.out.println("Opcion 10:\"  \"Tabla del 12\"");
            System.out.println("Opcion 11:\" \"Tabla del 12\"");
            System.out.println("Salir");
            System.out.println("Selecciona una opcion :");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    int valor = 12;
                    System.out.println("¿Hasta que numero quieres hacer la tabla del 12?");
                    tope = sc.nextInt();
                    do {
                        System.out.println(valor + "x" + contador + "=" + (valor * contador));
                        contador++;
                    } while (contador <= tope);
                    break;

                case 2:
                    int valor1 = 0;
                    int tope1 = 0;
                    System.out.println("Dame un numero del cual deseas la tabla de multiplicar");
                    valor1 = sc.nextInt();
                    System.out.println("¿Hasta que numero quieres multiplicar el anterior numero?");
                    tope1 = sc.nextInt();
                    do {
                        System.out.println(valor1 + "x" + contadorr + "=" + (valor1 * contadorr));
                        contadorr++;
                    } while (contadorr <= tope1);
                    break;
                case 3:
                    System.out.println("Dame una palabra que quieras comparar  |String - Palindromo|");
                    palabra = sc.next();
                    palabra = palabra.toLowerCase().replace("", " ").replace(" ", "");
                    longi = palabra.length() - 1;
                    while ((contador2 < longi) && (!Error)) {
                        if (palabra.charAt(contador2) == palabra.charAt(longi)) {
                            contador2++;
                            longi--;
                        } else {
                            Error = true;
                        }

                        if (!Error) {
                            System.out.println(palabra + "Es un palíndromo\n");
                        } else {
                            System.out.println(palabra + "No un palíndromo\n");
                        }

                    }
                    break;

                case 4:
                    int contadora = 0;
                    String nombre = "";
                    String caracter = "";
                    System.out.println("ingresa tu nombre");
                    sc.nextLine();
                    nombre = sc.nextLine();

                    System.out.println("ingresa tu caracter a buscar");
                    caracter = sc.nextLine();
                    for (int i = 0; i < nombre.length(); i++) {
                        if (caracter.equals(Character.toString(nombre.charAt(i)))) {
                            contadora++;
                        }
                    }
                    System.out.println(contadora + "\n");
                    break;


                case 5:
                    int hora = 0, minutos = 0, segundos = 0;

                    while (contadort <= tope) {
                        System.out.println(contadort + "-" + hora + ":" + minutos + ":" + segundos);
                        contadort++;
                        hora++;
                        minutos++;
                        segundos++;
                    }


                    break;
                case 6:



                    break;

                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case  10:
                    break;
                case 11:

                    break;
                case 12:

                    salir = true;
                    break;
                default:
                    System.out.println("ingresa un numero valido del 1 al 12");
            }


        } while (opcion != 12);


    }
}