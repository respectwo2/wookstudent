package day07;

public class Superman {
	String name;
	int height;
	int power;//초능력
	//기본생성자
	
	public Superman() {
		//이자리에 쓰면 안된다는소리임 this는 첫번쨰줄에 와야댐!!!
		this("슈퍼맨",166,100);
		//this() : 자기자신의 생성자를 호출할떄 사용함.
		//			생성자 안에서만 호출할 수 있으며,
		// 			제일 첫번쨰 문장이어야 한다.
		/*name="슈퍼맨";
		height=166;
		power=100;
		*/
		
	}
	
	public Superman(String name) {
		//this("슈퍼맨");
		this.name=name;
		height=170;
		power=200;

		
	}
	
	public Superman(String name, int height) {
	/*	this.name=name;
		this.height=height;
		power=300; */
	}
	//target : 여기서 초기화를 하자
	public Superman(String name, int height, int power) {
		
		this.name=name;
		this.height=height;
		this.power=power;
	
	}
	
	//인자생성자 3개
	
	
	public String getInfo() {
		String info="이름: "+name+"\n키: "+height+"\n초능력: "+power;
		return info;
		
	}
	
}///////////////////////
