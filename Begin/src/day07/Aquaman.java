package day07;

public class Aquaman {
		String name;
		int height;
		double speed;
		/*생성자를 구성하지 않으면 컴파일러는 기본적으로 디폴트 생성자를 제공.
		 * BUT, 한개라도 생성자를 구성하게되면, 제공되던 디폴트 생성자는 삭제됨
		 * ==> 가능하면 기본 생성자를 구성한 뒤에, 다른 생성자를 구성!!!
		 */
		
		public Aquaman () {
			name="수중인간";
			height=155;
			speed=56.78;
		}
		
		
	/*	public Aquaman(String n, int h, double s) {
			name=n;
			height=h;
			speed=s;
		}
		*/
		
		public String getInfo() {
			String info="이름: "+name+"\n키: "+height+"\n스피드: "+speed;
			return info;
	
}
}
