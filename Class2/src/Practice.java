import java.util.Scanner;

public class Practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        byte b = 2 ;
        int i ;

        System.out.println("Enter a integer number");
        i = sc.nextInt();

        System.out.println(i == b ? 0 + " equals" :  1 + " notequal");

        //Example 2

        int time = 20;
        System.out.println(time < 18 ? "good morning" : "good evening");

    }
}
