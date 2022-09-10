
package layoutdemo;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame("GridLayout Demo");
        
        for (int i = 0; i < 10; i++) 
        {
            JButton jb=new JButton(i+"");
            jf.add(jb);
        }
        
        jf.setSize(400,400);
        jf.setLayout(new GridLayout(5, 2));
        jf.setVisible(true);
        
    }
}
