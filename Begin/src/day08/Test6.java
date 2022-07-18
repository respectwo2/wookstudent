package day08;

public class Test6 {
public int getVal() {
	return 5;
}
}
class B extends Test6 {
	public int getVal() {
		return 10;
	}
}
public class Text5 {
	public static void main(String args[]) {
		B b = new B();
		Test6 a= (Test6)b;
		int x = a.getVal();
		System.out.println(x);
	}
}
