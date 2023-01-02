public class practice {
    public static void main(String args[]){

        int a = 3;
        int b = 4;

        boolean bx = a==3 && b==4;
        System.out.println(bx);

        boolean bx1 = a==3 && b==5;
        System.out.println(bx1);

        boolean bx2 = a==4 && b==4;
        System.out.println(bx1);


        System.out.println("or operator");
        boolean bx3 = a==3 || b==4;
        System.out.println(bx3);

        boolean bx4 = a==3 || b==5;
        System.out.println(bx4);

        boolean bx5 = a==4 || b==4;
        System.out.println(bx5);
    }
}
