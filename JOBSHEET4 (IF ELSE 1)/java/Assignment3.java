import java.util.Scanner;
public class Assignment3 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int midex, finalex, quizSc, assSc;
        double finalsc;

        System.out.println("Input the Midterm exam scores : ");
        midex = sc.nextInt();
        System.out.println("Input the final exam scores : ");
        finalex = sc.nextInt();
        System.out.println("Input the quiz scores : ");
        quizSc = sc.nextInt();
        System.out.println("Input the assignment scores : ");
        assSc = sc.nextInt();

        finalsc = (midex*0.3) + (finalex*0.4) + (quizSc*0.1) + (assSc*0.2);

        if(finalsc <=65 ){
            System.out.println("Your Score is "+finalsc+", you need remedial");
        }else{
            System.out.println("Your Score is "+finalsc+", Congratulation");
        }
    }
}