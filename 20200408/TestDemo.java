public class TestDemo {
	public static void main1(String[] args) {
		
		long a = 10L;
		
		System.out.println("a的值是:"+ a);
		System.out.println("最大值:" + Long.MAX_VALUE);
		System.out.println("最小值:" + Long.MIN_VALUE);
	}
	
	
	public static void main2(String[] args) {
	
	    double d = 12.5;
	    System.out.println(d);
       	System.out.println(Double.MAX_VALUE);
	    System.out.println(Double.MIN_VALUE);
	}
	
	public static void main3(String[] args) {
	
	    float f = 12.3f;
		System.out.println(f);
	}

	public static void main4(String[] args) {
	
	    char ch = 'a';
		System.out.println(ch);
		
		char ch2 = '高';
		System.out.println(ch2);
		
		char ch3 = 97;
		System.out.println(ch3);
	}
	
	public static void main5(String[] args) {
	
	    byte b = 12;
		byte c = 21;
		System.out.println(b+" "+c);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE + 1);//默认打印整型
		
		//byte d = 130;//错误，不能超过最大值（char和byte）
		
	}
	
	public static void main6(String[] args) {
	
	    boolean flg = false;
	    System.out.println(flg);
	}
	
	public static void main(String[] args) {
	
	    String str = "\"hello\"";
	    System.out.println(str);
	}
}


	