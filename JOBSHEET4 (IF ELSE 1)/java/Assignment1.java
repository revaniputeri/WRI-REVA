import java.util.Scanner;
public class Assignment1 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int nilai1, nilai2;

        System.out.println("Masukkan nilai perbandingan 1 : ");
        nilai1 = sc.nextInt();
        
        System.out.println("Masukkan nilai perbandingan 2 : ");
        nilai2 = sc.nextInt();


        if(nilai1 > nilai2){
            System.out.println("Nilai terbesar antara Perbandingan 1&2 adalah "+nilai1);
        }else{
            System.out.println("Nilai terbesar antara Perbandingan 1&2 adalah "+nilai2);
        }


    }
}