package day11;
import java.util.*;
public class TreeSetTest {
/*	TreeSet
 * 		-추가된 데이터들이 정렬된다.
 * 		-데이터 중복은 허용하지 않음.
 * 		-내부적으로 이전 트리를 사용해 데이터를 저장하고 꺼낸다.
 */
	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<>();
		tree.add("홍길동");
		tree.add("강감찬");
		tree.add("김철수");
		tree.add("이순신");
		tree.add("정약용");
		tree.add("홍길동");
		
		System.out.println("tree.size(): "+tree.size());
		
		for(String s:tree)
			System.out.println(s);
		
		
	}

}
