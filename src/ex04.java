import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int horaTrab = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horaTrab * valorHora;

        System.out.println("NUMBER =" + num);
        System.out.printf("SALARY = %.2f", salario);

        sc.close();
    }
}
