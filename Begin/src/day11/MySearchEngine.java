	package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MySearchEngine extends JFrame {

	JPanel p=new JPanel();
	JButton j1 = new JButton("Yahoo");
	JButton j2 = new JButton("Daum");
	JButton j3 = new JButton("Naver");
	JButton j4 = new JButton("Google");
	//JButton j1= new JButton();
	public MySearchEngine() {
		
		super ("::MySearchEngine::");
		add(p);
		p.add(j1);
		p.add(j2);
		p.add(j3);
		p.add(j4);
		
		MyEventHandler hd=new MyEventHandler();
		j1.addActionListener(hd);
		j2.addActionListener(hd);
		j3.addActionListener(hd);
		j4.addActionListener(hd);

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}	class MyEventHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)	{
			
			Object obj=e.getSource();
			if(obj==j1) {
			p.setBackground(Color.red);
			//이벤트 처리 코드
		}else if(obj==j2) {
			p.setForeground(Color.green);			
		}else if(obj==j3) {
			p.setForeground(Color.blue);
		}
}

	public static void main(String[] args) {
		MySearchEngine my=new MySearchEngine();
		my.setSize(500,500);
		my.setVisible(true);
		
	}
	}
}

