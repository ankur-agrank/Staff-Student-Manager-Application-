
package jss.university;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddTeacher extends JFrame implements ActionListener{
    
    JTextField tname,stufname,empid,add,phone,mail,x,xii,ug;
    JDateChooser dcdob;
    JComboBox cbbox,cbbranch;
    JButton submit,cancel;
    
    AddTeacher(){
    
       
        setLayout(null);
        
        JLabel heading = new JLabel("Add New Teacher Details");
        heading.setBounds(200, 20, 400, 50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 50, 20);
        lblname.setFont(new Font("serif",Font.BOLD,20));
        add(lblname);
        
        tname = new JTextField();
        tname.setBounds(130, 150, 150, 20);
        add(tname);
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(350, 150, 150, 20);
        lblfname.setFont(new Font("serif",Font.BOLD,20));
        add(lblfname);
        
        stufname = new JTextField();
        stufname.setBounds(520, 150, 150, 20);
        add(stufname);
        
        JLabel lblroll = new JLabel("Employee ID");
        lblroll.setBounds(50, 200, 100, 17);
        lblroll.setFont(new Font("serif",Font.BOLD,17));
        add(lblroll);
        
        empid = new JTextField();
        empid.setBounds(170,200, 110, 20);
        add(empid);
        
        JLabel lbldb = new JLabel("Date Of Birth");
        lbldb.setBounds(350, 200, 150, 20);
        lbldb.setFont(new Font("serif",Font.BOLD,20));
        add(lbldb);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(520, 200,150,25);
        add(dcdob);
        
        JLabel lbladd = new JLabel("Address");
        lbladd.setBounds(50, 250, 100, 20);
        lbladd.setFont(new Font("serif",Font.BOLD,20));
        add(lbladd);
        
        add = new JTextField();
        add.setBounds(130, 250, 150, 20);
        add(add);
        
        JLabel lblphone = new JLabel("Mobile Number");
        lblphone.setBounds(350, 250, 150, 20);
        lblphone.setFont(new Font("serif",Font.BOLD,20));
        add(lblphone);
        
        phone = new JTextField();
        phone.setBounds(520, 250, 150, 20);
        add(phone);
        
        JLabel lblmail = new JLabel("E-Mail");
        lblmail.setBounds(50, 300, 100, 20);
        lblmail.setFont(new Font("serif",Font.BOLD,20));
        add(lblmail);
        
        mail = new JTextField();
        mail.setBounds(130, 300, 150, 20);
        add(mail);
        
        JLabel lblug = new JLabel("UG Marks (%)");
        lblug.setBounds(350, 300, 150, 20);
        lblug.setFont(new Font("serif",Font.BOLD,20));
        add(lblug);
        
        ug = new JTextField();
        ug.setBounds(520, 300, 150, 20);
        add(ug);
        
        JLabel lblxii = new JLabel("XII Marks (%)");
        lblxii.setBounds(50, 350, 150, 18);
        lblxii.setFont(new Font("serif",Font.BOLD,18));
        add(lblxii);
        
        xii = new JTextField();
        xii.setBounds(180, 350, 100, 20);
        add(xii);
        
        JLabel lblx = new JLabel("X Marks(%)");
        lblx.setBounds(350, 350, 150, 20);
        lblx.setFont(new Font("serif",Font.BOLD,20));
        add(lblx);
        
        x = new JTextField();
        x.setBounds(520, 350, 150, 20);
        add(x);
        
        JLabel lblcourse = new JLabel("Department");
        lblcourse.setBounds(50, 400, 120, 20);
        lblcourse.setFont(new Font("serif",Font.BOLD,20));
        add(lblcourse);
        
        String course[] = {"B.Tech","M.C.A.","M.B.A.","M.Tech","B.Pharma"};
        
        cbbox = new JComboBox(course);
        cbbox.setBounds(170, 400, 110, 20);
        cbbox.setBackground(Color.WHITE);
        add(cbbox);
        
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setBounds(350, 400, 150, 20);
        lblbranch.setFont(new Font("serif",Font.BOLD,20));
        add(lblbranch);
        
        String branch[] = {"CSE","AI & ML","DS","IT","EEE","ECE","ME","N/A"};
        
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(520, 400, 150, 20);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        submit = new JButton("Add  ->");
        submit.setBounds(130, 480, 150, 30);
        submit.setBackground(Color.GREEN);
        submit.setFont(new Font("Tahoma",Font.BOLD,20));
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel  X");
        cancel.setBounds(350, 480, 150, 30);
        cancel.setBackground(Color.RED);
        cancel.setFont(new Font("Tahoma",Font.BOLD,20));
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/teacher.png"));
        Image i2 =i1.getImage().getScaledInstance(370, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(700, 30, 370, 500);
        add(image);
        
        setSize(1100,600);
        setLocation(100,50);
        
        
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource()== submit){
            
            String name = tname.getText();
            String fname = stufname.getText();
            String emp = empid.getText();
            String address = add.getText();
            String phoneno = phone.getText();
            String email = mail.getText();
            String ugmarks = ug.getText();
            String xiimarks = xii.getText();
            String xmarks = x.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String course = (String)cbbox.getSelectedItem();
            String branch = (String)cbbranch.getSelectedItem();
            
            try{
                String query = "insert into teacher values('"+name+"','"+fname+"','"+emp+"','"+address+"','"+phoneno+"','"+email+"','"+ugmarks+"','"+xiimarks+"','"+xmarks+"','"+dob+"','"+course+"','"+branch+"')";
                
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
            
        } else if(ae.getSource() == cancel){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
    
    new AddTeacher();
    
    }
    
    
}
