import java.util.Scanner;
import java.util.InputMismatchException;

public class BatallaRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("DADO DEL DAÑO CAUSADO AL ENEMIGO");
            System.out.print("Inserte la vida del enemigo: ");
            int vida = sc.nextInt();
            System.out.print("¿Tiene escudo?, select true or false: ");
            boolean escudo = sc.nextBoolean();
            int dado = (int) (Math.random() * 6) + 1;
            int dano = 0;

            switch (dado) {
                case 1:
                    System.out.println("¡Fallaste!");
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                    dano = 10;
                    break;

                case 6:
                    dano = 25;
                    System.out.println("¡Critico!");
                    break;
            }
            if (escudo) {
                dano /= 2;
            }
            vida = vida - dano;

            if (vida <= 0) {
                System.out.println("¡Enemigo derrotado!");
            } else {
                System.out.println("Vida restante: " + vida);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada invalida. Ingrese un valor numerico para la vida y 'true' o 'false' para el escudo");
        }
    }
}
