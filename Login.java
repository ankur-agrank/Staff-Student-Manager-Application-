
package jss.university;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,cancel;
    JTextField usname,uspass;
    //JPasswordField uspass;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel uname = new JLabel("USERNAME");
        uname.setBounds(100, 100, 100, 20);
        add(uname);
        usname = new JTextField();
        usname.setBounds(220, 100, 250, 20);
        add(usname);
        
        JLabel upass = new JLabel("PASSWORD");
        upass.setBounds(100, 150, 100, 20);
        add(upass);
        uspass = new JPasswordField();
        uspass.setBounds(220, 150, 250, 20);
        add(uspass);
        
        login = new JButton("Login");
        login.setBounds(220,200,100,30);
        login.setBackground(Color.LIGHT_GRAY);
        login.setFont(new Font("Tahoma",Font.CENTER_BASELINE,17));
        login.addActionListener(this);
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(370,200,100,30);
        cancel.setBackground(Color.LIGHT_GRAY);
        cancel.setFont(new Font("Tahoma",Font.CENTER_BASELINE,17));
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 =i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(490, 50, 200, 200);
        add(image);
        
        setSize(750,350);
        setLocation(250,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== login){
            String username = usname.getText();
            String password = uspass.getText();
            
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Dashboard();
                } else {
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password !");
                    setVisible(false);
                    new Login();
                }
                c.s.close();
            } catch(Exception e){
                e.printStackTrace();
            }
            
        } else if(ae.getSource()== cancel){
            setVisible(false);
        }
    }
    public static void main(String[] args){
    
        new Login();
    }
    
}
