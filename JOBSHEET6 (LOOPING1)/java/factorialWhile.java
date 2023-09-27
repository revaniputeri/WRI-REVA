import java.util.Scanner;

public class factorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, factorial, i;

        System.out.println("Enter a number : ");
        number = sc.nextInt();

        factorial = 1;
        i = 1;
        do {
            factorial = factorial * i;
            i++;
        } while (i <= number);

        System.out.printf("The factorial of %d is %d\n", number, factorial);

    }
}