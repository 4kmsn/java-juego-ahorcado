import java.util.Scanner;

public class maquina_de_bebidas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina de Bebidas");
        System.out.println("Elige una bebida");
        System.out.println("1-Cafe");
        System.out.println("2-Mate");
        System.out.println("3-Gaseosa");
        System.out.println("4-Vino");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Buena eleccion");
                break;
            case 2:
                System.out.println("Eres un pringao");
                break;
            case 3:
                System.out.println("Eres un marica");
                break;
            case 4:
                System.out.println("Eres un alcoholico");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        if(opcion <=4){
            System.out.println("Disfrute de su bebida");
        }
        
        scanner.close();

    }
}
