
package swingcheckboxdemo;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class SwingCheckBoxDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame("CheckBox Demo");
        
        JCheckBox jcb1=new JCheckBox("C++");
        JCheckBox jcb2=new JCheckBox("Java");
        JCheckBox jcb3=new JCheckBox("Python");
        
        jcb1.setBounds(140, 100, 100, 30);
        jcb2.setBounds(140, 130, 100, 30);
        jcb3.setBounds(140, 160, 100, 30);
        
        jf.add(jcb1);
        jf.add(jcb2);
        jf.add(jcb3);
        
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
