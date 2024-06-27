package conditional;

//import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		int rank = 2;
		
		switch (rank) {
		
					case 1 : 
								System.out.println("메달의 색은 금입니다.");
								break;
					
					case 2 : 
								System.out.println("메달의 색은 은입니다.");
								break;		
								
					case 3 : 
								System.out.println("메달의 색은 동입니다.");
								break;
								
					default :
								System.out.println("메달이 없습니다.");
		}
		
		
//		Scanner scanner = new Scanner(System.in);    // C언어 scanf 랑 동일.
//		
//		System.out.println("당신은 몇등입니까? : " );
//		int rank = scanner.nextInt();			
//				
//				switch (rank) {
//				case 1 :
//					System.out.println("금메달");
//								break;
//				case 2 : 
//					System.out.println("은메달");
//								break;
//				case 3 : 
//					System.out.println("동메달");
//								break;
//								
//				default : 
//					System.out.println("메달이 없습니다.");
//				}

		
	}

}
