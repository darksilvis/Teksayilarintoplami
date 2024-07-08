import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("sayi giriniz: ");
        i = input.nextInt();

        for (int j = 1; j <= i; j++) {
            if (j % 2 == 1) {
                sum += j;
            }
        }

        System.out.println(i + "'ye kadar olan tek sayilarin toplami: " + sum);
    }
}
