import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();


        int i = 1;

        do {

            System.out.println("Enter your name");
           String name = sc.next();

            list.add(name);
            i++;

        }
        while(i<5);



        System.out.println(list.get(i));


    }


}