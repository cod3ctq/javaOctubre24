public class EjercicioArrays {

    public static void main(String[] args) {

        String[] datos = {"74","b","u", "81","a","x","986","7","v","59","o","e"};
        int sumatoria=0;
        int nvocales=0;
        int nconsonantes = 0;
        String vocales="";
        String consonantes="";
        String numeros="1234567890";
        String voc = "aeiou";
        String temp="";
        //1: Iterar sobre el array
        for (int i = 0; i < datos.length; i++) {
            temp = datos[i];
            try{
                // filtra numeros
                    sumatoria = sumatoria + Integer.parseInt(temp);
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("valor: "+temp);
                if(voc.indexOf(temp.toLowerCase())>=0){//filtra vocales

                    nvocales++;
                    vocales = vocales + temp;
                }else{ //no me queda mas que consonantes
                    nconsonantes++;
                    consonantes = consonantes+temp;
                }
                System.out.println(">>>>>>>>>>>>>>HUBO UN ERROR, PERO SEGUIMOS");
            }
        }
        System.out.println("Cantidad de vocales :"+nvocales);
        System.out.println("Cantidad de consonantes :"+nconsonantes);
        System.out.println("Vocales :"+vocales);
        System.out.println("Consonantes :"+consonantes);
        System.out.println("Sumatoria :"+sumatoria);





    }
}
