import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;

public class List {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("d");
        list.add("C");
        list.add("c");
        list.add("e");
        list.add("e");


        String name ="";
        int count = 0 ;
        String s = "";
        int total = 0;

        for (int i=0 ; i<list.size() ; i++){


            if(list.get(i).contains(name)){



               count++;

              s = name.toLowerCase();




            }

            name =  list.get(i);




        }

            System.out.println(count + " times " + s);


    }
}
