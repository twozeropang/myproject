package p02_dataType;

public class Dt02_Char {
	public static void main(String[] args) {
		
		// 문자를 직접 저장 - 알고보면 숫자
		char c1 = 'A'; // String과 구분해야함 - "" - string으로 나옴 주의
		char c2 = 65; // 문자 A의 정수 값
		char c3 = '\u0041'; //문자 A의 unicode 값
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		//16bit를 32bit로 넣으면 넣어짐
		int c1_int = c1;
		System.out.println(c1_int);
	}
}
