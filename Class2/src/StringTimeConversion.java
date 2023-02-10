import java.util.Scanner;

public class StringTimeConversion {




    public static void main(String args[]) {

        // now let us start the program
        //working on PM
        //if the time is 1:00:00PM than it should show 13:00:00
        //And if time is 12:00PM THAN IT SHOULD SHOW 12:00:00

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a time");
        String s = sc.next();

        String res = "";

        if (s.endsWith("PM")) {

            if (s.contains("12")) {

                res = s;

            } else {

                String br[] = s.split(":"); // it is use to split the time
                int time = Integer.parseInt(br[0]); // converting String into integer

                time = time + 12;
                res = time + ":" + br[1] + ":" + br[2];

            }
            res = res.substring(0, s.length() - 2);
            System.out.println(res);
        }
        // Now let work on AM
        // IF TIME IS 12:00:00AM IT SHOULD SHOW 00:00:00AM
        //AND IF TIME IS 1:00:00AM IT WILL SHOW 1:00:00

        if (s.endsWith("AM")) {
            if (s.contains("12")) {
                String br[] = s.split(":");
                int time = Integer.parseInt(br[0]);
                time = time - 12;
                res = time + "0" + ":" + br[1] + ":" + br[2];

            }
            else {
                res = s;

            }
            res = res.substring( 0 , s.length()-2);
            System.out.println(res);
        }
    }
}
