package exercise;
import java.util.Scanner;


public class question {
	//점수계산기
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요: ");
			int score = scan.nextInt();
			
			System.out.println("학년을 입력하세요: ");
			int year = scan.nextInt();
			
		if (score>=60) {
			//60점 이상
			 if(year != 4) // 1,2,3학년
			System.out.println("합격입니다.");
			 else if(score >= 70) // 4학년
				 System.out.println("합격입니다.");
			 else
				 System.out.println("불합격입니다.");
		
			
			
		}else if(score<60) {
			System.out.println("불합격입니다.");
		}
	}
}
			
		
		

