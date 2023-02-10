import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinAndMax {
    public static void main (String args[]){

        ArrayList <Integer> inList = new ArrayList();

        inList.add(10);
        inList.add(5);
        inList.add(6);
        inList.add(8);
        inList.add(7);
        inList.add(2);
        inList.add(4);
        inList.add(1);
        inList.add(3);
        inList.add(9);


   /*  Collections.sort(inList);
        System.out.println(inList);

        int min = inList.get(0);
        int max = inList.get(inList.size()-1);

        System.out.println(min);
        System.out.println(max);

    */
        int min =0;
        int max = 0 ;


        for (int i=0; i<inList.size() ; i++){

                if(i==0){
                    min = inList.get(i);
                }
           int num = inList.get(i);

            if(min>num){
                min = num ;

            }
            if(max<num){
                max = num;

            }

        }
        System.out.println(min +" minimum number");
        System.out.println(max +"maximum number");



    }
}
