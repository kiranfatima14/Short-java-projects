import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
   static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        //making a menu

        Scanner sc = new Scanner(System.in);


        int num = 0;
        int menu = 0;
        String name;
        int i = 0;


        do {

            System.out.println("Do you want to enter a data ? press 1");
            System.out.println("Do you want to delete the data press 2");
            System.out.println("Do you want to find out any data press 3");
            menu = sc.nextInt();


            if (menu == 1) {

                System.out.println("How much data you want to enter ?");
                num = sc.nextInt();


                for (int j = 0; j < num; j++) {

                    System.out.println("Enter your name");
                    name = sc.next();

                    list.add(name);

                    System.out.println(list);

                }

            } else if (list.isEmpty()) {
                System.out.println("please Enter first data");


            } else if (menu == 2) {

                System.out.println("which data you want to delete ?");
                String del = sc.next();

                list.remove(del);
                System.out.println(list);

            } else if (menu == 3) {

                System.out.println("which data you want to find ?");
                String find = sc.next();


                System.out.println(Collections.frequency(list, find));
            }


            System.out.println("do you want to see the menu again ? press 0 for return to menu and press 1 for exit");
            i = sc.nextInt();

        }


        while (i!=1);

        System.out.println("Exit");




    }

    }



