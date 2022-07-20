package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 퐁씨 성을 가진 사람들이 이용할 수 있는 애플리케이션
 * 작성자: 박성욱
 * 작성일: 220719
 * 버전: 1.1
 */
public class PongApp extends JFrame {

	JPanel p= new JPanel();
	JPanel pN= new JPanel();
	JTextArea ta;
	
	JLabel lb;
	JTextField tfName;
	JButton btAdd, btSave;
	
	public PongApp() {
		super ("::PongApp::");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		
		p.add(pN,"North");
		pN.setBackground(Color.cyan);
		
		p.add(new JScrollPane(ta=new JTextArea()),"Center");
	
		lb=new JLabel("이 름: ");
		tfName=new JTextField(20);
		btAdd=new JButton("등 록");
		btSave=new JButton("저 장");
		
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btSave);
		//리스터 부착-----
		MyEventHandler handler = new MyEventHandler();
		btAdd.addActionListener(handler);
		btSave.addActionListener(handler);
		tfName.addActionListener(handler); //입력후 엔터치면 ActionEvent발생함
	
		setSize(500,700);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-------------------------
	/**
	 *  버튼에 대한 이벤트를 처리하는 클래스
	 */
	class MyEventHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==btAdd||obj==tfName ) {
				//setTitle("add");
				//1) tfName에 입력한 값 얻어오기
				//public String getText()
				String name=tfName.getText();
					System.out.println(name);
					name=name.trim(); //앞 뒤 공백 제거해서 재할당
				//2) 입력한 값의 '성'을 추출하여 '퐁'씨면 "xxx님 환영합니다" 타이틀에 출력하기
				try{
						char fname=name.charAt(0);
					if(fname=='퐁') {
						setTitle(name+"님 환영합니다");
						//ta.setText(name);
						ta.append(name+"\n");
						
					}else if(fname=='콩') {	
						//사용자 정의 예외객체를 발생시킨다. throw new 예외객체();
						
						throw new NotSupportedNameException("콩씨는 등록할 수 없습니다");
					}else {
						throw new NotSupportedNameException("퐁씨가 아니면 성씨분들은 이용에 제한이 있습니다");
	
					}
				}catch (NotSupportedNameException ex) {
						String msg=ex.getMessage();
						setTitle(msg);
						//메시지박스 띄우기
						JOptionPane.showMessageDialog(p, msg);
				}finally {
					tfName.setText("");
					tfName.requestFocus(); //입력 포커스 주기
				}
				//3) tfName에서 얻어온 값을 ta에 붙이기
				//public void setText(String t)
			}else if(obj==btSave) {
				//setTitle("save");
			}
		}
	}


	public static void main(String[] args) {
		new PongApp();
	}

}