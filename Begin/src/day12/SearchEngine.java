package day12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyJPanel extends JPanel{
	
	//컨테이너의 바깥여백을 주는 메서드를 오버라이딩하자
	@Override
	public Insets getInsets() {
		Insets in=new Insets(10,10,10,10);//시계 반대방향 순
		return in; //밑에 Jpanel을 MyJpanel로 변경
	}
	
}//===============================


public class SearchEngine extends JFrame {
	JPanel p = new MyJPanel(); //기본이 FlowLayout => GridLayout변경
	JButton[] bt=new JButton[4];
	String [] str= {"Naver","Google","Yahoo","Daum"};
	
	
	
	public SearchEngine() {
		super ("::SearchEngine::");
		add(p,"Center");
		//GridLAyout(int row(행), int col(열), int hgap(수직간격), int vgap(수평간격)
		p.setLayout(new GridLayout(2,2,10,10)); // 2행 2열로 하겠다는뜻/ 붙이기전에 해야댐
		
		for(int i=0;i<bt.length;i++) {
			bt[i] = new JButton(str[i]);
			p.add(bt[i]);
		}
		//버튼에 대한 이벤트 처리를 anonymous class로 해보기
		bt[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[0].setBackground(Color.green);
				setTitle(str[0]+"버튼을 눌렀군요");
			}
			
		} );
		//bt[1] => 노란색
		bt[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[1].setBackground(Color.yellow);
				setTitle(str[1]+"버튼을 눌렀군요");
			}
		});
		bt[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				Object obj=e.getSource();//이벤트가 발생된 객체=> bt[2]
				String cmd=e.getActionCommand();//이벤트소스의 라벨문자열을 반환한다.
				setTitle(cmd);
				((JButton)obj).setBackground(Color.pink);
			}
		});
		bt[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				Object obj=e.getSource();//이벤트가 발생된 객체=> bt[2]
				String cmd=e.getActionCommand();//이벤트소스의 라벨문자열을 반환한다.
				setTitle(cmd);
				((JButton)obj).setBackground(Color.magenta);
			}
		});
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//---------------------------

	public static void main(String[] args) {
		SearchEngine my=new SearchEngine();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
