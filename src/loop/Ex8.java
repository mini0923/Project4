package loop;

public class Ex8 {

	public static void main(String[] args) {


		int sum = 0;
		
		for (int i= 1; i <= 10; i++) {
			
			if(i % 2 == 0) { // 짝수는 스킵
				continue;
			}
			sum += i;		// 홀수는 더한다.
		}
		System.out.println("1부터 10까지의 홀수들의 합은 :" + sum);
		
		
	}

}
