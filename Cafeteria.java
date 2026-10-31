import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------Menu----------------------");
        System.out.println("1 = Tinto, $2000 | 2 = Capuchino, $4500 | 3 = Empanada, $3000 | 4 = Almuerzo, $14000");

        System.out.println("Opcion:");
        int opcion = sc.nextInt();

        System.out.println("Cantidad: ");
        int cantidad = sc.nextInt();

        String producto = " ";
        int precio = 0;
        double total = 0;

        switch (opcion){
            case 1:
                producto = "Tinto"; precio = 2000; break;
            case 2:
                producto = "Capuchino"; precio = 4500; break;
            case 3:
                producto = "Empanada"; precio = 3000; break;
            case 4:
                producto = "Almuerzo"; precio = 14000; break;
            default:
                System.out.println("Opcion no valida");
        }

        if (precio > 0) {
            total = precio * cantidad;
        }
        if (cantidad >= 3) {
            total *= 0.90;
        }
        System.out.println(producto + " x" + cantidad + " = $" + (int)total);

    }
}