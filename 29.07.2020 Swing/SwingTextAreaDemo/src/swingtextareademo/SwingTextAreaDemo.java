
package swingtextareademo;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SwingTextAreaDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame("TextArea Demo");
        JTextArea jta=new JTextArea();
        jta.setBounds(140, 140, 100, 80);
        
        jf.add(jta);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
