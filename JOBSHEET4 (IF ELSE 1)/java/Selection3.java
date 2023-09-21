import java.util.Scanner;

import javafx.stage.StageStyle;
public class Selection3 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        int age;

        System.out.println("Enter your age : ");
        age = input.nextInt();

        if (age > 65){
            System.out.println("Elderly");
        }else if (age >18){
            System.out.println("Adults");
        }else if (age >12){
            System.out.println("Teens");
        }else if (age >5){
            System.out.println("Childern");
        }else if (age <=0){
            System.out.println("Sorry, the age you entered is wrong!");
        }else{
            System.out.println("Toddler");
        }
    }
}