import java.util.Scanner;

public class IfElse {
    public static void main(String argd[]){
        Scanner sc = new Scanner(System.in);
        int pen ;
        System.out.println("please Enter the number of the pen");
        pen = sc.nextInt();

        if(pen == 1){
            System.out.println("Pen color is red");
        } else if (pen == 2) {
            System.out.println("pen color is green");

        } else if (pen == 3) {
            System.out.println("pen color is blue");
        } else if (pen == 4) {
            System.out.println("pen color is yellow");

        } else if (pen == 5) {
            System.out.println("pen color is black");

        }else if (pen == 6) {
            System.out.println("pen color is pink");

        }else if (pen == 7) {
            System.out.println("pen color is orange");
        }
        else if (pen == 8) {
            System.out.println("pen color is purple");
        }
        else if (pen == 9) {
            System.out.println("pen color is indigo");
        }
        else {
            System.out.println("No such pen available");
        }


    }
}
