package day12;
/* 매개변수 2개를 받아서 두 수중 큰 수를 반환하는 함수를 람다식으로 구현해보자.
 * [1] 람다식을 구현하기 위해서는 먼저 인터페시으슬 만들어야함.
 * [2] 인터페이스에 람다식을 구현할 메소드 선언
 * 
 */
interface MyNum{
	int getMax(int a,int b);
	//추상메소드는 하나만 선언해야함
}///////////////


public class LambdaTest1 {

	public static void main(String[] args) {
		MyNum m1=(int x,int y)->{
			if(x>=y) {
				return x;
			}else {
				return y;
			}
			
		};
		System.out.println(m1.getMax(55, 77));
		System.out.println(m1.getMax(-2, 0));
		
		MyNum m2=(a,b)-> (a>=b)? a: b;
		System.out.println(m2.getMax(71, 90));
	}

}
