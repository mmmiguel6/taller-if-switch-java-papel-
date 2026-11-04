import java.util.Scanner;
import java.util.InputMismatchException;

public class Carrito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Subtotal de la compra: $ ");
            double subTotal = sc.nextDouble();
            System.out.print("Envio a: ");
            String ciudad = sc.next();
            double envio;
            boolean conocida = true;

            switch (ciudad.toLowerCase()){
                case "armenia":
                    envio = 5000; break;
                case "pereira":
                    envio = 8000; break;
                case "manizales":
                    envio = 9000; break;
                default:
                    envio = 15000;
                    conocida = false;
            }

            if (subTotal >= 150000 && conocida) {
                envio = 0;
            }

            double total = subTotal + envio;
            System.out.println("Envio: $ " + (int) envio );
            System.out.print("Total: $ " + (int) total);

        } catch (InputMismatchException e) {
            System.out.println("Error: El subtotal ingresado debe ser un valor numerico.");
        }
    }
}
