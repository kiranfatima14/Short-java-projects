import java.util.Scanner;

public class ArrayPractice {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("what should be the size of an array");
        int arrlen = sc.nextInt();

        String[] arr = new String[arrlen];
         arrlen = arr.length;




        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter name");
            String name = sc.next();

            arr[i] = name;


        }
         for (int j = 0 ; j<arrlen ; j++){
         System.out.println(arr[j]);
         }

    }


}
