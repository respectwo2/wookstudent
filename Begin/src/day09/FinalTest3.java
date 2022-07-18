package day09;
//final + 변수 : 값 할당을 할 수 없게 함
// 				public static final을 함께 사용한다
class MyFinal{
	final public static int NONE=1;
						int x=2;
}



public class FinalTest3 {

	public static void main(String[] args) {
		//MyFinal의 x, NONE값의 변수 출력하세요
		System.out.println(MyFinal.NONE);
		
		
		MyFinal my=new MyFinal();
		System.out.println(my.x);
		
		my.x=20;
		System.out.println(my.x);
		//MyFinal.NONE =10; //final 변수는 값을 변경 못함
	}

}///////////////////////////////////
