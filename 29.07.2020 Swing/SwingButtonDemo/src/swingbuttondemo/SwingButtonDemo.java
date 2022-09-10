
package swingbuttondemo;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingButtonDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame();
        JButton jb=new JButton("Submit");
        jb.setBounds(150, 150, 100, 50);
        
        jf.add(jb);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
