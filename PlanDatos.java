import java.util.Scanner;

public class PlanDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("seleccione un paquete: ");

        String paquete = sc.nextLine();

        System.out.print("cuantos meses desea: ");
        int meses = sc.nextInt();

        int precio = 0;
        int gigas = 0;
        boolean valido = true;

        switch (paquete.toUpperCase()) {
            case "BASICO":
                precio = 10000;
                gigas = 2;
                break;

            case "PLUS":
                precio = 20000;
                gigas = 6;
                break;

            case "MAX":
                precio = 35000;
                gigas = 15;
                break;

            default:
                System.out.println("Paquete no existe");
                valido = false;
                break;
        }
        if (valido) {
            if (meses >= 12) {
                gigas += 1;
            }
        }

        System.out.println("PLAN DE DATOS: ");
        System.out.println(paquete.toUpperCase() + ": $" + precio + "  " + gigas + " GB");
    }
}
