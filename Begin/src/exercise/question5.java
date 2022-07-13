package exercise;
import java.util.Scanner;
public class question5 {
	/*
	 * while문을 이용해서
	 * 0을 입력하면 입력 종료 -> while문 탈출 조건
	 * 입력한 수의 개수 출력
	 * 입력한 수의 평균 출력
	 * 예 1 2 2 0 ) 개수 : 3개 평균 : ~~
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0, n=0;
		double sum=0;
		
		System.out.println("정수 입력하고 마지막에 0입력");
		//0이 입려되면 while문 탈출함!!!

		while((n= sc.nextInt()) !=0 ) {
			sum = sum + n; // sum=3
			count++;		// count=2
			
			}
		System.out.println("수의 개수는 "+count+"개이며 ");
		System.out.println("평균은 "+sum/count+" 입니다.");
		}
	}


