import javax.swing.*;


public class JavaSwing {
    public static void main(String args[]){
        int a ;
        String ch;
        byte b;

        //JOptionPane.showMessageDialog(null , "Enter a number");
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number" ));
        ch = JOptionPane.showInputDialog(null , "Enter the character");
        b = Byte.parseByte(JOptionPane.showInputDialog(null , "Enter the byte"));
         JOptionPane.showMessageDialog(null , a + " " + ch + " " + b );
        JOptionPane.showMessageDialog(null , "sum ="  + a+b);
    }





}
