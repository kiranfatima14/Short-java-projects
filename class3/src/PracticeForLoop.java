import java.util.Scanner;

public class PracticeForLoop {
    public static void main(String args[]){
        //user have to decide the size of an array

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the size of an array ");
        int arrLen = sc.nextInt();

        String arr[] = new String[arrLen];
         arrLen = arr.length;

        //user have to enter the records

        for(int i=0 ; i<arrLen ; i++){

            System.out.println((i+1) + " Enter the name of records");
            String name = sc.next();

            arr[i] = name;
        }

        //system should print all
        System.out.println("printing all the names");

        for(int j=0 ; j<arrLen ; j++){
            System.out.println((j+1)+""+ arr[j]);
        }
        //system should ask for a search
        System.out.println("do you want to search a name ? y/n");
        char searchForName = sc.next().charAt(0);

        if(searchForName == 'y'){
            System.out.println("Enter the name to search ");
            String searchToName = sc.next();

            boolean isNameFound = false;
            //system should reply for the search
            for(int i=0; i<arrLen ; i++){
                String arrName = arr[i];
                if(arrName.equals(searchToName) ){

                    System.out.println("name is found at "+ (i+1));
                    isNameFound =true;
                    break;
                }
            }
            if(isNameFound == false){
                System.out.println("name is not found in records");
            }
        }
        //system should ask for deletion
        System.out.println("Do you want to delete the records y/n ");
        char deleteName = sc.next().charAt(0);

       if(deleteName == 'y') {
           System.out.println("which name you want to delete");
           String delName = sc.next();

           for (int j = 0; j < arrLen; j++) {

               String arrName = arr[j];

               if (arrName.equals(delName)) {
                   System.out.println("records is deleted");
                   arr[j] = "";
                   break;
               }

           }
       }
       //show final records
        int recordNumber= 1;
        System.out.println("printing the names\n");
       for(int i=0 ; i<arrLen ; i++){

          if(!arr[i].isEmpty())
           System.out.println(recordNumber + "" + arr[i]);
          recordNumber ++;
       }


    }
}
