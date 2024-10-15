public class ejercicioarrays {
    public static void main(String[] args) {
// leer la cantidad de vocales que hay y tambien la de consonantes y sumar los numeros
        String[] datos = {"74", "b", "u", "81", "a", "x", "986", "7", "v", "59", "o", "e"};
// calcular sumatoria total de los numeros
        // contar y almacenar las vocales
        // contar y almacenar las consonantes

        int sumatoria = 0, nvocales = 0, nconsonantes = 0;
        String vocales = "", consonantes = "";
        //1- iterar sobre el array
        String numeros = "1234567890";
        String temp = "";
        String voc = "aeiou";
        for (int i = 0; i < datos.length; i++) {
            temp = datos[i];
            try {
                sumatoria = sumatoria + Integer.parseInt(temp);
            } catch (Exception ex) {
                ex.printStackTrace();
                if (voc.indexOf(temp.toLowerCase()) >= 0) {//filtra vocales
                    nvocales++;
                    vocales = vocales + temp;
                } else {// quedan mas que consonantes
                    nconsonantes++;
                    consonantes = consonantes + temp;
                }
                ex.printStackTrace();
                System.out.println("<<<<<Hubo un error seguimos <<<<");
            }
        }
        System.out.println("cantidad de vocales " + nvocales);
        System.out.println("cantidad de consonantes " + nconsonantes);
        System.out.println("cantidad de vocales " + vocales);
        System.out.println("cantidad de consonantes " + consonantes);
        System.out.println("sumatoria " + sumatoria);


    }
}
