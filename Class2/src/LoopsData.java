import java.util.Scanner;

public class LoopsData {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String data = "";

        String[][] arr = new String [4][3];

        arr[0][0] = "NAME" ;  arr[0][1] = "CLASS" ;  arr[0][2] = "AGE" ;

        for(int a=1 ; a<arr.length ; a++){



            for (int b=0 ; b<arr[a].length ; b++) {

                System.out.println(arr[0][b]);

                data = sc.next();


                arr[a][b] = data ;



            }


        }




        for(int i=0; i< arr.length ; i++){


            for(int j=0 ; j<arr[i].length; j++) {



                System.out.print(arr[i][j] + " ");


                


            }
            System.out.println( );



        }


    }
}
