public class DiamondPattern {
    public static void main(String args[]){
        int startLoop1 =5;
        for(int i=1; i<6 ; i++){

            for(int k=0 ; k<startLoop1 ; k++){

                System.out.print(" ");
            }
            startLoop1--;

            for(int j=0 ; j<i ; j++){

                System.out.print("* ");

            }

            System.out.println();


        }
        int startLoop = 5 ;
        int startLoop2 =1;

        for (int a=1 ; a<6 ; a++){

            for(int c=0 ; c<startLoop2 ; c++){

                System.out.print(" ");
            }
            startLoop2++;

            for(int b= startLoop ; b>0; b--){

                System.out.print("* ");
            }
            startLoop --;

            System.out.println();
        }
    }

}
