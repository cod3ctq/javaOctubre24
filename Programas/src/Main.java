import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        boolean salir = false;
        int legal = 18;
        int pro = 5;
        int opcion, opc, opci;
        char sexo;
        double resultado = 0, precio = 0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Selecciona una opcion :");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Ejercicio 5");
            System.out.println("Ejercicio 6");
            System.out.println("Ejercicio 7");
            System.out.println("Ejercicio 8");
            System.out.println("Ejercicio 9");
            System.out.println("Ejercicio 10 (Camiones)");
            System.out.println("Ejercicio 11");
            System.out.println("Ejercicio 11");
            System.out.println("Salir");
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Digita un numero:");
                    num1 = sc.nextFloat();
                    System.out.println("Digita un numero:");
                    num2 = sc.nextFloat();

                    if (num1 > num2) {
                        System.out.println("el numero es mayor");
                    } else if (num1 < num2) {
                        System.out.println("el numero es menor ");
                    } else if (num1 == num2) {
                        System.out.println("el numero es igual ");
                    }
                    break;

                case 2:
                    System.out.println("Digita un numero:");
                    num3 = sc.nextFloat();

                    if (num3 % 2 == 0) {
                        System.out.println("el numero es par");
                    } else {
                        System.out.println("el numero es impar");
                    }
                    break;

                case 3:
                    System.out.println("Digita un numero:");
                    num4 = sc.nextFloat();
                    System.out.println("Digita un numero:");
                    num5 = sc.nextFloat();
                    if (num4 != 0) {
                        resultado = num4 / num5;
                        System.out.println("El resultado de la divicion es" + resultado);
                    } else if (resultado == 0) {
                        System.out.println("Error");
                    }
                    break;

                case 4:
                    System.out.println("Digita tu edad:");
                    num6 = sc.nextFloat();
                    System.out.println("Digita tu promedio:");
                    num7 = sc.nextFloat();
                    System.out.println("ingresa sexo |HOMBRE - MUJER|  :");
                    sc.nextLine();
                    sexo = sc.next().toLowerCase().charAt(0);

                    if (num6 >= legal && num7 >= pro) {

                        if (sexo == 'h') {
                            System.out.println("Posible");
                        } else if (sexo == 'm') {
                            System.out.println("Aceptada");
                        }
                    } else {
                        System.out.println("No aceptada\n");
                    }
                    break;


                case 5:
                    String KilodeuvaA, kilodeuvaB;
                    double suma = 0;
                    double TipoA1 = .20, TipoA2 = .30, TipoB1 = .30, TipoB2 = .50;
                    System.out.println("SELECCIONA UNA OPCION");

                    System.out.println("Precio incial del producto:");
                    precio = sc.nextFloat();
                    System.out.println("OPCION 1: Kilo de uva tipo A,Tamaño 1:");
                    System.out.println("OPCION 2: Kilo de uva tipo A,Tamaño 2:");
                    System.out.println("OPCION 3: Kilo de uva tipo B,Tamaño 1:");
                    System.out.println("OPCION 4: Kilo de uva tipo B,Tamaño 2:");
                    sc.nextLine();
                    opc = sc.nextInt();

                    switch (opc) {
                        case 1:
                            suma = precio + TipoA1;
                            System.out.println("precio total:  " + suma + "\n");
                            break;
                        case 2:
                            suma = precio + TipoA2;
                            System.out.println("precio total:  " + suma + "\n");
                            break;
                        case 3:
                            suma = precio + TipoB1;
                            System.out.println("precio total:  " + suma + "\n");
                            break;
                        case 4:
                            suma = precio + TipoB2;
                            System.out.println("precio total:  " + suma + "\n");
                            break;
                    }


                case 6:
//                  al rato

                    break;

                case 7:
                    int dado;
                    int cara1 = 1, cara2 = 2, cara3 = 3, cara4 = 4, cara5 = 5, cara6 = 6;

                    System.out.println("Numero del dado que deseas (1-6):");
                    dado = sc.nextInt();

                    switch (dado) {
                        case 1:
                            System.out.println("El numero que te salio fue:  " + cara6);
                            break;
                        case 2:
                            System.out.println("El numero que te salio fue:  " + cara5);
                            break;
                        case 3:
                            System.out.println("El numero que te salio fue:  " + cara4);
                            break;
                        case 4:
                            System.out.println("El numero que te salio fue:  " + cara3);
                            break;
                        case 5:
                            System.out.println("El numero que te salio fue:  " + cara2);
                            break;
                        case 6:
                            System.out.println("El numero que te salio fue:  " + cara1);
                            break;
                        default:
                            System.out.println("Error");
                    }

                    break;
                case 8:

                    int dia;
                    String dia1 = "lunes", dia2 = "martes", dia3 = "miercoles", dia4 = "jueves", dia5 = "viernes", dia6 = "sabado", dia7 = "domingo";

                    System.out.println("De los 7 dias de la semana cual te gustaria introducir (1'lunes'- 7 'domingo'):");
                    dia = sc.nextInt();


                    switch (dia) {
                        case 1:
                            System.out.println("El dia de la semana es:  " + dia1);
                            break;
                        case 2:
                            System.out.println("El dia de la semana es:  " + dia2);
                            break;
                        case 3:
                            System.out.println("El dia de la semana es:  " + dia3);
                            break;
                        case 4:
                            System.out.println("El dia de la semana es:  " + dia4);
                            break;
                        case 5:
                            System.out.println("El dia de la semana es:  " + dia5);
                            break;
                        case 6:
                            System.out.println("El dia de la semana es:  " + dia6);
                            break;
                        case 7:
                            System.out.println("El dia de la semana es:  " + dia7);
                            break;
                        default:
                            System.out.println("Error");
                    }

                    break;

                case 9:
                    //Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
                    int mes;
                    String mes1 = "Enero", mes2 = "Febrero", mes3 = "Marzo", mes4 = "Abril", mes5 = "Mayo", mes6 = "Junio", mes7 = "Julio", mes8 = "Agosto", mes9 = "Septiembre", mes10 = "octubre", mes11 = "Noviembre", mes12 = "Diciembre";
                    String e = "30", f = "28", m = "31", a = "30", ma = "29", j = "30", ju = "31", ag = "30", s = "31", o = "30", n = "31", d = "31";
                    System.out.println("Introduce el numero del mes que quieras saber ( enero '1' - Diciembre '12' ):");
                    mes = sc.nextInt();

                    switch (mes) {
                        case 1:
                            System.out.println("El mes es: " + mes1 + "  y tiene  " + e + "dias ");
                            break;
                        case 2:
                            System.out.println("El mes es: " + mes2 + "  y tiene  " + f + " dias");
                            break;
                        case 3:
                            System.out.println("El mes es: " + mes3 + "  y tiene " + m + "  dias ");
                            break;
                        case 4:
                            System.out.println("El mes es: " + mes4 + "  y tiene " + a + "  dias ");
                            break;
                        case 5:
                            System.out.println("El mes es: " + mes5 + "  y tiene  " + ma + "  dias ");
                            break;
                        case 6:
                            System.out.println("El mes es: " + mes6 + "  y tiene  " + j + " dias");
                            break;
                        case 7:
                            System.out.println("El mes es: " + mes7 + "  y tiene  " + ju + "  dias ");
                            break;
                        case 8:
                            System.out.println("El mes es: " + mes8 + "  y tiene  " + ag + "  dias");
                            break;
                        case 9:
                            System.out.println("El mes es: " + mes9 + "  y tiene  " + s + "  dias ");
                            break;
                        case 10:
                            System.out.println("El mes es: " + mes10 + "  y tiene  " + o + "  dias");
                            break;
                        case 11:
                            System.out.println("El mes es: " + mes11+ "   y tiene  " + n + "  dias");
                            break;
                        case 12:
                            System.out.println("El mes es: " + mes12+ "  y tiene  " + d + "  dias");
                            break;
                        default:
                            System.out.println("Error");
                    }
                    break;
                case 10:
                    //América del Norte, América Central, América del Sur, Europa y Asia

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