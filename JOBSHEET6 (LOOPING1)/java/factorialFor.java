import java.util.Scanner;
public class factorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, factorial, i;

        System.out.println("Enter a number : ");
        number = sc.nextInt();

        factorial = 1;
        for (i=1 ; i<= number; i++){
            factorial = factorial * i;
        }

        System.out.printf("The factorial of %d is %d\n", number, factorial);
    }
}