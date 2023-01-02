import java.util.Scanner;

public class practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount you want to pay");
       int pay = sc.nextInt();

        if(pay<=10){
            System.out.println("you have to pay 5% tax");
        }
        else if(pay>10 && pay<=50){
            System.out.println("you have to pay 10% tax");
        }
       else if(pay>50 && pay<100){
            System.out.println("you have to pay 15% tax");
        }



    }
}
