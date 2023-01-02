import java.util.Scanner;

public class Practice3 {
    public static void main(String argd[]){
        Scanner sc = new Scanner(System.in);

        boolean isPassed = false;
        char ch1 = 'f';
        char ch2 = 'i';
        char ch3 = 's';
        char ch4 = 'h';


        System.out.println("Enter the first letter");
       char guess1= sc.next().charAt(0);


        if(ch1==guess1){

            System.out.println("guess the next letter");
            char guess2 = sc.next().charAt(0);



            if(ch2==guess2){
                System.out.println("guess the next letter");
                char guess3 =sc.next().charAt(0);

                if(ch3==guess3){
                    System.out.println("guess the next letter");
                   char guess4 = sc.next().charAt(0);


                    if(ch4==guess4){
                        isPassed = true;
                        System.out.println("congratulation");


                    }


                }


            }


        }
        if(isPassed==false){
            System.out.println("you are failed");
        }

    }
}
