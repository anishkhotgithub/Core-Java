
package swingcomboboxdemo;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class SwingComboBoxDemo 
{
    public static void main(String[] args) 
    {
        String arr[]={"C++","Java","Python"};
        
        JFrame jf=new JFrame("ComboBox Demo");
        JComboBox jcb=new JComboBox(arr);
        jcb.setBounds(140, 140, 100, 30);
        
        jf.add(jcb);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
