package exercise;

public class question4 {
	// 1부터 100사이의 정수 중에서 3 또는 4의 배수의 합을 계산
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1 ; i<=100;i++) {
			if (i % 3 == 00 || i % 4 == 0)
				sum += i;
		}
		System.out.println("합은 "+sum);
	}

}
