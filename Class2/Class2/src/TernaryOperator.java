import java.util.Scanner;

public class TernaryOperator {
    public static void main(String args[]){
       /* int a =3;
        int b = 3 ;

        String st = a==b ? "equals" : "not equals";
        System.out.println(st);*/

      /*  int i , k ;
        i = 10 ;
        k = i < 0 ? -i : i;
        System.out.println(k);*/

        Scanner sc = new Scanner(System.in);
        char q ;
        char x ;

        System.out.println("Enter a character" );
        q = sc.next().charAt(0);

        char c = 's';
        System.out.println( c == q ? "equals" : "not equals");

        System.out.println(" enter next character");
        x = sc.next().charAt(0);

        char c1 = 'l';
        System.out.println(c1 == x ? "equals" : "not equal");












    }


}
