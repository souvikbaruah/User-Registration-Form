package jecForm;

import java.awt.*;
import javax.swing.*;





import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import javax.swing.border.Border;

public class form1 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel mainPanel,subPanel0,subPanel1,subPanel2;
    //private JPanel panel2;
    private JTextField rollno;
    private JTextField name;
    private JTextField dob;
    private JComboBox stream;
    private JComboBox branch;
    //private JTextField sem;
    private JTextField fname;
    private JTextField mname;
    private JTextArea add;
    private JTextField contact;
    //ButtonGroup G = new ButtonGroup();
    private JRadioButton btnmale,btnfemale;
    private JButton btnsubmit;
    private JButton btnreset;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    form1 frame = new form1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    
    public form1() {
      setTitle("Registration Form");
      setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Souvik\\Downloads\\JEC_logo.jpg")); //setting jec logo to the frame
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(450, 10, 650, 1000);
      setResizable(false);
       
      mainPanel = new JPanel(); // main panel
      mainPanel.setLayout(null);
      mainPanel.setBackground(Color.white);
 
      
      subPanel0 = new JPanel(); // sub-panel 0
      subPanel0.setLayout(null);
      JLabel head = new JLabel("ONLINE REGISTRATION FORM",SwingConstants.CENTER);
      head.setFont (head.getFont ().deriveFont (20.0f));
      head.setForeground(Color.red);
      head.setBounds(100,5,450,40);
      Border bh = BorderFactory.createLineBorder(Color.BLACK);
      subPanel0.setBorder(bh);
      subPanel0.add(head);
      subPanel0.setBackground(Color.yellow);
      subPanel0.setBounds(0,0,700,45);
      
      
      
      subPanel1 = new JPanel(); // sub-panel 1
      subPanel1.setLayout(null);
      JLabel head1 = new JLabel("Institutional Details",SwingConstants.CENTER);
      head1.setFont (head.getFont ().deriveFont (18.0f));
      head1.setForeground(Color.red);
      head1.setOpaque(true);
      head1.setBackground(Color.yellow);
      //head1.setPreferredSize(new Dimension(250, 30));
      head1.setBounds(200,10,250,30);
      Border border = BorderFactory.createLineBorder(Color.BLACK);
      head1.setBorder(border);
      subPanel1.add(head1);
      subPanel1.setBackground(new Color(80,130,183));
      subPanel1.setBounds(0,50,700,450);
      
      JLabel lblrollno = new JLabel("Roll no. ",SwingConstants.RIGHT);//rollno
      lblrollno.setFont (head.getFont ().deriveFont (14.0f));
      lblrollno.setOpaque(true);
      lblrollno.setBackground(Color.white);
      lblrollno.setBounds(70,55,100,30);
      Border br = BorderFactory.createLineBorder(Color.BLACK);
      lblrollno.setBorder(br);
      subPanel1.add(lblrollno);
      
      JLabel lblname = new JLabel("Name ",SwingConstants.RIGHT);//name
      lblname.setFont (head.getFont ().deriveFont (14.0f));
      lblname.setOpaque(true);
      lblname.setBackground(Color.white);
      lblname.setBounds(70,95,100,30);
      Border bn = BorderFactory.createLineBorder(Color.BLACK);
      lblname.setBorder(bn);
      subPanel1.add(lblname);
      
      JLabel lbldob = new JLabel("Date of Birth ",SwingConstants.RIGHT);//dob
      lbldob.setFont (head.getFont ().deriveFont (14.0f));
      lbldob.setOpaque(true);
      lbldob.setBackground(Color.white);
      lbldob.setBounds(70,135,100,30);
      Border bd = BorderFactory.createLineBorder(Color.BLACK);
      lbldob.setBorder(bd);
      subPanel1.add(lbldob);
      
      JLabel lblstream = new JLabel("Stream ",SwingConstants.RIGHT);//stream
      lblstream.setFont (head.getFont ().deriveFont (14.0f));
      lblstream.setOpaque(true);
      lblstream.setBackground(Color.white);
      lblstream.setBounds(70,175,100,30);
      Border bs = BorderFactory.createLineBorder(Color.BLACK);
      lblstream.setBorder(bs);
      subPanel1.add(lblstream);
      
      JLabel lblbr = new JLabel("Branch ",SwingConstants.RIGHT);//branch
      lblbr.setFont (head.getFont ().deriveFont (14.0f));
      lblbr.setOpaque(true);
      lblbr.setBackground(Color.white);
      lblbr.setBounds(70,215,100,30);
      Border bb = BorderFactory.createLineBorder(Color.BLACK);
      lblbr.setBorder(bb);
      subPanel1.add(lblbr);
      
      JLabel lblsem = new JLabel("Semester ",SwingConstants.RIGHT);//sem
      lblsem.setFont (head.getFont ().deriveFont (14.0f));
      lblsem.setOpaque(true);
      lblsem.setBackground(Color.white);
      lblsem.setBounds(70,255,100,30);
      Border bse = BorderFactory.createLineBorder(Color.BLACK);
      lblsem.setBorder(bse);
      subPanel1.add(lblsem);
      
      rollno=new JTextField();//roll textfield  
      rollno.setBounds(250,55,260,30); 
      rollno.setFont (head.getFont ().deriveFont (14.0f));
      rollno.setOpaque(true);
      rollno.setBackground(Color.white);
      Border brr = BorderFactory.createLineBorder(Color.BLACK);
      rollno.setBorder(brr);
      subPanel1.add(rollno);
      
      name=new JTextField();//name textfield  
      name.setBounds(250,95,260,30); 
      name.setFont (head.getFont ().deriveFont (14.0f));
      name.setOpaque(true);
      name.setBackground(Color.white);
      Border bnn = BorderFactory.createLineBorder(Color.BLACK);
      name.setBorder(bnn);
      subPanel1.add(name);
      
      dob=new JTextField();//dob textfield  
      dob.setBounds(250,135,260,30); 
      dob.setFont (head.getFont ().deriveFont (14.0f));
      dob.setOpaque(true);
      dob.setBackground(Color.white);
      Border bdd = BorderFactory.createLineBorder(Color.BLACK);
      dob.setBorder(bdd);
      subPanel1.add(dob);
      
      String s[]={"Science","Arts","Commerce"};  //stream combobox      
      stream=new JComboBox(s);    
      stream.setBounds(250,175,260,30); 
      stream.setFont (head.getFont ().deriveFont (14.0f));
      stream.setOpaque(true);
      stream.setBackground(Color.white);
      Border bss = BorderFactory.createLineBorder(Color.BLACK);
      stream.setBorder(bss);
      subPanel1.add(stream);
      
      String s2[]={"Computer Science & Engineering","Mechanical Engineering","Civil Engineering","Electrical Engineering","Instrumentation Engineering"}; //branch combobox    
      branch=new JComboBox(s2);    
      branch.setBounds(250,215,260,30); 
      branch.setFont (head.getFont ().deriveFont (14.0f));
      branch.setOpaque(true);
      branch.setBackground(Color.white);
      Border bbb = BorderFactory.createLineBorder(Color.BLACK);
      branch.setBorder(bbb);
      subPanel1.add(branch);
      
      DefaultListModel<String> l1 = new DefaultListModel<>(); //semester list 
      l1.addElement("I      Semester");  
      l1.addElement("II     Semester");  
      l1.addElement("III    Semester");  
      l1.addElement("IV    Semester"); 
      l1.addElement("V     Semester");  
      l1.addElement("VI    Semester");  
      l1.addElement("VII   Semester");  
      l1.addElement("VIII  Semester");
      JList<String> listsem = new JList<>(l1);
      listsem.setBounds(250,255,260,170); 
      listsem.setFont (head.getFont ().deriveFont (14.0f));
      listsem.setOpaque(true);
      listsem.setBackground(Color.white);
      Border bses = BorderFactory.createLineBorder(Color.BLACK);
      listsem.setBorder(bses);
      subPanel1.add(listsem);
      
      
      subPanel2 = new JPanel(); // sub-panel 2
      subPanel2.setLayout(null);
      JLabel head2 = new JLabel("Personal Details",SwingConstants.CENTER);
      head2.setFont (head.getFont ().deriveFont (18.0f));
      head2.setForeground(Color.red);
      head2.setOpaque(true);
      head2.setBackground(Color.yellow);
      //head2.setPreferredSize(new Dimension(250, 30));
      head2.setBounds(200,10,260,30);
      Border border2 = BorderFactory.createLineBorder(Color.BLACK);
      head2.setBorder(border2);
      subPanel2.add(head2);
      head2.setVisible(true);
      subPanel2.setBackground(new Color(80,130,183));
      subPanel2.setBounds(0,515,700,450);
      
      JLabel lblfname = new JLabel("Father's Name ",SwingConstants.RIGHT);//father's name
      lblfname.setFont (head.getFont ().deriveFont (14.0f));
      lblfname.setOpaque(true);
      lblfname.setBackground(Color.white);
      lblfname.setBounds(70,65,120,30);
      Border bf = BorderFactory.createLineBorder(Color.BLACK);
      lblfname.setBorder(bf);
      subPanel2.add(lblfname);
      
      JLabel lblmname = new JLabel("Mother's Name ",SwingConstants.RIGHT);//mother's name
      lblmname.setFont (head.getFont ().deriveFont (14.0f));
      lblmname.setOpaque(true);
      lblmname.setBackground(Color.white);
      lblmname.setBounds(70,110,120,30);
      Border bm = BorderFactory.createLineBorder(Color.BLACK);
      lblmname.setBorder(bm);
      subPanel2.add(lblmname);
      
      JLabel lbladd = new JLabel("Address ",SwingConstants.RIGHT);//address
      lbladd.setFont (head.getFont ().deriveFont (14.0f));
      lbladd.setOpaque(true);
      lbladd.setBackground(Color.white);
      lbladd.setBounds(70,155,120,30);
      Border ba = BorderFactory.createLineBorder(Color.BLACK);
      lbladd.setBorder(ba);
      subPanel2.add(lbladd);
      
      JLabel lblcon = new JLabel("Contact No. ",SwingConstants.RIGHT);//contact no.
      lblcon.setFont (head.getFont ().deriveFont (14.0f));
      lblcon.setOpaque(true);
      lblcon.setBackground(Color.white);
      lblcon.setBounds(70,260,120,30);
      Border bc = BorderFactory.createLineBorder(Color.BLACK);
      lblcon.setBorder(bc);
      subPanel2.add(lblcon);
      
      JLabel lblgen = new JLabel("Gender ",SwingConstants.RIGHT);//gender
      lblgen.setFont (head.getFont ().deriveFont (14.0f));
      lblgen.setOpaque(true);
      lblgen.setBackground(Color.white);
      lblgen.setBounds(70,305,120,32);
      Border bg = BorderFactory.createLineBorder(Color.BLACK);
      lblgen.setBorder(bg);
      subPanel2.add(lblgen);
      
      fname=new JTextField();//father's name textfield  
      fname.setBounds(250,65,260,30); 
      fname.setFont (head.getFont ().deriveFont (14.0f));
      fname.setOpaque(true);
      fname.setBackground(Color.white);
      Border bff = BorderFactory.createLineBorder(Color.BLACK);
      fname.setBorder(bff);
      subPanel2.add(fname);
      
      mname=new JTextField();//mother's name textfield  
      mname.setBounds(250,110,260,30); 
      mname.setFont (head.getFont ().deriveFont (14.0f));
      mname.setOpaque(true);
      mname.setBackground(Color.white);
      Border bmm = BorderFactory.createLineBorder(Color.BLACK);
      mname.setBorder(bmm);
      subPanel2.add(mname);
      
      add=new JTextArea();//address textarea 
      add.setBounds(250,155,260,90); 
      add.setFont (head.getFont ().deriveFont (14.0f));
      add.setOpaque(true);
      add.setBackground(Color.white);
      Border baa = BorderFactory.createLineBorder(Color.BLACK);
      add.setBorder(baa);
      subPanel2.add(add);
      
      contact=new JTextField();//contact no. textfield  
      contact.setBounds(250,260,260,30); 
      contact.setFont (head.getFont ().deriveFont (14.0f));
      contact.setOpaque(true);
      contact.setBackground(Color.white);
      Border bcc = BorderFactory.createLineBorder(Color.BLACK);
      contact.setBorder(bff);
      subPanel2.add(contact);
      
      JPanel p = new JPanel();//gender radio buttons
      p.setLayout(null);
      p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      p.setBounds(250,305,260,32);
      p.setOpaque(false);
      btnmale = new JRadioButton("Male");
      btnfemale = new JRadioButton("Female");
      btnmale.setOpaque(false);
      btnfemale.setOpaque(false);
      btnmale.setBounds(20,-5,100,40);
      btnfemale.setBounds(125,-5,100,40);
      btnmale.setFont (head.getFont ().deriveFont (14.0f));
      btnfemale.setFont (head.getFont ().deriveFont (14.0f));
      btnmale.setForeground(Color.white);
      btnfemale.setForeground(Color.white);
      p.add(btnmale);
      p.add(btnfemale);
      ButtonGroup group = new ButtonGroup();
      group.add(btnmale);
      group.add(btnfemale);
      subPanel2.add(p);
      
      btnsubmit=new JButton("Submit");
      btnsubmit.setBounds(130,370,130,30); 
      btnsubmit.setFont (head.getFont ().deriveFont (14.0f));
      btnsubmit.setOpaque(true);
      btnsubmit.setBackground(new Color(196,188,150));
      btnsubmit.setForeground(Color.white);
      Border bsub = BorderFactory.createLineBorder(Color.BLACK);
      btnsubmit.setBorder(bsub);
      subPanel2.add(btnsubmit);
      btnreset=new JButton("Reset");
      btnreset.setBounds(330,370,130,30); 
      btnreset.setFont (head.getFont ().deriveFont (14.0f));
      btnreset.setOpaque(true);
      btnreset.setBackground(new Color(196,188,150));
      btnreset.setForeground(Color.white);
      Border bres = BorderFactory.createLineBorder(Color.BLACK);
      btnreset.setBorder(bres);
      subPanel2.add(btnreset);
      
      btnsubmit.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  String g="";
              String r = rollno.getText();
              String n = name.getText();
              String d = dob.getText();
              String s = stream.getSelectedItem().toString();
              String b = branch.getSelectedItem().toString();
              String se = (String)listsem.getSelectedValue();
              String f = fname.getText();
              String m = mname.getText();
              String a = add.getText();
              String c = contact.getText();
              int len = c.length();
              if(btnmale.isSelected()){    
            	  g="Male";    
        	  }    
        	  if(btnfemale.isSelected()){    
            	  g="Female";    
        	  }    

              String msg = "" + n;
              msg += " \n";
              if (len != 10) {
                  JOptionPane.showMessageDialog(btnsubmit, "Enter a valid mobile number!");
              }
              else {

              try {
                  Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/form1", "root", "00012832");

                  String query = "INSERT INTO account values('" + r + "','" + n + "','" + d + "','" +
                      s + "','" + b + "','" + se + "','" + f + "','" + m + "','" + a + "','" + c + "','"  + g + "')";

                  Statement sta = connection.createStatement();
                  int x = sta.executeUpdate(query);
                  if (x == 0) {
                      JOptionPane.showMessageDialog(btnsubmit, "This alredy exists!");
                  } else {
                      JOptionPane.showMessageDialog(btnsubmit,
                          "Welcome, " + msg + "Your account is sucessfully created!");
                  }
                  connection.close();
              } catch (Exception exception) {
                  exception.printStackTrace();
              }
              }
          }
      });
      
      btnreset.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	 rollno.setText(""); 
        	 name.setText("");
        	 dob.setText("");
        	 fname.setText("");
        	 mname.setText("");
        	 add.setText("");
        	 contact.setText("");
        	 stream.setSelectedIndex(0);
        	 branch.setSelectedIndex(0);
        	 listsem.setSelectedIndex(0);
        	 //btnmale.setSelected(false);
        	 //btnfemale.setSelected(false);
        	 group.clearSelection();
             
          }
      });
      
      
      mainPanel.add(subPanel0);
      mainPanel.add(subPanel1);
      mainPanel.add(subPanel2);
      add(mainPanel);
      //setSize(400, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
    }
}
