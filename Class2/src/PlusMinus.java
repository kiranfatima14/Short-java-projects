import java.util.ArrayList;

public class PlusMinus {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add(-1);


        float sum = 0;
        float res =0;
        for(int i=0; i<list.size() ; i++){
            if(list.contains(i)){
                 sum = list.get(i);
                 sum = sum+sum ;

                res = sum /list.size();


            }

        }

        System.out.println(res);



    }
}
