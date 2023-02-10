import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPractice {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String color;

        System.out.println("Enter the pen color");
        color = sc.next();

          String result =  PenColor(color);



    }
    public static String PenColor(String color){



        if(color.equals("blue")){
            System.out.println("This is 1st color  and available");

        }else if(color.equals("red")){
            System.out.println("This is second color and available");

        } else if (color.equals("green")) {
            System.out.println("This is third color and available");

        } else if (color.equals("black")) {
            System.out.println("This is forth color and available");

        } else if (color.equals("pink")) {
            System.out.println("This is third color and available");

        }else {
            System.out.println("color is not available");
        }
        return color;

    }
}
