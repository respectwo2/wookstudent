package day05;

public class ExceptionTesr4 {

	public static void main(String[] args) {
		//args : String타입의 배열. 명령줄 인수
		//컴파일 : javac ExceptionTest4.java
		//실행 : java ExceptionTest4 안녕 잘가
		//							args[0] args[1]
		try {
			System.out.println("args[0]="+args[0]);
			System.out.println("args[1]="+args[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 입력하세용");
	}
		
	}
	
}


