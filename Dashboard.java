
package jss.university;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    Dashboard() {
        setSize(1280,680);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpeg"));
        Image i2 =i1.getImage().getScaledInstance(1280, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        //New Information button
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.MAGENTA);
        mb.add(newInformation);
        
        JMenuItem teacherInfo = new JMenuItem("New Teacher Information");
        teacherInfo.setBackground(Color.LIGHT_GRAY);
        teacherInfo.setForeground(Color.BLUE);
        teacherInfo.addActionListener(this);
        newInformation.add(teacherInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.setForeground(Color.BLUE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //Detail button
        JMenu detail = new JMenu("View Detail");
        detail.setForeground(Color.RED);
        mb.add(detail);
        
        JMenuItem teacherDetail = new JMenuItem("View Teacher Detail");
        teacherDetail.setBackground(Color.LIGHT_GRAY);
        teacherDetail.setForeground(Color.BLUE);
        detail.add(teacherDetail);
        
        JMenuItem studentDetail = new JMenuItem("View Student Detail");
        studentDetail.setBackground(Color.WHITE);
        studentDetail.setForeground(Color.BLUE);
        detail.add(studentDetail);
        
        //leave button
        JMenu leave = new JMenu("Leave Application");
        leave.setForeground(Color.MAGENTA);
        mb.add(leave);
        
        JMenuItem  teacherLeave = new JMenuItem("Teacher Leave");
        teacherLeave.setBackground(Color.LIGHT_GRAY);
        teacherLeave.setForeground(Color.BLUE);
        leave.add(teacherLeave);
        
        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.setForeground(Color.BLUE);
        leave.add(studentLeave);
        
        //Leave Details
        JMenu leaveDetail = new JMenu("Leave Details");
        leaveDetail.setForeground(Color.RED);
        mb.add(leaveDetail);
        
        JMenuItem  teacherLeaveDetail = new JMenuItem("Teacher Leave Details");
        teacherLeaveDetail.setBackground(Color.LIGHT_GRAY);
        teacherLeaveDetail.setForeground(Color.BLUE);
        leaveDetail.add(teacherLeaveDetail);
        
        JMenuItem studentLeaveDetail = new JMenuItem("Student Leave Details");
        studentLeaveDetail.setBackground(Color.WHITE);
        studentLeaveDetail.setForeground(Color.BLUE);
        leaveDetail.add(studentLeaveDetail);
        
        //exams
        JMenu exams = new JMenu("Examination Details");
        exams.setForeground(Color.magenta);
        mb.add(exams);
        
        JMenuItem  studentExam = new JMenuItem("Students Examination Result");
        studentExam.setBackground(Color.LIGHT_GRAY);
        studentExam.setForeground(Color.BLUE);
        exams.add(studentExam);
        
        JMenuItem marks = new JMenuItem("Enter Student Score");
        marks.setBackground(Color.WHITE);
        marks.setForeground(Color.BLUE);
        exams.add(marks);
        
        //Udate Information
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        JMenuItem  updateStudentInfo = new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.LIGHT_GRAY);
        updateStudentInfo.setForeground(Color.BLUE);
        updateInfo.add(updateStudentInfo);
        
        JMenuItem updateTeacherInfo = new JMenuItem("Update Teacher Details");
        updateTeacherInfo.setBackground(Color.WHITE);
        updateTeacherInfo.setForeground(Color.BLUE);
        updateInfo.add(updateTeacherInfo);
        
        //Fees
        JMenu fees = new JMenu("Fee Information");
        exams.setForeground(Color.MAGENTA);
        mb.add(fees);
        
        JMenuItem  feeSubmission = new JMenuItem("Fee Submission");
        feeSubmission.setBackground(Color.LIGHT_GRAY);
        feeSubmission.setForeground(Color.BLUE);
        fees.add(feeSubmission);
        
        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.setForeground(Color.BLUE);
        fees.add(feeStructure);
        
        //Academics
        JMenu academics = new JMenu("Academic Detail");
        exams.setForeground(Color.RED);
        mb.add(academics);
        
        JMenuItem  syllabus = new JMenuItem("Syllabus Detail");
        syllabus.setBackground(Color.LIGHT_GRAY);
        syllabus.setForeground(Color.BLUE);
        academics.add(syllabus);
        
        JMenuItem tt = new JMenuItem("Time Table");
        tt.setBackground(Color.WHITE);
        tt.setForeground(Color.BLUE);
        academics.add(tt);
        
        JMenuItem py = new JMenuItem("Previous Year Paper");
        py.setBackground(Color.LIGHT_GRAY);
        py.setForeground(Color.BLUE);
        academics.add(py);

        //Utility
        JMenu utility = new JMenu("Utilities");
        utility.setForeground(Color.MAGENTA);
        mb.add(utility);
        
        JMenuItem  calculator = new JMenuItem("Calculator");
        calculator.setBackground(Color.LIGHT_GRAY);
        calculator.setForeground(Color.BLUE);
        calculator.addActionListener(this);
        utility.add(calculator);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.setForeground(Color.BLUE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        //exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.MAGENTA);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.black);
        ex.setForeground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        JMenuItem logout = new JMenuItem("Logout");
        logout.setBackground(Color.WHITE);
        logout.setForeground(Color.BLACK);
        logout.addActionListener(this);
        exit.add(logout);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        if(msg.equals("Exit")){
            setVisible(false);
        }
        else if(msg.equals("Logout")){
            setVisible(false);
            new Login();
        }
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            } catch(Exception e){
            
            }
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            } catch(Exception e){
            
            }
        }
        else if(msg.equals("New Student Information")){
            new AddStudent();
        
        }
        else if(msg.equals("New Teacher Information")){
            new AddTeacher();
        }
    }
    
    public static void main(String [] args){
        Dashboard h = new Dashboard();
    }
}
