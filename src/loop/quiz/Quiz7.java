package loop.quiz;

public class Quiz7 {

	public static void main(String[] args) {


		for (int i = 3; i <= 7; i++) {
			System.out.print(i + "단 ");
			for(int j= 1; j <= 9; j++) {
				System.out.print(i +"x " + j + "=" + i * j + "   ");
			}
			System.out.println();
		}
		
		
	}

}
