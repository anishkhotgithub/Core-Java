
package swingtextfielddemo;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingTextFieldDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame();
        JTextField jtf=new JTextField();
        jtf.setBounds(140, 140, 100, 40);
        
        jf.add(jtf);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
