package Level1;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("enter numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("enter another number");
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int x;
        x = Math.min(a,b);
        System.out.println(x);

        }
}
