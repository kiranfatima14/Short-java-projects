import java.util.Scanner;

public class RepeatedString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

      String color="";
      String arr[] = new String [5];

      for (int i=0; i< arr.length ; i++){

          System.out.println(i+1 + " Enter a color");
          color = sc.next();

            arr[i] = color;
      }
      for(int j=0 ; j<arr.length+1 ; j++) {


          if (arr[j].contains(arr[j+1   ])) {

              String s = arr[j];

              System.out.println("duplicate " + s );


          }


          }



      }




    }


