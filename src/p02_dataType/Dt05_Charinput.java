package p02_dataType;

import java.io.IOException;

public class Dt05_Charinput {
	public static void main(String[] args) throws IOException {
		
		System.out.println("2~9 사이의 숫자를 입력하세요?");
		
		int num = System.in.read()-48;
		//int num = System.in.read()-'0'; - 같은 결과 출력됨
		// 값을 받을 때 ascii 코드 값으로 입력 받아 7은 55가 된다.
		System.out.println("입력한 숫자: " +num);
		
		
		//enter 키값을 처리해야함 
//		int r = System.in.read();
//		int n = System.in.read();
//		System.out.println(r + " : " + n);
		System.in.skip(2);
		
		System.out.println("2~9 사이의 숫자를 입력하세요?");
		int value = System.in.read()-'0';
		System.out.println("입력한 숫자: " +value);
		
		System.in.skip(2);
		
		System.out.println("문자 하나를 입력하세요");
		char charValue = (char) System.in.read();
		System.out.println("입력한 키:" + charValue);
	}
}
