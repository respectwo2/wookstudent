package day07;

public class School {

	public static void main(String[] args) {
//[1] 학생 객체를 생성하고, 학번, 이름, 전공값을 할당하세요
		Student s1=new Student();
		s1.setNo(1);
		s1.setName("홍길동");
		s1.setMajor("SW");
		
//[2] 교사 객체를 생성하고, 학번 이름, 담당과목을 할당하세요
		Teacher t1=new Teacher();
		t1.setNo(100);
		t1.setName("최교사");
		t1.setSubject("자바");
		
		
//[3] 직원 객체를 생성하고, 사번, 이름, 소속부서를 할당하세요
	
		System.out.println("학번: "+s1.getNo());
		System.out.println("이름: "+s1.getName());
		String mj=s1.getMajor();
		System.out.println("전공: "+mj);
		System.out.println("-----------------------");
		
		//
		System.out.println("교번: "+t1.getNo());
		System.out.println("이름: "+t1.getName());
		String s=t1.getSubject();
		System.out.println("전공: "+s);
		
		//문제1]학생 객체를 2개 더 생성하고...
				//        각각 이름,학번,전공 값을 넣어준뒤...
				//			배열에 저장하자.
				//			for루프 돌리면서 저장된 학생 객체들의
				//         정보를 출력해보자.

		//문제2] 교사 객체 1개 더 생성
				//    값 할당 후 배열에 저장후, 확장 for루프 이용해서 교사정보 출력하기

		
		
	}

}
