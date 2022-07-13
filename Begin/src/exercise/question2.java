package exercise;
import java.util.Scanner;
public class question2 {
 //계절 표시기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("Spring");
		break;
		case 6 : 
		case 7 : 
		case 8 : 
			System.out.println("Summer");
		break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("Autumn");
		break;
		case 12 : 
		case 1 : 
		case 2 : 
			System.out.println("Winter");
		break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
		
		
	}

}
