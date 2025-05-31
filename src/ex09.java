import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a / b == 0) {
            System.out.println("SAO MULTIPLOS");
        }
        else if (b / a == 0) {
            System.out.println("SAO MULTIPLOS");
        }
        else {
            System.out.println("NAO SAO MULTIPLOS");
        }

        sc.close();
    }
}
