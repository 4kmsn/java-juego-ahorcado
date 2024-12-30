public class arreglos {
    public static void main(String[] args) throws Exception{

        int [] numeros = {10,20,30,40,50};
      

        // System.out.println(numeros[0]);

        // System.out.println(numeros.length);

        // for(int i = 0; i < numeros.length;i++ ){
        //     System.out.println(numeros[i]);
        // }

        // forEach
        int indice = 0;
        for(int numero: numeros){
            System.out.println("El indice: " + indice + " y el numero es: "+ numero);
            indice++;
        }

    }
}
