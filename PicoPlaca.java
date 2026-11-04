import java.util.Scanner;

public class PicoPlaca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dígito: ");
        int digito = sc.nextInt();
        String dia;

        switch (digito) {
            case 1: case 2: dia = "lunes"; break;
            case 3: case 4: dia = "martes"; break;
            case 5: case 6: dia  = "miercoles";break;
            case 7: case 8: dia = "jueves"; break;
            case 9: case 0: dia = "viernes"; break;
            default: dia= "digito invalido";
        }
        System.out.print("restriccion: " + dia);
    }
}