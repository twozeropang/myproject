package p02_dataType;

public class Dt01_Number {
	public static void main(String[] args) {
		//정수 타입: byte, char, short, int, long
	      //바이트수 : 1   /    2   / 2  /   4    / 8
	      //1Byte = 8bit  // 1 bit는 숫자 0이나 1이 들어가는 단위
		
		//byte 는  -128~ 127까지 총 256개의 수 표현 가능
		byte var1 = -128;
		byte var2 = 37;
		byte var3 = 127;
//		byte var4 = 253; //Type mismatch : cannot convert from int to byte
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println("-----------------");
		
//		int num1 = 2111111111; //int 양수 범위 근처
//		long num2 = 8234567890123456789L; //long 범위 근처 
		
		byte var5 = 125;
		int var6 = 125;
		
		for(int i = 0; i < 5; i++) {
			var5++;
			var6++;
			System.out.println("var5 : "+var5 + " / var6 :" + var6);
		}
		
		//실수 타입: float(4)   double(8)//천문학, 생물학
//		double var7 = 3.141592429743294290483;
//		float var8 = 3.1434234421423f;
		
		float var9 = 3e6f; //3*10의 6승, float
		System.out.println(var9);
		double var10 = 2e-3; //2* 1/1000(10의 -3승)
		System.out.println(var10);
	}
}
