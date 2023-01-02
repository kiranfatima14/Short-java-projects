import java.util.Scanner;

public class Assignment1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String password;
        String num = "0123456789";


        System.out.println("Enter the password");
        password = sc.next();
        password.charAt(0);


        String st = password.charAt(0) + "";
        boolean value = num.contains(st);


        // System.out.println(value);
        /*----------------------------*/

        int len = password.length();
        boolean b = len == 8;

        /*----------------------------*/
        String value2 = password.toUpperCase().charAt(5) + "";
        boolean val = password.contains(value2);
        String s = password.replace(password.charAt(5) + "", value2);
        //System.out.println("4: " + s);




        /*--------------------------------------------------*/
        char last = password.charAt(len - 1);
        char lower = password.toLowerCase().charAt(len - 1);
        String s4 = password.replace(last, lower);


        // System.out.println(lower + " this is the last character of password in lower case");


        if (value = !num.contains(st)) {
            System.out.println("password should start with integer");


            if (len != 8) {
                System.out.println("password length is incorrect");

                       if(!password.contains(value2)){
                            System.out.println("5th character should be upper case");

                        }

                        if(!password.contains(password.toLowerCase().charAt(len - 1)+"")) {
                        System.out.println("password last character should be lower case");
                    }
                }

            } else {
                System.out.println(password);
            }

        }
    }













