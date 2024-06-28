package loop;

public class Ex4 {

	public static void main(String[] args) {


		int num = 11;
		int result = 0;
		
		do {
			result += num;
			num ++;
		}while(num<=20);
			
		System.out.println(result);
	}

}
