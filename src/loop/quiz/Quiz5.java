package loop.quiz;

public class Quiz5 {

	public static void main(String[] args) {

		// continue를 썼을때 3의 배수 출력
		for (int i = 1; i<=100; i++) {
			if(i  % 3 != 0) {
				continue;
			}
			System.out.print(i + "   " );
		}
		
		
		// continue를 안썼을때 3의 배수 출력
//		for (int i = 1; i<=100; i++) {
//			if(i%3 ==0) {
//				System.out.print("  "+i);
//			}
//		}
//		
		
		
	}

}
