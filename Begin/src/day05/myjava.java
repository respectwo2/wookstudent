package day05;

public class myjava {
	System.out.println("3.-----------------");
	//참조형의 배얼 - string, date, scanner, object...
	String[] arr=null;//[1] 선언
	System.out.println(arr);
	
	arr=new String[4];
	System.out.println('arr[0]='+arr[0]);
	
	arr[0]="Hello";
	arr[1]=new String("Hi");
	arr[2]=3+"5";//35
	arr[3]="";//빈문자열 char ch=' '
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("***********")
	//확장 for루프, 개선된 for루프, for each루프......
	/*	for (변수 선언문: 자료구조)
	 *	{
	 *		실행문;
	 *	}
	 *	알아서 자료구조의 크기(length)만큼 반복문 돌면서
	 *	자료구조에 저장된 값을 변수에 할당한다
	 * */
	
	 for(String s: arr) {
		 System.out.println(s.toUppercase());//toLowerCase()
		 //System.out.println("s: "+s);
	 }
	
	String Str[]=	{"안녕하세요","반갑습니다",	"잘가세요~~"};
	//확장 for루프문으로 str에 저장된 값 출력하세요	
	for(string s:str)
		System.out.println(s);
	
		 
	 }
}

