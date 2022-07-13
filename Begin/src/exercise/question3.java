package exercise;
import java.util.Scanner;
public class question3 {
 //알파벳 자음 모음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요");
		String al = sc.next();
		
		switch(al) {
		case "a" :
		case "e" : 
		case "i" : 
		case "o" : 
		case "u" :
			System.out.println("모음입니다.");
			break;
			
			default :
			System.out.println("자음입니다.");
		}
	}
	
}
