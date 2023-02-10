import javax.swing.*;

public class JoptionPractice {

    public static void main(String args[]){

        String Input = JOptionPane.showInputDialog("Enter the number");
        int num = Integer.parseInt(Input);
        JOptionPane.showMessageDialog(null , num);

        String Input1 = JOptionPane.showInputDialog("Enter boolean type");
        Boolean b = Boolean.parseBoolean(Input1);
        JOptionPane.showMessageDialog(null , b);

        String Input2 = JOptionPane.showInputDialog("Enter byte number");
        Byte bx = Byte.parseByte(Input2);
        JOptionPane.showMessageDialog(null , bx);

    }
}
