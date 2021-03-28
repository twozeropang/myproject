package p02_dataType;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		//Scanner로 이름과 국어, 수학, 영어점수를 입력받아서 총점, 평균까지 출력
//		이름 : 홍길동 //String - nextLine()
//		국어: 80 // next() - int로 형변환
//		영어: 90
//		총점: 220
//		평균: 74.0 //float
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("국어 점수를 입력하세요.");
		int kl = Integer.parseInt(sc.next());
		System.out.println("영어 점수를 입력하세요.");
		int el = Integer.parseInt(sc.next());
		System.out.println("수학 점수를 입력하세요.");
		int sl = Integer.parseInt(sc.next());
		int total = kl + el + sl;
		float avg = (float)total/3;
		
		System.out.println("이름 :" + name);
		System.out.println("국어:" + kl);
		System.out.println("영어:" + el);
		System.out.println("수학:" + sl);
		System.out.println("총점:" + total);
		System.out.println("평균:" + avg);
		
		
	}
}
