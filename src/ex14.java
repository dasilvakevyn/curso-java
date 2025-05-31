import java.util.Locale;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double impostoDeRenda;

        if (salario <= 2000.0) {
            System.out.println("Isento");
        }
        else if (salario <= 3000.0) {
            impostoDeRenda = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f", impostoDeRenda);
        }
        else if (salario <= 4500.0) {
            impostoDeRenda = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", impostoDeRenda);
        }
        else {
            impostoDeRenda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", impostoDeRenda);
        }

        sc.close();
    }
}
