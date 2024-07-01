package loop.quiz;

public class Quiz11 {

	public static void main(String[] args) {

	for (int i =1; i<=5; i++) {			// 높이
			
			for (int j = 5; j >=i;  j--) {		// 공백
				System.out.print(" ");	
			}
			for(int k = 1; k <=i; k++) { // 별
				System.out.print("*");
			}
			System.out.println("");
		}
	
	for(int a = 4; a >= 1; a--) {
		for (int b = 1; b<=a; b++) {
			System.out.print("*");
		}
		for(int c = 4; c >= a; c--) {
			System.out.print(" ");
		}
		System.out.println();
	}
 		
//		System.out.println("    *");
//		System.out.println("   **");
//		System.out.println("  ***");
//		System.out.println(" ****");
//		System.out.println("*****");

	}
}
