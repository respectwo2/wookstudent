package day09;

class Super{
	void foo() {
		System.out.println("Super's foo()");
	}
}/////////////////////////
//final + class : 다른 클래스에서 상속받지 못하도록
final class Sub extends Super{
	@Override
	protected void foo() {
		System.out.println("Sub's foo()");
	}
	
	
}//////////////////////
//final인 sub를 상속받지 못함
public class FinalTest1 //extends Sub{
{
	public static void main(String[] args) {
		

	}

}
