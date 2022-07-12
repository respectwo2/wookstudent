package day07;

public class Person {

	String name;
	int age;
	//생성자(Constructor) : 객체를 생성할 때 호출되는 메소드의 일종
	/* -규칙
	 * <1> 생성이름은 클래스이름과 동일하게
	 * <2> 반환타입은 명시하지 않음.
	 * <3> 역할: 멤버변수 값을 초기화하는 일을 주로 함
	 * public 생성자명() {
	 * 
	 * 	
	 * 
	 */
	public Person() { //기본생성자- default constructor //반환타입 명시안해도됨 Void 기재x
			name="아무개";
			age=1;
			
	}
	public Person(int age) {
		this.age=age;
		name="어쩌고";
	}
	
	public Person(String name) {//인자 생성자 - constructor using fields
		this.name=name;
		age=10;
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	
	
	//////////////////////////
	
	
	
}
