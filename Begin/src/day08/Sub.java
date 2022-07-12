package day08;
//자식클래스 sub class,derived class
public class Sub extends Super{
	int b=30;
	int c=40;
	
	@Override //annotation 오버라이드할떄는 이걸 붙여주는게 좋음 에러를 알려준다
	public void func() {
		System.out.println("func() @@@@");
	}
	//overload
	public String func(int a) {
		return "func() : a="+a;
	}
	
}
