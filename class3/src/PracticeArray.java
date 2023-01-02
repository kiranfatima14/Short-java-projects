import java.util.Scanner;

public class PracticeArray {
    public static void main(String args[]){
      //  String arr[] = new String[3];

       String arr[] = {"inaam" , "inaam1" , "inaam2"};

        Scanner sc = new Scanner(System.in);

        System.out.println("which name you want to search");
        String name = sc.next();

        boolean nameToSearch = false;

        for (int i=0 ; i<arr.length ; i++ ){
           //  arr[i] = name;
            System.out.println("loop" + i);
            if(name.equals( arr[i])){
                System.out.println("name is found");
                nameToSearch = true;
                break;
            }


        }
        if(nameToSearch==false){
            System.out.println("name is not found");
        }
    }
}
