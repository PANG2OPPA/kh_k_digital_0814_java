package 소수의합구하기;

import java.util.Scanner;

public class Prime {
    public static int getPrimeSum(int number) {
        int sum = 0;

        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int inputNumber = scanner.nextInt();  // 사용자로부터 정수 입력 받기

        int primeSum = getPrimeSum(inputNumber);

        System.out.println("입력 받은 정수 " + inputNumber + "보다 작은 소수의 합: " + primeSum);

        scanner.close();
    }
}
