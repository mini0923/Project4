package loop.quiz;

public class Quiz2 {

	public static void main(String[] args) {


		int num = 11;
		int result = 0;
		
		while(num <= 20) {
			result += num;
			num++;
		}
		System.out.println("11부터 20의 합은 : " + result +"입니다.");
		
		
	}

}
