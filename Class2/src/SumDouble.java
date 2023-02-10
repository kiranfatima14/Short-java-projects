import java.util.Scanner;

public class SumDouble {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("enter first number");
       int a = sc.nextInt();
        System.out.println("enter a second number");
       int b = sc.nextInt();

        int result = sumDouble(a , b);
     // System.out.println(result);


    }
    public static int sumDouble(int a , int b ){

         int sum = a+b;
      //  System.out.println(sum);

         /*if(a > b ){
             System.out.println(" total " + sum );

         }else if (a < b ){

             System.out.println("total " +sum);

         }*/
        System.out.println(a==b? sum*2:sum);
        // if (a==b) {
          //   System.out.println("double "+ (sum)*2);

        // }
            return sum;

    }
}
