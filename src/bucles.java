public class bucles {
    public static void main(String[] args) throws Exception {
        /*
         *  Bucle For
         * for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
         */


        // Bucle While
        /*
        int contador = 1;
        
        while(contador <=5){
            System.out.println(contador);
            contador++;
        }
        */

        /* Bucle Do While */

        // int contador = 1;

        // do{
        //     System.out.println(contador);
        //     contador++;
        // }while(contador <= 5);

        int i;

        for(i = 1; i <= 10; i++){
            System.out.println(i);
            if(i == 5){
                // break; nos sirve para cortar
                // continue; se salta las lineas que continuan de las llaves
                // return; es como el break pero en las funciones nos devuelve lo que nosotros queramos
            }
            System.out.println(i);
        }

    }
}
