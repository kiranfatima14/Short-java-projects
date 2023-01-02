import java.util.Scanner;

public class Methods {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc .nextInt();

        System.out.println("Enter second number ");
        int b = sc.nextInt();

        int result = add(a ,b) ;

        System.out.println("Enter first number");
        int x = sc .nextInt();

        System.out.println("Enter second number ");
        int y = sc.nextInt();

        result = multiply(x ,y);

    }
    public static int add (int a , int b){
        int sum = a+ b ;

        System.out.println(sum +" answer");

        return sum;

    }
    public static int multiply(int x , int y){

        int sum = x * y;

        System.out.println(sum + "multiplication");
        return sum;
    }
}

