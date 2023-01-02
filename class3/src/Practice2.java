import java.util.Scanner;

public class Practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arrLen;

        System.out.println("enter the numbers you want to add");
        arrLen = sc.nextInt();

        int arr[] = new int[arrLen];
        arrLen = arr.length;

        int sum =0;



        for(int i=0 ; i< arr.length ; i++) {

            System.out.println("enter number  " + (i + 1));
            int number = sc.nextInt();

            arr[i] = number;

            }
        for(int j=0; j<arrLen ; j++){

            System.out.println();
            System.out.println( (j+1) + " numbers = " + arr[j] );

            sum = sum + arr[j];



        }
        System.out.println("sum of the array is " +" " + sum);
        System.out.println("do you want to add these numbers y/n");
        char answer = sc.next().charAt(0);

        if(answer == 'y'){
          for(int i=0 ; i<arrLen ; i++ ){
              System.out.println("result ="+( arr[i]+ arr[i]));


          }
          for(int i=0; i<arrLen ; i++){

          }



        }

        
        }








    }

