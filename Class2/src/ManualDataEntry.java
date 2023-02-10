public class ManualDataEntry {
    public static void main(String args[]){

        // manually adding data in 2d array

        String arr[][] = new String [4][3];

        arr[0][0] = "NAME" ;  arr[0][1] = "CLASS" ;  arr[0][2] = "AGE" ;
        arr[1][0] = "ALI" ;  arr[1][1] = "6" ;  arr[1][2] = "12" ;
        arr[2][0] = "ASAD" ;  arr[2][1] = "7" ;  arr[2][2] = "13" ;
        arr[3][0] = "ADil" ;  arr[3][1] = "8" ;  arr[3][2] = "14" ;


        for(int i=0; i< arr.length ; i++){

            for(int j=0 ; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");


            }
            System.out.println( );



        }


    }
}
