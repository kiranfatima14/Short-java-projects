import java.util.ArrayList;

public class ListOfArrays {

    public static void main(String args[]){

        //no need to tell the size
        //no need to tell data type
        //can use some extra methods

      /*  int a[] = new int [10];
        a[0] = 22;
        a[1] = "22";
        a[2] = 22.19;*/
        

     ArrayList list = new ArrayList();
     list.add("22");
     list.add(22.23);
     list.add(22);

    /* ArrayList <String> namelist= new ArrayList<String>();
        namelist.add("kiran");
        namelist.add("hani");
        namelist.add("zain");*/

       /* for(Object ob : namelist ){
            System.out.println("Name : " + ob);
        }*/
        
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(10);
        numberList.add(2);
        numberList.add(5);


       // numberList.clear();
     //   numberList.remove(1);


       // numberList.set(2 , 20);
       boolean bx = numberList.contains(5);

        System.out.println(bx);

        for (int i=0; i<numberList.size(); i++){
            System.out.println("Numbers : " + numberList.get(i));

        }

        
    }
    
   
}
