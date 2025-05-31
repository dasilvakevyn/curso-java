import java.util.Locale;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        double valor = sc.nextDouble();

        if ( valor < 0.0 || valor > 100.00 ) {
            System.out.println("Fora de Intervalo");
        }
        else if ( valor <= 25.00 ) {
            System.out.println("Intervalo [0, 25]");
        }
        else if ( valor <= 50.00 ) {
            System.out.println("Intervalo [25, 50]");
        }
        else if ( valor <= 75.00 ) {
            System.out.println("Intervalo [50, 75]");
        }
        else {
            System.out.println("Intervalo [75, 100]");
        }

        sc.close();
    }
}
