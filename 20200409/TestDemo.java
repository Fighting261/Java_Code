import java.util.Scanner;

public class TestDemo {
	public static void main1(String[] args) {
		
		System.out.println(10%3);
		System.out.println(-10%3);
		System.out.println(10%-3);
		System.out.println(-10%-3);
	}


	public static void main2(String[] args) {
		
		int i = 10;
     	i = i++;
	
		System.out.println(i);
	}
		
	public static void main3(String[] args) {
		
		System.out.println(10 > 20 && 10 / 0 == 0);
		System.out.println(10 < 20 || 10 / 0 == 0);
	}
	
	public static void main4(String[] args) {
		int a = 10;
		if(a == 10){
		System.out.println("hello");
		}
	}
	
	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.ctrl + c(中断)   2.ctrl + d(退出)
		while(scan.hasNextInt()){
			int year = scan.nextInt();
			if((year%4 == 0 && year%100 != 0)||(year % 400 == 0)){
				System.out.println("闰年!");
			} else{
					System.out.println("不是闰年!");
				}
		} 
    }
	
	public static void main(String[] args) {
		
		int num = 5;
		int i = 1;
        int ret = 1;
		int sum = 0;
		//5的阶乘
		while(i <= num) {
			ret *= i;
			i++;
			sum += ret;
			}
			
			System.out.println(ret);
			System.out.println(sum);
		
	}
}








