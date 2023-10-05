import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n, jumlah=0, sum=0;
        double count, average;

        System.out.print("Enter a number range: ");
        n = sc.nextInt();

        for (i=1;i<=n;i++){
            if (i%2 == 0) {
                jumlah++;
                System.out.println("Even number " +jumlah+" is "+i);
                sum += i;
                // count = 
            } 
            
        }
        average = sum / jumlah;
        System.out.println("The sum of the even number from 1 to " +n+" is "+sum);
        System.out.println("The average of the even number from 1 to " +n+" is "+average);
    }
}