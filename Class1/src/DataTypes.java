public class DataTypes {
    public static void main(String[] args){
        /*bytes 1byte (8 bits)*/
        byte a = 12;
        System.out.println(a);

        byte a1 = 127;
        System.out.println(a1);


        /*byte a2 = 128;
          System.out.println(a2);*/
        /* number is too large*/

        /*short 2bytes (16bits)*/
        short sh = 222;
        //short sh1 = 90000;/* number is too large*/

        /*int 4 bytes (32bits)*/
        int i = 3;
       // int ill = 2147684021;

        /* long 8 bytes (64 bits)*/
        long lg = 32;
        long lg1 = 32l;

        /* float 4 bytes (32 bits)         */
        float f = 3.5f;
        /*float f1 = 3.2; need to put f*/

        boolean b  = true;

        /* type conversion*/
        //type conversion are of two types

        //wide type....
        short sh33 = 100;
        int i2 = sh33;

        System.out.println("this is wide type " + i2);

        byte bb = 100;
        short s = bb;
        System.out.println(s);

        int a$ = 100;
        float ft = a$;
        System.out.println(ft);

        //narrow type....
        int a20 = 3000;
        short st = (short) a20;
        System.out.println(st);

        /* short length is larger than byte so type conversion will be wrong*/
        short ss = 200;
        byte b1 = (byte) ss;
        System.out.println(b1);

        float f1 = 3.5f;
        int ftt = (int)f1;
        System.out.println(ftt);




    }
}
