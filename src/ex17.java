import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int produto = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (produto != 4) {
            if (produto < 1 && produto > 4) {
            }
            else if (produto == 1) {
                alcool += 1;
                produto = sc.nextInt();
            }
            else if (produto == 2) {
                gasolina += 1;
                produto = sc.nextInt();
            }
            else if (produto == 3) {
                diesel += 1;
                produto = sc.nextInt();
            }
            else {
            produto = sc.nextInt();
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool = " + alcool);
        System.out.println("Gasolina = " + gasolina);
        System.out.println("Diesel = " + diesel);

        sc.close();
    }
}
