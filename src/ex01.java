import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int valorUm = sc.nextInt();
        int valorDois = sc.nextInt();

        int soma = valorUm + valorDois;

        System.out.println("SOMA = " + soma);
        
        sc.close();
    }
}
