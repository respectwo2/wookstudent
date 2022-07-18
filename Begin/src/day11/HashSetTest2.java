package day11;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
			// Member 객체 3개 생성해서 HashSet에 저장하세요
		Member mb1 = new Member("홍길동", 23);
		Member mb2 = new Member("김아무개",25);
		Member mb3 = new Member("박영희",30);
		Member mb4 = new Member("홍길동", 23);
		Member mb5 = new Member("홍길동", 33);
		
		
		Set<Member> set=new HashSet<>();
		set.add(mb1);
		set.add(mb2);
		set.add(mb3);
		set.add(mb4);
		set.add(mb5);
		System.out.println("set.size(): "+set.size());
		
			//iterator()메서드로 저장된 회원들의 정보를 출력하세요
		Iterator<Member> it = set.iterator();
		for(int i=1;it.hasNext();i++) {
			Member user=it.next();
			System.out.println(i+": "+user.name+", "+user.age+"세");
		}
			
		System.out.println("mb1.hashCode(): "+mb1.hashCode());
		System.out.println("mb4.hashCode(): "+mb4.hashCode());
		System.out.println("mb2.hashCode(): "+mb2.hashCode());
		
	}

}
