package 전자레인지;

import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = 300;
        int b = 60;
        int c = 10;
        int A = (T / a);
        int B = ((T % a) / b);
        int C = (((T % a) % b) / c);
        int D = (((T % a) % b) % c);

        if (T > 0 && D == 0) {
            System.out.println("T = " + A + B + C);

            }
        else if (D != 0) {
            System.out.println("T = " + -1);
        }
    }
}

