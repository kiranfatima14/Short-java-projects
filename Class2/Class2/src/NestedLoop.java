import java.util.Scanner;

public class NestedLoop {
    public static void main(String args[]){
        //guess the word
        char ch1 = 'a';
        char ch2 = 'p';
        char ch3 = 'p';
        char ch4 = 'l';
        char ch5 =  'e';

        Scanner sc = new Scanner(System.in);
        char word ;

        System.out.println("Enter the the first letter");
        word = sc.next().charAt(0);

        boolean isPassed = false;

        if(word==ch1) {
            System.out.println("Enter the second letter");
            word = sc.next().charAt(0);

            if (word == ch2) {
                System.out.println("Enter the third letter");
                word = sc.next().charAt(0);

                if (word == ch3) {

                    System.out.println("Enter the fourth letter");
                    word = sc.next().charAt(0);

                if (word == ch4){
                    System.out.println("Enter the fifth letter");
                    word = sc.next().charAt(0);

                if (word == ch5) {

                    isPassed = true;
                    System.out.println("you win the game !!");

                        }


                     }
                 }
              }


            }

        if (isPassed==false){
            System.out.println("you loose the game !!");

        }

    }
}
