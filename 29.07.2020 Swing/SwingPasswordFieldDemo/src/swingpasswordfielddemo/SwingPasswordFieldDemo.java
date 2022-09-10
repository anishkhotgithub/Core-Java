
package swingpasswordfielddemo;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class SwingPasswordFieldDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame("Password Demo");
        JPasswordField jpf=new JPasswordField();
        jpf.setBounds(140, 140, 100, 30);
        jpf.setEchoChar('#');
        
        jf.add(jpf);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
