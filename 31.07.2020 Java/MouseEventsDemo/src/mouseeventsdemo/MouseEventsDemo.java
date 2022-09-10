
package mouseeventsdemo;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;

public class MouseEventsDemo  implements MouseMotionListener
{
    //MouseMotionListener
    //MouseDragged
    //MouseMoved
    
    
    //MouseInputListener
    //MouseClicked
    //MouseEntered
    //MouseReleased
    //MousePressed
    //MouseExited
    //MouseDragged      - deprecated
    //MouseMoved        - deprecated
    
    JFrame jf=new JFrame("Mouse Listener Demo");
    JButton jb=new JButton("Submit");

    public MouseEventsDemo() 
    {
        jb.setBounds(100, 120, 100, 40);
        jb.setBackground(Color.white);
        jb.setForeground(Color.black);
        
        jb.addMouseMotionListener(this);
        
        jb.addMouseListener(new MouseInputListener() 
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                JOptionPane.showMessageDialog(jf, "mouse clicked....");
            }

            @Override
            public void mousePressed(MouseEvent e) 
            {
                //JOptionPane.showMessageDialog(jf, "mouse pressed....");
            }

            @Override
            public void mouseReleased(MouseEvent e) 
            {
                //JOptionPane.showMessageDialog(jf, "mouse released....");
            }

            @Override
            public void mouseEntered(MouseEvent e) 
            {
                    jb.setBackground(Color.red);
                    jb.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) 
            {
                jb.setBackground(Color.white);
                jb.setForeground(Color.black);

            }

            @Override
            public void mouseDragged(MouseEvent e) 
            {
                //JOptionPane.showMessageDialog(jf, "mousedragged....");
            }

            @Override
            public void mouseMoved(MouseEvent e) 
            {
                //System.out.println("Mouse MOved");
            }
        });
//        
        jf.add(jb);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
        
        
    public static void main(String[] args) 
    {
        MouseEventsDemo mvd=new MouseEventsDemo();
       
    }

    @Override
    public void mouseDragged(MouseEvent e) 
    {
        //JOptionPane.showMessageDialog(jf,"Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        int result=JOptionPane.showConfirmDialog(jf, "Do you want to exit?","Exit...",JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else if(result==JOptionPane.NO_OPTION)
        {
            
        }
    }

   
}
