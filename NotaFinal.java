import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------NOTAS----------------------");

        System.out.println("Parcial 1:");
        double p1 = sc.nextDouble();

        System.out.println("Parcial 2:");
        double p2 = sc.nextDouble();

        System.out.println("Examen final:");
        double ef = sc.nextDouble();

        String estado = "";
        double nota = p1 * 0.3 + p2 * 0.3 + ef * 0.4;

        if (nota < 0 || nota > 5){
            System.out.println("Nota invalida");
        } else {
            if (nota >= 4.5) {
                estado = "Excelente";
            } else if (nota >= 3.0) {
                estado = "Aprobado";
            } else if (nota >= 2.5) {
                estado = "Habilitar";
            } else estado = "Reprobado";
        }
        System.out.println("Nota final:");

        System.out.println(nota + " -> " + estado);
    }
}