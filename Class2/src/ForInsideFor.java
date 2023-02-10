public class ForInsideFor {
    public static void main(String args[]){

        //nested for rules

        //1: first condition should be true to go inside the for loop
        //2 : second condition should be true to going further inside the loop
        //3: first loop is one time done and iside loop is 5 times done and same process is repeated
       /* int innerloop =0;
        for(int i=0; i<4 ; i++){//i=0

            for(int j=0 ; j<=innerloop ; j++ ){//0<i

                System.out.print("#");
            }
                innerloop ++;
            System.out.println();

        }*/
        /*-#
         --##
         ---###
         ----####

         */

       /* for(int i=1 ; i<=5 ; i++){
            for(int j=1; j<=i ; j++) {

                System.out.print("-");

            }
            for(int k=1; k<=i ; k++){
                System.out.print("#");
            }

            System.out.println();
        }

        */
        /*
        ----#
        ---##
        --###
        -####


         */
      /*  int spaceCount = 5;
        int starCount =1;
        for(int i=1; i<=5 ; i++){

            for(int j=1 ; j<=spaceCount ; j++){
                System.out.print("-");
            }
            for(int k=1; k<=starCount ; k++ ){
                System.out.print("* ");
            }

            spaceCount--;
            starCount ++;
            System.out.println();
        }

       */
        String space ="";
        for(int i=0; i<10 ; i++){
            System.out.println(space+"hello");
            space = space + " ";


        }

        System.out.println(" ");
    }
}
