
package swingtabledemo;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingTableDemo 
{
    public static void main(String[] args) 
    {
        JFrame jf=new JFrame();
        
        String cols[]={"Id","Name","Age"};
        String rows[][]={
            {"123","Mahesh","29"},
            {"124","Mitesh","39"},
            {"125","Manish","59"}
        };
        
        JTable jt=new JTable(rows,cols);
        JScrollPane jsp=new JScrollPane(jt);
        
        jf.add(jsp);
        jf.setSize(400,400);
        jf.setVisible(true);
    }   
}
