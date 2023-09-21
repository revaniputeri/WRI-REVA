import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side1, side2, side3;

        System.out.println("Enter the first side: ");
        side1 = sc.nextInt();
        System.out.println("Enter the second side: ");
        side2 = sc.nextInt();
        System.out.println("Enter the third side: ");
        side3 = sc.nextInt();
        
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Arbitrary Triangle");
        }
    }    
}