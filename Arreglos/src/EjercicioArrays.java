public class EjercicioArrays {
    public static void main(String[] args) {

        String[] datos = {"2", "b", "u", "81", "a", "x", "986", "74", "v", "59", "o", "e"};


        //1
        int sumatoria=0;
        int Nvocales=0;
        int Nconsonantes=0;
        String vocales="";
        String consonantes="";

        //Calcular sumatoria de los numeros
        //Contar y almacenar las vocales
        //Contar y almacenar las consonantes

        String numeros= "1234567890";
        String voc = "aeiou";
        String temp= "";

        //1: Iterar sobre el array
        for (int i = 0; i < datos.length; i++) {

            temp= datos[i];

            try{
                    sumatoria = sumatoria + Integer.parseInt(temp);
            }
            catch (Exception ex){
                ex.printStackTrace();
                System.out.println("Valor:" +temp);

                 if (voc.indexOf(temp.toLowerCase())>=0) { //filtra vocales
                    Nvocales++;
                    vocales = vocales + temp;
                }else {//quedan consonantes
                    Nconsonantes++;
                    consonantes = consonantes+temp;
                }

                System.out.println(">>Hubo error, pero seguimos");
            }



        }
        System.out.println("cantidad de vocales:" + Nvocales);
        System.out.println("cantidad de consonantes:" + Nconsonantes);
        System.out.println("vocales:" + vocales);
        System.out.println("consonantes:" + consonantes);
        System.out.println("sumatoria:" + sumatoria);
    }
}
