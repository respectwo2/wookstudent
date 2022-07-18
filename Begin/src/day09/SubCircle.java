package day09;

public class SubCircle extends Circle {
		@Override
		public void area(int x, int y) {}
		//빈블럭으로라도 재정의 해야한다
		
		//오버로딩
		public void area(int r)	{
			System.out.println("원의 면적: "+(Circle.PI*r*r));
		}
}

