public class TwoDimensionalArray {
    public static void main(String args[]){

        String st[][] = new String[3][4];

        //0 //0// name;
        //0 //1// age;
        //0 // 2 // class;
        //0 // 3 // grade;

        st[0][0] = "kiran";
        st[0][1] = "28";
        st[0][2] = "bachelors";
        st[0][3] = "A";

        st[1][0] = "zain";
        st[1][1] = "29";
        st[1][2] = "IT";
        st[1][3] = "A+";

        st[2][0] = "Ali";
        st[2][1] = "18";
        st[2][2] = "First year";
        st[2][3] = "B";

        /*for(String b[] : st){
            System.out.println("Name : " +b[0]);

            System.out.println("\nAGE : " + b[1]);

            System.out.println("\nclass : " + b[2]);
            System.out.println("\nGrade : "+ b[3]);
        }*/

        /*for(int i=0 ; i< st[0].length ; i++){

            System.out.println(st[0][i]);
        }*/

        for (int i=0; i<st.length ; i++){
            System.out.println("name : "+st[i][0]);
        }


    }
}
