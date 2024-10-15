import java.util.Arrays;

public class EjercicioMatriz {
            public static void main(String[] args) {

                String[][] uno = {
                        {"2", "4", "5", "99"},
                        {"20", "5", "1", "x"},
                        {"11", "7", "f", "15"}};
                String[][] dos = {
                        {"l", "2", "44", "d"},
                        {"112", "f", "56", "55"},
                        {"11", "7", "f", "15"}};
                String[][] tres = {{" ", " ", " ", " "},
                        {"", "", "", ""},
                        {"", "", "", ""}};

                int tempo = 0;
                String[] numeros = {
                        "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta", "treinta y uno", "treinta y dos", "treinta y tres", "treinta y cuatro", "treinta y cinco", "treinta y seis", "treinta y siete", "treinta y ocho", "treinta y nueve", "cuarenta", "cuarenta y uno", "cuarenta y dos", "cuarenta y tres", "cuarenta y cuatro", "cuarenta y cinco", "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho", "cuarenta y nueve", "cincuenta", "cincuenta y uno", "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro", "cincuenta y cinco", "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho", "cincuenta y nueve", "sesenta", "sesenta y uno", "sesenta y dos", "sesenta y tres", "sesenta y cuatro", "sesenta y cinco", "sesenta y seis", "sesenta y siete", "sesenta y ocho", "sesenta y nueve", "setenta", "setenta y uno", "setenta y dos", "setenta y tres", "setenta y cuatro", "setenta y cinco", "setenta y seis", "setenta y siete", "setenta y ocho", "setenta y nueve", "ochenta", "ochenta y uno", "ochenta y dos", "ochenta y tres", "ochenta y cuatro", "ochenta y cinco", "ochenta y seis", "ochenta y siete", "ochenta y ocho", "ochenta y nueve", "noventa", "noventa y uno", "noventa y dos", "noventa y tres", "noventa y cuatro", "noventa y cinco", "noventa y seis", "noventa y siete", "noventa y ocho", "noventa y nueve", "cien", "ciento uno", "ciento dos", "ciento tres", "ciento cuatro", "ciento cinco", "ciento seis", "ciento siete", "ciento ocho", "ciento nueve", "ciento diez", "ciento once", "ciento doce", "ciento trece", "ciento catorce", "ciento quince", "ciento dieciséis", "ciento diecisiete", "ciento dieciocho", "ciento diecinueve", "ciento veinte", "ciento veintiuno", "ciento veintidós", "ciento veintitrés", "ciento veinticuatro", "ciento veinticinco", "ciento veintiséis", "ciento veintisiete", "ciento veintiocho", "ciento veintinueve", "ciento treinta", "ciento treinta y uno", "ciento treinta y dos", "ciento treinta y tres", "ciento treinta y cuatro", "ciento treinta y cinco", "ciento treinta y seis", "ciento treinta y siete", "ciento treinta y ocho", "ciento treinta y nueve", "ciento cuarenta", "ciento cuarenta y uno", "ciento cuarenta y dos", "ciento cuarenta y tres", "ciento cuarenta y cuatro", "ciento cuarenta y cinco", "ciento cuarenta y seis", "ciento cuarenta y siete", "ciento cuarenta y ocho", "ciento cuarenta y nueve", "ciento cincuenta", "ciento cincuenta y uno", "ciento cincuenta y dos", "ciento cincuenta y tres", "ciento cincuenta y cuatro", "ciento cincuenta y cinco", "ciento cincuenta y seis", "ciento cincuenta y siete", "ciento cincuenta y ocho", "ciento cincuenta y nueve", "ciento sesenta", "ciento sesenta y uno", "ciento sesenta y dos", "ciento sesenta y tres", "ciento sesenta y cuatro", "ciento sesenta y cinco", "ciento sesenta y seis", "ciento sesenta y siete", "ciento sesenta y ocho", "ciento sesenta y nueve", "ciento setenta", "ciento setenta y uno", "ciento setenta y dos", "ciento setenta y tres", "ciento setenta y cuatro", "ciento setenta y cinco", "ciento setenta y seis", "ciento setenta y siete", "ciento setenta y ocho", "ciento setenta y nueve", "ciento ochenta", "ciento ochenta y uno", "ciento ochenta y dos", "ciento ochenta y tres", "ciento ochenta y cuatro", "ciento ochenta y cinco", "ciento ochenta y seis", "ciento ochenta y siete", "ciento ochenta y ocho", "ciento ochenta y nueve", "ciento noventa", "ciento noventa y uno", "ciento noventa y dos", "ciento noventa y tres", "ciento noventa y cuatro", "ciento noventa y cinco", "ciento noventa y seis", "ciento noventa y siete", "ciento noventa y ocho", "ciento noventa y nueve", "doscientos"};
                for (int i = 0; i < uno.length; i++) {
                    for (int j = 0; j < dos[i].length; j++) {
                        try {
                            // tempo = Integer.parseInt(uno[i][j]) + Integer.parseInt(dos[i][j]);
                            int suma = Integer.parseInt(uno[i][j]) + Integer.parseInt(dos[i][j]);
                            tres[i][j] = numeros[suma];
                        } catch (Exception ex) {
                            tres[i][j] = "cero";

                        }
                    }
                }
                System.out.println(Arrays.deepToString(tres));
            }
        }