import java.util.Scanner;
public class Selection2 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int average, score1, score2;

        System.out.println("Enter a score 1 :");
        score1 = input.nextInt();
        System.out.println("Enter a score 2 :");
        score2 = input.nextInt();

        average = (score1+score2) / 2;

        if(average >= 100){
            average -= 5;
        }

        System.out.println("The final score is "+average);
    }
}