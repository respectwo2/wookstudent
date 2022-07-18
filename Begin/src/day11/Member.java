package day11;
//도메인 객체
/**
 * 
 * 
 *
 */
public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	@Override
	public int hashCode() {
		int code=name.hashCode()+age;
		return code;
				
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member user=(Member)obj;
			boolean bool=user.name.equals(this.name)&&user.age==this.age;
					return bool;
		}else {
			return false;
		}
	}
}
