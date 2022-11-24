import javax.swing.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number 1" );
       int value1 = sc.nextInt();
        System.out.println("Enter number 2");
       int value2 =  sc.nextInt();

       int sum = value1 + value2;
        System.out.println("The sum of two numbers is " + sum);

        int sub = value1 - value2;
        System.out.println("The subtraction of two number is " + sub);

        int mul = value1 * value2;
        System.out.println("The multiplication of two numbers is " + mul);

        int div = value1 / value2;
        System.out.println("The division of two number is " + div);

        int rem = value1 % value2;
        System.out.println("The remainder of two number is " + rem);






    }
}
