import java.util.Scanner;

public class Assignment3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String Number ;
        //int num = Integer.parseInt(Number);


        System.out.println("Enter any number");
        Number = sc.next();
        int len = Integer.parseInt(Number);

        byte b = (byte) Integer.parseInt(Number);
        short sh = (short) Integer.parseInt(Number);
       long Longl  = Integer.parseInt(Number);
       float f = Integer.parseInt(Number);
       double d = Integer.parseInt(Number);



        if(len <= b){
            System.out.println("integer can be converted into byte");

            System.out.println(b);

        }else {
            System.out.println("cannot converted into byte");
        }
        if(len <= sh){
            System.out.println("integer can be converted into short");

            System.out.println(sh);
        }else{
            System.out.println("cannot be converted into short");
        }
        if(len == Longl){
            System.out.println("Integer can be converted into long");
            System.out.println(Longl);
        }else {
            System.out.println("cannot be converted");
        }
        if(len == f){
            System.out.println("Integer can be converted into float");
            System.out.println(f);
        }else {
            System.out.println("cannot be converted");
        }
        if(len == d){
            System.out.println("Integer can be converted into double");
            System.out.println(d);
        }else {
            System.out.println("cannot be converted");
        }




    }
}
