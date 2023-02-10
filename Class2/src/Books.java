import java.util.Scanner;

public class Books {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        String bkName ;
        System.out.println("Enter the name of the book");
        bkName = sc.next();

        String st = find(bkName);

       // System.out.println(st);


    }
    public static String find(String bkName){
        if (bkName.equals("science")){
            System.out.println("Science book available");
        }else if(bkName.equals("maths")){
            System.out.println("Maths book available");
        } else if (bkName.equals("english")) {
            System.out.println("English book is available");

        } else if (bkName.equals("statistic")) {
            System.out.println("Statistic book is avaialable");

        } else if (bkName.equals("c language")) {
            System.out.println("C language book is available");

        }else {
            System.out.println("Book is not available");
        }


        return bkName;

    }
}
