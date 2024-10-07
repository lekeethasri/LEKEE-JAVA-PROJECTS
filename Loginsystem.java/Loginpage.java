package Loginsystem.java;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginpage implements ActionListener{
    JFrame frame=new JFrame();
    JButton button=new JButton("Login");
    JButton resetbutton=new JButton("Reset");
    JTextField userid=new JTextField();
    JPasswordField userpass=new JPasswordField();
    JLabel useridl=new JLabel("userid:");
    JLabel userpassl=new JLabel("userpassword:");
    JLabel msgl=new JLabel();
    HashMap<String,String> loginhm=new HashMap<>();
    Loginpage(HashMap<String,String> lhm){
           
    }
    
}
