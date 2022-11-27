import java.util.Scanner;

public class Student {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int stClass;
        System.out.println("Enter your class " );
        stClass = sc.nextInt();

        if(stClass >= 1 && stClass <=5 ){
            System.out.println("class " + stClass +" fees is 10,000");
        } else if (stClass >=6 && stClass <=8 ) {
            System.out.println("class " +stClass+ " fees is 15,000 ");

        } else if (stClass >=9 && stClass  <=10) {
            System.out.println("class " + stClass + " fees is 18,000 ");
        }
        else if (stClass >=11 && stClass <=12) {
            System.out.println("class " + stClass +" fees is 20,000 ");
        }
        else
            System.out.println(" class Not available");

        }



    }

