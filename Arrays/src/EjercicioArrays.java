import java.util.Locale;

public class EjercicioArrays {
    public static void main(String[] args) {
        int sumaintero =0, nvocales=0, nconsonantes=0 ;
        String vocales="";
        String consonantes ="";


        String [] datos = {"74","b","u","81","a","x", "986","7", "v", "59", "o", "e"};

        // calcular sumatoria de los numero

        // contar  y almacenar las vocales

        //contar  y almcenar las consonantes
        //direcionaro
         String voc = "aeiou";
         String numero = "1234567890";
         String temp="";
        //1: Iterar sobre el array
        for (int i =0 ; i<datos.length; i++){
                // imprimir lo que quiro visualizar
            temp=datos[i];
            // excepciones
             try{
               //  if (numero.indexOf(temp)>=0) { // filta el numero
                     sumaintero = sumaintero + Integer.parseInt(temp);


             }catch (Exception ex){
                 ex.printStackTrace();
                 System.out.println("Hubo Error pero seguimos");
                 if (voc.indexOf(temp.toLowerCase())>=0) { //filta vocales
                     vocales = vocales + temp;
                     nvocales++;
                 }else { // no me queda mas que consonantes
                     nconsonantes++;
                     consonantes=consonantes + temp;
                 }

//throw
                 //throws





             }



        }
       System.out.println("Cantidad de vocales "+nvocales);
        System.out.println("Cantidad de consonantes "+nconsonantes);
        System.out.println("Cantidad de vocal "+vocales);
        System.out.println("Cconsonantes "+consonantes);
        System.out.println("Sumaintero "+sumaintero);

    }
}
