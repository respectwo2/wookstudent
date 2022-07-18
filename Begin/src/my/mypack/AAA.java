package my.mypack;
//패키지 선언문 : 제일 첫번째 문장에 와야됨
//패키지명과 디렉토리명은 대소문자까지 같아야한다.

public class AAA {
	
	public static void main(String[] args) {
		BBB b = new BBB();
		b.funcB();
	
		AAA a = new AAA();
		a.funcA();
		
	}
	
	public void funcA() {
		System.out.println("AAA");
	}
}
class BBB{
	
	public void funcB() {
		System.out.println("BBB");
	
	}
}



