package conditional.quiz;

public class Quiz6 {

	public static void main(String[] args) {


		int point = 85;
		
		if(point >= 90 && point <= 99) {
			System.out.println("수");
			
		}else if (point >= 80 ) {
			System.out.println("우");
			
		}else if (point >= 70 ) {
			System.out.println("미");
			
		}else {
			System.out.println("양");
		}
		
		
	}

}
