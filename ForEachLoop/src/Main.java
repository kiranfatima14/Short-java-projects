import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Array limit 5
        // ask five colors
        // no duplicate colors
        //loop count on unique color
        Scanner sc = new Scanner(System.in);


        String color = "";

        String arr[] = new String[5];


        //loop
        for (int i = 0; i < arr.length; i++) {

            //Enter first colors
            System.out.println(i+1 + " Enter color");
            color = sc.next();


            arr[i] = color;
           // match = arr[i];


            //using if condition for duplicates color

        }
        for (int j = 0; j < arr.length; j++) {

            String matchColor = "";

            if (color.contains(arr[j])) {
               matchColor = arr[j];

                System.out.print(matchColor);
                break;
            }



        }

    }
}
