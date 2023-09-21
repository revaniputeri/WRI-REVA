import java.util.Scanner;;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String foodname;
        int price, delivery, totalprice, expressDelivery, shippingCost;

        System.out.println("Enter a food name : ");
        foodname = sc.nextLine();
        System.out.println("Enter the food price : ");
        price = sc.nextInt();
        System.out.println("Do you want express delivery (0=no, 1=yes)?");
        expressDelivery = sc.nextInt();

        if (expressDelivery == 0) {
            if (price < 100000) {
                shippingCost = 20000;
                
            } else  {
                shippingCost = 30000;
            }
            totalprice = price + shippingCost;
            System.out.println("RECEIPT");
            System.out.println(foodname + "                  IDR " + price);
            System.out.println("Shipping costs        Rp " + shippingCost);
            System.out.println("TOTAL                 Rp " + totalprice);
        } else if (expressDelivery == 1) {
            if (price < 100000) {
                shippingCost = 45000;
            } else {
                shippingCost = 55000;
            }
            totalprice = price + shippingCost;
            System.out.println("RECEIPT");
            System.out.println(foodname + "                  IDR " + price);
            System.out.println("Shipping costs        Rp " + shippingCost);
            System.out.println("TOTAL                 Rp " + totalprice);
        } else {
            System.out.println("The number you entered is invalid!");
        }

    }
}