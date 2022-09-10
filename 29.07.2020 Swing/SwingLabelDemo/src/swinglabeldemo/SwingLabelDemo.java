
package swinglabeldemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingLabelDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame("Label Demo");
        JLabel jl=new JLabel("Enter Username");
        jl.setBounds(140, 140, 100, 30);
        
        jf.add(jl);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
