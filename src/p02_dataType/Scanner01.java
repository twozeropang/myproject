package p02_dataType;

//라이브러리를 사용하려면 임포트해야 함 
import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수를 입력하세요>>>> ");
		int num1 = Integer.parseInt(sc.next()); // 엔터키까지 String으로 입력 받아서 int로 읽어들여서 저장(엔터키를 버려버린다.)

		System.out.println("두 번째 정수를 입력하세요>>>> ");
		int num2 = sc.nextInt();

		int num3 = num1 + num2;
		System.out.println("num1 = " + num1 + "\tnum2 = " + num2 + "\t합계 =" + num3);

	}
}
