package day10;
import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame{

	JButton bt1 = new JButton("Login");
	JButton bt2 = new JButton("Join");
	JButton bt3 = new JButton("Home");
	JButton bt4 = new JButton("Exit");

	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	
	
	
	public MyApp() {
		super("::MyApp::");
		
		p1.setSize(500,600);
		p2.setSize(400,600);	
		p1.setBackground(Color.black);
		p2.setBackground(Color.white);
		
		this.add(p1);
		this.add(p2);
		p1.setBounds(15, 15, 550, 550);
		p1.setVisible(true);

		
	//	p3.setSize(500,100);
	//	p3.setBackground(Color.GRAY);
	//	this.add(p3);
		p3.setBounds(0, 0, 100, 100);
		p3.setVisible(true);
		
      /*  JFrame jf = new JFrame();
        
        jf.add(p1);
        p1.setSize(300, 300);
        */

        
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

}

		
	
	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(600,600);
		my.setVisible(true);

	}

}
