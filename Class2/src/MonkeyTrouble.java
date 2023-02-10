import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String args[]){
        boolean aSmile;
        boolean bSmile;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter monkey A is smiling?");
        aSmile =sc.nextBoolean();
        System.out.println("Enter monkey B is smiling ?");
        bSmile =sc.nextBoolean();

        boolean result = monkeyTrouble(aSmile , bSmile);
       // System.out.println(result);

    }
    public static boolean monkeyTrouble (boolean aSmile , boolean bSmile){
        if(aSmile==bSmile && bSmile==aSmile){
            System.out.println("true");
            //return true;

        }else{
            System.out.println("false");
        }

        return false;

    }
}

