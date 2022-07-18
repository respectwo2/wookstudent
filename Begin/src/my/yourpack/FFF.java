package my.yourpack;

import my.mypack.*; //가져다 쓰겠습니다

public class FFF {

	public static void main(String[] args) {
		//AAA의 funcA()메소드 호출
		AAA x = new AAA(); // AAA: public 클래스
		x.funcA();
		//BBB의 funcB()메소드 호출
		BBB y = new BBB(); // BBB : 생략형 접근지정자를 가짐(not public)
		y.funcB();
	}

}
