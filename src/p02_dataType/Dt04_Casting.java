package p02_dataType;

public class Dt04_Casting {
	public static void main(String[] args) {
		
		int num1 = 200;
		double num2 = num1; // 작은 걸 큰 것에 넣으면 자동 캐스팅(형변환)
		System.out.println(num1);
		System.out.println(num2);
		
//		int num3 = num2; //큰놈을 작은 놈에 넣으려고 하면 에러남
		int num3 = (int)num2; // 강제 형변환 - data 손실, 에러 감수
		System.out.println(num3);
		
		double num4 = 3456.1234;
		int num5 = (int)num4;
		System.out.println(num4);
		System.out.println(num5); // 데이터 손실이 일어남 
		
		int intValue = 44032;
		char charValue = (char)intValue; // 4바이트를 2바이트에 넣으려 하니 안들어가짐
		System.out.println(intValue + " : " + charValue);
		
		//기본 타입 같이 보이지만 array 형식
		// ['우' , '리' , '나', ... ] - 이런식
		String str = "우리나라 만세";
		System.out.println(str);
		
//		Integer i5 = new Integer(5);
//		char[] nat = {'우', '리', '나', '라'};
//		String str1 = new String(nat);
//		System.out.println(nat);
	}
}
