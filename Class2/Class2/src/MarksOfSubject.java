import java.util.Scanner;

public class MarksOfSubject {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

       float sub1 ;
        System.out.println("Enter the marks of subject 1");
        sub1 = sc.nextFloat();

        if(sub1 <=100 && sub1 >=50){
            System.out.println("you are pass in subject 1 :  " + sub1);
        } else {
            System.out.println("you are fail in subject 1 :   " + sub1);;
        }


        float sub2 ;
        System.out.println("Enter the marks of subject 2");
        sub2 = sc.nextFloat();

        if(sub2 <=100 && sub2 >=50){
            System.out.println("you are pass in subject 2 :  " + sub2);
        } else {
            System.out.println("you are fail in subject 2 :   " + sub2);;
        }

        float sub3;
        System.out.println("Enter the marks of subject 3");
        sub3 = sc.nextFloat();

        if(sub3 <=100 && sub3 >=50){
            System.out.println("you are pass in subject 3 :  " + sub3);
        } else {
            System.out.println("you are fail in subject 3 :   " + sub3);;
        }

        float total = (sub1 + sub2 + sub3)/300*100;

       if(total <=100 && total >=50){
           System.out.println("pass " + total);

       }
       else if (total < 50) {
           System.out.println("fail " + total);


       }
    }
}
