package jss.university;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame implements Runnable {
    
    Thread t;
    Home(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1000, 560, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        t = new Thread(this);
        t.start();
        
        setVisible(true);
        
        for(int i=1;i<=150;i++){
        setLocation(480-(2*i),200-i);
        setSize(6*i,4*i);
        try {
            Thread.sleep(10);
            } catch(Exception e){}
        }
    }
    public void run(){
        try{
            Thread.sleep(5000);
            setVisible(false);
            
            //next frame
            new Login();
        } catch (Exception e){}
    }
    
    public static void main(String[] args){
        new Home();
    }
}
