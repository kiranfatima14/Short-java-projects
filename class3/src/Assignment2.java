import java.util.Scanner;

public class Assignment2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String input ;
        int selectNum;
        String oldSt ;
        String newSt ;


        System.out.println("Enter a string");
        input = sc.next();

        System.out.println("Menu :");
        System.out.println("1)  Replace the String character with  new character \n" +
                "2)  Replace the string with a string character \n" +
                "3) Replace the first matches string");

        selectNum = sc.nextInt();

        if(selectNum == 1 ){
            System.out.println("which character you want to replace");
            oldSt = sc.next();

            System.out.println("what is new character");
            newSt = sc.next();

           String change = input.replace(oldSt+"" ,  newSt+""  );

            System.out.println(change);
        }else if(selectNum == 2){
            System.out.println("which string you want to replace");
            oldSt = sc.next();

            System.out.println("what is new character");
            newSt = sc.next();

            String change = input.replaceAll(oldSt+"" , newSt+"");

            System.out.println(change);
        }else if(selectNum == 3){
            System.out.println("which string you want to replace");
            oldSt = sc.next();

            System.out.println("what is new character");
            newSt = sc.next();

            String change = input.replaceFirst(oldSt + "" , newSt+"");

            System.out.println(change);
        }


    }
}
