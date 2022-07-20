package day12;
//사용자정의 예외클래스만들기
//[1] Exception을 상속받는다.
//[2] 생성자를 구성해서 생성자안에서 super("예외메세지")를 호출해서 예외 메세지를 등록한다.
public class NotSupportedNameException extends Exception{ //[1]

	public NotSupportedNameException() {
		super("NotSupportedNameException");
	}
	public NotSupportedNameException(String msg) {
		super(msg);
	}
	
}////////////////////
