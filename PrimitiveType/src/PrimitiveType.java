
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      저장가능한 값의 범위
//		논리형 boolean: false, true
//		문자형 char: 0~65535
//		정수형 byte, short, int, long
//		byte: -127~127
//		short: -32,768 ~32,767
//		int: -2의 15승 ~ 반대 까지 약 +-20억
//		long: -2의 63승 ~ 반대 까지
//		실수형 float, double
//		float: 1.4E-45 ~ 3.4E38
//		double: 엄청 크다(long보다 큼)
		
//		boolean
		boolean power = true;
		
		boolean checked = false;
	
		
		System.out.println("대답 yes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		
//      char
		
		char ch = 97; 

		System.out.println(ch);
//      아스키코드
		
		
//      인코딩 디코딩
		
//      정수형
//      byte, short, int, long
		
		int num = 10;
//		byte, short, int, long 00 01 10 11
		System.out.println(num);
		
//		byte = 127;
//      b = (byte)(b+1);
		
		System.out.println(b);
		
		long bignum = 30000000000L;
				
		System.out.println("long타입:" + bignum);
		int firstNum = 1500000000;
		int secondNum = 1300000000;
		
		sum = 0;
	    sum = firstNum + secondNum;
		
		System.out.println("총 명품금액: " + sum );
				
//      실수형
//      float, double 
//      4byte, 8byte
//      실수 정확도 
		
		float f = 9.122345657874F;
	    float f2 = 1.45678944575f;
	    double d = 9.11234555567d;
	    
	    System.out.println(f);
	    System.out.println(f2);
	    System.out.println(d);
	    
	    
		 
		
	}

}
