package conditional;

public class Ex6 {

	public static void main(String[] args) {
		
		String  rank =" 2";
		
		switch (rank) {
		
					case "1" : 
								System.out.println("메달의 색은 금입니다.");
								break;
					
					case "2" : 
								System.out.println("메달의 색은 은입니다.");
								break;		
								
					case "3" : 
								System.out.println("메달의 색은 동입니다.");
								break;
								
					default :
								System.out.println("메달이 없습니다.");
				}
				
					// switch문은 실수타입을 사용할 수 없다!!
//					float r = 1.1f;
//					
//					switch (r) {		// 에러난다.
//					case 1.5f:
//						break;
//					}
	}

}
