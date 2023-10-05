import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i,n;
        System.out.print("Input your number: ");
        n = sc.nextInt();
        for(i=1 ; i<=n; i++){
            if (i%5 != 0) {
                System.out.println(i);
            }
            
        }
    }
}