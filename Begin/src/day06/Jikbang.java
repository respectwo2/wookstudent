package day06;
//부동산 관련 앱
//객체: 집, 중개인, 매도자, 매수자, 임대인....
//추상화: 현실세계에 존재하는 객체를 프로그램 세계로 표현하는 것
//클래스명 : House
// 			속성(has a)관계 : 3가지 추출 
		//  기능(행위) : 얼마에 세를 놓다, 얼마에 매도하다....
//						xx에 위치하다...
public class Jikbang {

	public static void main(String[] args) {
		House h1=new House(); //객체 생성
		h1.room=2;
		h1.addr="부산시 해운대구";
		h1.owner="홍길동";
		
			House h2=new House(); 
		h2.room=2;
		h2.owner="김영란";
		h2.addr="부산시 동래구";
		
		
		h1.showInfo();
		h2.showInfo();
		
		String s1=h1.existAt(100); //반환타입이 있는애들은 이렇게 아무변수나 해서 받아줘야함
		String s2=h2.existAt(200);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//rent()메소드 호출해보기
		h1.rent("매매", 8000);
		
		h2.rent("전세", 5000);
		
	
	}

}
