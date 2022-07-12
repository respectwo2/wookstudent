package day07;

public class MyDemo {
	int x=50;
	static int y=70; //static이 있으면 객체 만들필요 xxx, BUT!!! class 이름 붙여야됨
	//클래스 메소드
	public static void foo() {
		System.out.println("foo()...");
	}
	public void bar() {
		System.out.println("bar()...");
	}
		
	
	
	public String star(int n) {
		String a="";
		for(int i=0;i<n;i++)	{
			a+="★";
		}
		return a;
	}//--------------------
	
	public static String snail() {
		return "@@@@";
		
		
		
		
	}
	
	
}
