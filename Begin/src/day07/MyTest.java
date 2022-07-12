package day07;

public class MyTest {

	public static void main(String[] args) {
		// MyDemo클래스의 변수x, y값 출력하기
		
		System.out.println("MyDemo.y: "+MyDemo.y);
		
	MyDemo md=new MyDemo(); //////// static없으니까 객체 생성해서 해야됨!!!!!
	System.out.println("md.x: "+md.x);
	

	//MyDemo에 foo(), bar() 메소드 호출하기
	
	MyDemo.foo();   ////static이니까 mydemo 붙여줘야된다
	md.bar();      ////객체 생성한놈으로 불러서 오면댐!!

	//MyDemo의 star(), snail() 메소드 호출해서 결과 출력하기
	
	
	String s=MyDemo.snail();
	System.out.println(s);
	
	
	String s2=md.star(30);
	System.out.println(s2);
	System.out.println(md.star(20));
	
	

	}

}
