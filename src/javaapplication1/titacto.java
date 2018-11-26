package javaapplication1;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import static java.lang.System.exit;
import javax.swing.JOptionPane;


public class titacto extends WindowAdapter implements KeyListener
{
    Frame f;
     int i=0;
        TextField a1,a2,a3,a4,a5,a6,a7,a8,a9;
        public titacto()
        {
            f=new Frame();
              Label l1;  
             l1=new Label("use mouse to select box");  
                l1.setBounds(100,100,200,50);  
                l1.setEnabled(true);
             a1=new TextField();
             a4=new TextField();
             a2=new TextField();
             a3=new TextField();
             a5=new TextField();
             a6=new TextField();
             a7=new TextField();
             a8=new TextField();
             a9=new TextField();
             f.add(l1);
             f.add(a1);
             f.add(a2);
             f.add(a3);
             f.add(a4);
             f.add(a5);
             f.add(a6);
             f.add(a7);
             f.add(a8);
             f.add(a9);
             
            a1.setBounds(100,150,40,40);
            a2.setBounds(150,150,40,40);
            a3.setBounds(200,150,40,40);
            a4.setBounds(100,200,40,40);   
            a5.setBounds(150,200,40,40);
            a6.setBounds(200,200,40,40);
            a7.setBounds(100,250,40,40);
            a8.setBounds(150,250,40,40);
            a9.setBounds(200,250,40,40);
            
            a1.setEnabled(true);
            a2.setEnabled(true);
            a3.setEnabled(true);
            a4.setEnabled(true);
            a5.setEnabled(true);
            a6.setEnabled(true);
            a7.setEnabled(true);
            a8.setEnabled(true);
            a9.setEnabled(true);
            
            f.addWindowListener(this);
             a1.addKeyListener(this);
             a2.addKeyListener(this);
             a3.addKeyListener(this);
             a4.addKeyListener(this);
             a5.addKeyListener(this);
             a6.addKeyListener(this);
             a7.addKeyListener(this);
             a8.addKeyListener(this);
             a9.addKeyListener(this);
  
             f.setLayout(null);
            f.setVisible(true);
            f.setSize(400,400);
           
            
        }
        void set()
        {
            i=0;
            a1.setEnabled(true);
            a2.setEnabled(true);
            a3.setEnabled(true);
            a4.setEnabled(true);
            a5.setEnabled(true);
            a6.setEnabled(true);
            a7.setEnabled(true);
            a8.setEnabled(true);
            a9.setEnabled(true);
            
            a1.setText(null);a2.setText(null);a3.setText(null);a4.setText(null);a5.setText(null);
            a6.setText(null);a7.setText(null);a8.setText(null);a9.setText(null);
            a1.requestFocus();
        }
    public void windowClosing(WindowEvent e)
    {
        i=0;
        System.exit(0);
    }
    public void keyTyped(KeyEvent e)
    {
    }

    public void keyPressed(KeyEvent e) 
    {
        
    }

    public void keyReleased(KeyEvent e) 
    {
        TextField tf;
         tf = (TextField)e.getSource();
        tf.setEnabled(false);
      i++;
        System.out.println(i);
        if(e.getSource()==a1)
        {
        if(a1.getText().equals(a2.getText())&&a1.getText().equals(a3.getText())||a1.getText().equals(a4.getText())&&a1.getText().equals(a7.getText())||a1.getText().equals(a5.getText())&&a1.getText().equals(a9.getText()))
        {
            JOptionPane.showMessageDialog(a1,a1.getText()+"is winner!!!"); 
            set();
            
        }
        }
        else if(e.getSource()==a2)
        {
        if(a2!=null&&a2.getText().equals(a1.getText())&&a2.getText().equals(a3.getText())||a2.getText().equals(a5.getText())&&a2.getText().equals(a8.getText()))
        {
           
            JOptionPane.showMessageDialog(a2,a2.getText()+"is winner!!!"); 
            set();
        }
        }
        else if(e.getSource()==a3)
        {
            if(a3!=null&&a3.getText().equals(a1.getText())&&a3.getText().equals(a2.getText())||a3.getText().equals(a5.getText())&&a3.getText().equals(a7.getText())||a3.getText().equals(a6.getText())&&a3.getText().equals(a9.getText())){
            JOptionPane.showMessageDialog(a3,a3.getText()+"is winner!!!"); 
           set();
        }
        }
        else if(e.getSource()==a4)
        {
            if(a4!=null&&a4.getText().equals(a1.getText())&&a4.getText().equals(a7.getText())||a4.getText().equals(a5.getText())&&a4.getText().equals(a6.getText())){
            JOptionPane.showMessageDialog(a4,a4.getText()+"is winner!!!"); 
            set();
        }
        }
        else if(e.getSource()==a5)
        {
            if(a5!=null&&a5.getText().equals(a1.getText())&&a5.getText().equals(a9.getText())||a5.getText().equals(a2.getText())&&a5.getText().equals(a8.getText())||a5.getText().equals(a3.getText())&&a5.getText().equals(a7.getText())){
            JOptionPane.showMessageDialog(a5,a5.getText()+"is winner!!!"); 
           set();
        }
        }
        else if(e.getSource()==a6)
        {
            if(a6!=null&&a6.getText().equals(a3.getText())&&a6.getText().equals(a9.getText())||a6.getText().equals(a5.getText())&&a6.getText().equals(a4.getText())){
            JOptionPane.showMessageDialog(a6,a6.getText()+"is winner!!!"); 
            set();
        }
        }
        else if(e.getSource()==a7)
        {
            if(a7!=null&&a7.getText().equals(a1.getText())&&a7.getText().equals(a4.getText())||a7.getText().equals(a5.getText())&&a7.getText().equals(a3.getText())||a7.getText().equals(a8.getText())&&a7.getText().equals(a9.getText())){
            JOptionPane.showMessageDialog(a7,a7.getText()+"is winner!!!"); 
            set();
        }
        }
        else if(e.getSource()==a8)
        {
            if(a8!=null&&a8.getText().equals(a5.getText())&&a8.getText().equals(a2.getText())||a8.getText().equals(a7.getText())&&a8.getText().equals(a9.getText())){
            JOptionPane.showMessageDialog(a8,a8.getText()+"is winner!!!"); 
           set();
        }
        }
        else if(e.getSource()==a9)
        {
        if(a9.getText().equals(a1.getText())&&a9.getText().equals(a5.getText())||a9.getText().equals(a3.getText())&&a9.getText().equals(a6.getText())||a9.getText().equals(a7.getText())&&a9.getText().equals(a8.getText()))
        {
            JOptionPane.showMessageDialog(a9,a9.getText()+"is winner!!!"); 
            set();
        }
        }
        if(i==9)
        {
            System.out.println(i);
            JOptionPane.showMessageDialog(a1, "no one is winner!!!");
            set();
        }
    }
    
    
    public static void main(String[] args)
    {
        titacto ob=new titacto();
        
    }
    
    
}
