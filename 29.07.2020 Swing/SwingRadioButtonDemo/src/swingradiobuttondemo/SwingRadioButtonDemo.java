
package swingradiobuttondemo;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class SwingRadioButtonDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame("Radio Button Demo");
        
        JRadioButton jrb1=new JRadioButton("Male");
        JRadioButton jrb2=new JRadioButton("Female");
        
        jrb1.setBounds(140, 100, 100, 30);
        jrb2.setBounds(140, 130, 100, 30);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        
        jf.add(jrb1);
        jf.add(jrb2);
        
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
