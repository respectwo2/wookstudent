package day08;

public class Polymorphism2 {

	public static void main(String[] args) {
		System.out.println("1.---------------");
		Super sp=new Super();
		System.out.println("sp.a="+sp.a);
		System.out.println("sp.b="+sp.b);
		sp.func();
		
		System.out.println("2.---------------");
		Sub sb=new Sub();
		System.out.println("sb.a="+sb.a);
		System.out.println("sb.b="+sb.b);
		System.out.println("sb.c="+sb.c);
		sb.func();
		System.out.println(sb.func(100));
		//별표!!!! 밑에 예제가 가장 중요함!!
		System.out.println("3.----------------");
		Super ss=new Sub();
		System.out.println("ss.a="+ss.a);
		System.out.println("ss.b="+ss.b);
		//System.out.println("ss.c="+ss.c); (접근불가 why?? -> c는 자식이 고유하게 선언한 변수라서!!)
		ss.func();
		//System.out.println(ss.func(200));
		

	}

}
