package day07;

public class ConstructorTest {

	public static void main(String[] args) {
		Person p1=new Person();
		
		System.out.println("p1.name: "+p1.name);
		System.out.println("p1.age: "+p1.age);
		
		//person객체 1개 더 생성하되 인자생성 호출, 생성 이름 출력

		Person p2=new Person("정성호");
		
		System.out.println("p2.name: "+p2.name);
		System.out.println("p2.age: "+p2.age);
		
		Person p3=new Person("이순신",22);
		System.out.println("p3:name: "+p3.name);
		System.out.println("p3:age: "+p3.age);
		
		Person p4=new Person(27,"강감찬");
		System.out.println("p4.name: "+p4.name);
		System.out.println("p4.age: "+p4.age);
		
		
	}
/*
 * 오버로딩이란? - 동일한 메소드 이름을 여러개 구성하는 것(다중정의, 중복정의)
 * 			 - 매개변수의 자료형이 다르거나, 갯수가 다르거나, 순서를 다르게 구성해야한다.
 * 		     - 반환타입은 달라도 되고, 같아도 됨.(신경 x)
 */
	

}
