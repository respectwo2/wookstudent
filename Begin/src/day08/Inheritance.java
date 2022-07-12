package day08;
/*상속성 : Inheritance
 * 부모 클래스
 * 
 * 자식 클래스 extends
 * => 부모클래스가 가진 멤버변수,메소드를 자식클래스에서 그대로 물려받아 쓸수잇다
 * 상속은 is a 관계가 성립해야함
 * (자바는 1개의 클래스만 상속받을수 있음)
 * 
 */
public class Inheritance {

	public static void main(String[] args) {
		Human h1=new Human("홍길동",177);
		
		//h1의 정보 출력 => getInfo();
		String s=h1.getInfo();
		System.out.println(s);
		
		//슈퍼맨 객체 생성해서, 이름, 키 , 초능력 값 할ㄷ아 하고
		//정보출력하기 => getInfo();
		Superman s1=new Superman();
		s1.name="김슈퍼";
		s1.height=180;
		s1.power=500;	
		
		System.out.println(s1.getInfo());
		
		//아쿠아맨 객체생성 이름,키,초능력 값 할당
		Aquaman a1=new Aquaman();
		a1.name="고등어";
		a1.height=140;
		a1.speed=87.123;
		
		System.out.println(a1.getInfo());
		System.out.println("********************");
		
		//슈퍼맨 객체 1개 더 생성 이름,키,초능력 주고
		//제목을 가진 슈퍼맨 정보 출력하기
		System.out.println(s1.getInfo("--슈퍼맨의 정보---"));
		//제목을 가진 슈퍼맨 정보 출력하기 => 초능력을 100충전해서 출력하기
		s1.getInfo("--슈퍼맨 파워 업--", 100);
		
		Superman s2=new Superman("울트라 슈퍼맨",166,2000);
		s2.getInfo("--슈퍼맨 파워 다운--", -500);
	}

}
