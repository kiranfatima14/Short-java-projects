import java.util.Scanner;

public class CheckingNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num1  = 20;
        int num2  = 20;
        int num3  = 2;


        boolean isEqual = false;

        if(num1 == num2) {
            System.out.println("number is equal " + num1 + "  = " + num2 + " check next number");

            if (num1 == num3) {
                isEqual =true;
                System.out.println("all three are equals  " + num1 + " = " + num2 + " = " + num3);


            }

        }
        if (isEqual == false){
            System.out.println(" not equals");
        }

    }
}
