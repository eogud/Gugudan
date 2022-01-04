import java.util.Scanner;


public class Gugudan {
	public static void main(String[] args) {
		
		//2단
//		System.out.println("--------------2단-------------");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
		
		// 변수활용 4단 구구단 해보기
//		System.out.println("--------------4단-------------");
//		int result = 4 * 1;
//		System.out.println(result);
//	
		// 사용자값 입력받기
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
//		
//		// while 문을 이용한 6단 구하기
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i+1;
//		}
//		
//		
//		// for 문을 이용한 7단 구하기
//		for(int j=1; j<10; j++) {
//			System.out.println(7 * j);
//
///		}
		
		 ///조건문을 활용한 구구단 구하기
		
	System.out.println("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값  :" + number);
		
		if(number >= 10 || number < 2){
			System.out.println("2 이상 9이하의 값만 입력할 수 있습니다.");
		}
		else{
			for( int i = 1 ; i<10; i++) {
			System.out.println(number * i);
			}
			
	}

}
		
		
	
		
		
	
}
