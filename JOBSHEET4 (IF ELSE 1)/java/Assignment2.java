import java.util.Scanner;
public class Assignment2 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        int age;

        System.out.println("Input your age : ");
        age = sc.nextInt();
 
        if (age >= 17){
            System.out.println(" allowed to drive");
        }else{
            System.out.println("not Allowed to drive");
        }
    }
}