//C6_PrimitiveConversions.java

public class C6_PrimitiveConversions {
	public static void main(String []args) {
		byte a = 10;
//		char a1 = a; // byte cannot implicitely be converted to char
		short b = a;
		System.out.println("a = "+a+"\tb = "+b);
		long c = 100L;
		float d = c;
		long e = (long)d;
	}
}