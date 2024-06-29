package conditional.quiz;

public class Quiz8 {

	public static void main(String[] args) {


		int score = 88;
		
		int value = score/10;
		
		switch (value) {
		
			case 9 :
				System.out.println("수");
				break;
				
			case 8 : 
				System.out.println("우");
				break;
				
			case 7 :
				System.out.println("미");
				break;
				
			default : 
				System.out.println("양");
		}
		
		// 이와 같이 조건이 복잡한 경우에는 switch 문 보다는 if 문이 편리하다.
		
		
//			switch (score) {
//		
//			case 99 :
//			case 98 :	
//			case 97 :
//			case 96 :
//			case 95 :
//			case 94 :
//			case 93 :
//			case 92 :
//			case 91 :
//			case 90 :
//						System.out.println("수");
//						break;
//						
//			case 89 :
//			case 88 :	
//			case 87 :
//			case 86 :
//			case 85 :
//			case 84 :
//			case 83 :
//			case 82 :
//			case 81 :
//			case 80 :	
//						System.out.println("우");
//						break;
//				
//			case 79 :
//			case 78 :	
//			case 77 :
//			case 76 :
//			case 75 :
//			case 74 :
//			case 73 :
//			case 72 :
//			case 71 :
//			case 70 :	
//						System.out.println("미");
//						break;
//					
//			default :
//						System.out.println("양");
//		}
//		
		
		
		
	}

}
