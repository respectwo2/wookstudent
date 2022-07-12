package day08;

public class Human {
	String name;
	int height;
	public Aquaman speed;
	
	public Human() {
		this("아무개", 155);
	}
	public Human(String n, int h) {
		name=n;
		height=h;
	}
	
	public String getInfo() {
		
		return "이름: "+name+"\n키: "+height;
	}
	
}
