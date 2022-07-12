package day05;
/*try 블럭 하나에 catch 절은 여러개 올 수 있음
 * 그러나 이 떄 catch 순서 주의!!!!
 * - 부모 자식의 상속관ㄱ계가 있는 예외일 경우
 * 자식을 먼저 catch하고 부모 예외를 나중에 catch해야 한다
 */
public class ExceptionTest4 {

	public static void main(String[] args) {
		//args : String타입의 배열. 명령줄 인수
		//컴파일 : javac ExceptionTest4.java
		//실행 : java ExceptionTest4 안녕 잘가
		//							args[0] args[1]
		try {
			System.out.println("args[0]="+args[0]);//국어
			System.out.println("args[1]="+args[1]);//영어
			//총 합계 점수 
			//평균 점수
		
		
			System.out.println("총점: "+(args[0]+args[1]));
			//java.lang.Integer클래스==>Wrapper class
			//int (기본자료형)===> Integer
			//public static int parseInt(String s):
			//문자열 s를 정수로 변환시켜 반환해주는 메소드
			//별표!!!!!!!! 자바쪽에서 자주 이용
			//static이 붙으면 앞에 class명을 붙여준다
			//총점
			//평균점수
			int kor=Integer.parseInt(args[0]);
			int eng=Integer.parseInt(args[1]);
			int sum=kor+eng;
			int avg=sum/args.length;
			
			System.out.println("총점: "+sum);
			System.out.println("평균점수 "+avg);
			System.out.println(avg/0); //arismeticexception
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 입력하세요");
		}catch(NumberFormatException e) {
			System.out.println("점수는 숫자로 입력해야 해요");
		}catch(Exception e) {
			System.out.println("기타 예상치 못한 예외 발생: "+e);
		}
	}
	
				

					
		
	}
	



