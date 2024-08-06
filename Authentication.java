
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.concurrent.Flow;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Authentication extends JFrame{
    
    private JPanel headingPnl;
    private JPanel mainPnl;
    private JPanel btnPnl;
    private JPanel idPnl;
    private JPanel passwordPnl;
//    private JPanel formPnl;
    
    private JLabel mainHeadingLb;
    private JLabel subHeadingLb;
    
    private JTextField idNumTxtFild;
    
    private JPasswordField passwordFild;
    
    private JButton loginBtn;

    public Authentication() {
        
        setTitle("Login");
        setLayout(new BorderLayout());
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        headingPnl = new JPanel(new GridLayout(1,1,1,1));
        mainPnl = new JPanel(new GridLayout(2, 1, 10, 10));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        mainHeadingLb = new JLabel("Welcome back");
        mainHeadingLb.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        subHeadingLb = new JLabel("Your jouney starts here.");
        subHeadingLb.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        
        idNumTxtFild = new JTextField("ID number", 20);
        
        passwordFild = new JPasswordField("Password", 20);
        
        loginBtn = new JButton("Login");
        loginBtn.setBackground(Color.red);
        loginBtn.setForeground(Color.white);
        loginBtn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        
        
        btnPnl.add(loginBtn);
        headingPnl.add(mainHeadingLb);
        headingPnl.add(subHeadingLb);
        mainPnl.add(idNumTxtFild);
        mainPnl.add(passwordFild);
        
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        add(btnPnl, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    
    
}
