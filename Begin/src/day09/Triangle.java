package day09;
//직삼각형 class (가로x세로)/2
//shape 추상클래스를 상속받아서 오류없게 메소드 재정의
public class Triangle extends Shape{
	
	@Override
	public void area(int x,int y) {
			int m = (x*y)/2;
			System.out.println("직삼각형 면적: "+m);	
	}

}
