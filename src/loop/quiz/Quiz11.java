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
 		
 		
 		
//		System.out.println("    *");
//		System.out.println("   **");
//		System.out.println("  ***");
//		System.out.println(" ****");
//		System.out.println("*****");

	}
}
