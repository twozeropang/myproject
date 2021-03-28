package p01_variable;

public class Var03 {
	
	
	
	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
		
		// 바깥에서 선언한 var1 안에서도 가능
		if(true) {
			int var2 = 20;
			var1 = 30;
			System.out.println("var1 : " + var1);
			System.out.println("var2 : " + var2);
		}
		var1 =50;
		// 변수의 scope방식에 제한이 있어서
		//var2 = 70;
		System.out.println("var1 : " + var1);
		//System.out.println("var2 : " + var2);
	}
}
