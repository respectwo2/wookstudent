package day08;

public class Cafe {

	public static void main(String[] args) {
		//밀크커피
		CoffeeMachine cm=new CoffeeMachine();
		String s=cm.makeTea(1,2,3); //스트링 s를 사용해야됨
		System.out.println(s); 
		
		System.out.println(cm.makeTea(2,2,4));
		//설탕 커피 
		cm.makeTea(2, 1);
		//블랙 커피
		cm.makeTea(1);
		//크림 커피
		cm.makeTea(2,(short)3); //디폴트가 인트라 인트로 출력됨
		
		//유자차
		Yuja x=new Yuja(); //객체생성
		//x.yuja=3 XXXXXXXXXXXX
		x.setYuja(3);
		x.setSugar(3);
		cm.makeTea(x);
	}
}