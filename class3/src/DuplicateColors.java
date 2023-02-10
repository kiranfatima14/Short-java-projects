import java.util.Locale;
import java.util.Scanner;

public class DuplicateColors {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String color = "";
        String arr[] = new String[5];
        String match = "";
        for(int i=0 ; i<arr.length ;){

            System.out.println(i+1 +"  Enter the color");
            color = sc.next();


            String toLowercolor = color.toLowerCase();
            if(match.contains(toLowercolor)){
                System.out.println("color is repeated");
            }

            else{

                arr[i] = color;
                i++;
                match = match + color;

            }



        }
        System.out.println();
        System.out.println("color added");

        for (String clr:arr) {
            System.out.println(clr);

        }

    }
}
