package day07;

public class Staff {
	private int no;
	private String name;
	private String dept;
	
	public void setNo(int no) {
			this.no=no;
	}
	public void setName(String name) {
			this.name=name;
	}
	public void setDept(String dept) {
			this.dept=dept;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
			
	public void showInfo() {
			System.out.println("사번: "+no);
			System.out.println("이름: "+name);
			System.out.println("부서: "+dept); //ctrl+alt 방향키 아래 
	
			
	}
	
	
	
	
}
