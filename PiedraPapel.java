import java.util.Scanner;

public class CineU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------PIEDRA PAPEL O TIJERAS---------------");
        System.out.println("Elije:");
        System.out.println("1 = Piedra, 2 = Papel, 3 = Tijera");

        int jugador = sc.nextInt();
        int cpu = (int) (Math.random() * 3) + 1;
        System.out.println("CPU eligió: " + cpu);

        if (jugador < 1 || jugador > 3){
            System.out.println("Opción inválida");
        } else if ((jugador == 1 && cpu == 3) || (jugador == 2 && cpu == 1) || (jugador == 3 && cpu == 2)){
            System.out.println("¡GANASTE!");
        } else if ((jugador == 3 && cpu == 1) || (jugador == 1 && cpu == 2) || (jugador == 2 && cpu == 3)){
            System.out.println("Gana la cpu.");
        } else {
            System.out.println("Empate");
        }





    }
}