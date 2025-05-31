import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codPecaUm = sc.nextInt();
        int numPecaUm = sc.nextInt();
        double valorPecaUm = sc.nextDouble();

        int codPecaDois = sc.nextInt();
        int numPecaDois = sc.nextInt();
        double valorPecaDois = sc.nextDouble();

        double valorPag = (valorPecaUm * numPecaUm) + (valorPecaDois * numPecaDois);

        System.out.println("CÓDIGO DA PEÇA 1 = " + codPecaUm);
        System.out.println("CÓDIGO DA PEÇA 2 = " + codPecaDois);
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPag);

        sc.close();
    }
}
