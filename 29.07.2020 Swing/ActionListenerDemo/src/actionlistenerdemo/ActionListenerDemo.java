
package actionlistenerdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListenerDemo implements ActionListener
{
    JFrame jf;
    JTextField jtf;
    JButton jb;
    
    public ActionListenerDemo() 
    {
       jf=new JFrame();
       jtf=new JTextField();
       jtf.setBounds(140, 100, 100, 30);
        
       jb=new JButton("Submit");
       jb.setBounds(140, 130, 100, 30);
        
       jb.addActionListener(this);
       
       jf.add(jb);
       jf.add(jtf);
       jf.setSize(400,400);
       jf.setLayout(null);
       jf.setVisible(true);
 
    }
        
    public static void main(String[] args) 
    {
        ActionListenerDemo acd=new ActionListenerDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         String name=jtf.getText();
         JOptionPane.showMessageDialog(jf, "Welcome "+name);
    }
}
