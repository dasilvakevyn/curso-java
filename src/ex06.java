import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTri = (a * c) / 2;
        double areaCir = 3.14159 * (c * c);
        double areaTra = ((a + b) * c) / 2;
        double areaQua = b * b;
        double areaRet = a * b;

        System.out.printf("TRIANGULO = %.3f %n", areaTri);
        System.out.printf("CIRCULO = %.3f %n", areaCir);
        System.out.printf("TRAPEZIO = %.3f %n", areaTra);
        System.out.printf("QUADRADO = %.3f %n", areaQua);
        System.out.printf("RETANGULO = %.3f %n", areaRet);

        sc.close();
    }
}
