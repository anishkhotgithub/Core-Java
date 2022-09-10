
package flowlayoutdemo;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame();
        
        for (int i = 0; i < 3; i++) 
        {
            JButton jb=new JButton(i+"");
            jb.setSize(50,10);
            jf.add(jb);
        }
        
        jf.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        jf.setSize(400,400);
        jf.setVisible(true);
    }
}
