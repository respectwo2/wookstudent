package day08;

public class Aquaman extends Human {
	double speed;
	
	public Aquaman() {
		this("수중인간",160,789.12);				// 기본생성자 설정
	}
	public Aquaman(String n,int h,double s) {
		this.name=n;
		this.height=h;
		this.speed=s;
		
	}
		
	//getInfo()메소드를 오버라이드 해보세요
	
	public String getInfo() {
		return "이름: "+name+"\n키: "+height+"\n초능력: "+speed;
	}
	//getInfo()메소드를 오버로딩해보기
	
	
}
	