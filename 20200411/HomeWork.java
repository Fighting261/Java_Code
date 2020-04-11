import java.util.Scanner;
public class HomeWork {
	//编写程序数一下 1到 100 的所有整数中出现多少个数字9
	public static void main1(String[] args) {
		int i = 0;
	    int ret = 0;
		for(i = 1; i <= 100; i++){
			if(i % 10 == 9){
		    ret++;
			}
		    if(i / 10 == 9){
			ret++;
		    }
		}
	System.out.println(ret);
	}
	
	//给定一个数字，判定一个数字是否是素数
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int num = scan.nextInt();
		for(i = 2;i <= (int)Math.sqrt(num); i += 2){
			if(num % i == 0){
				System.out.println("不是素数");
				break;
			}
		}
	}
	
	//求出0～999之间的所有“水仙花数”并输出。
	public static void main3(String[] args) {
		int i = 0;
		for(i = 1; i < 1000; i++){
			int ret = 0;
			int tmp = i;
			while(tmp != 0){
				ret++;
				tmp /= 10;
			}
			tmp = i;
			int sum = 0;
			while(tmp != 0){
				sum += Math.pow(tmp % 10,ret);
				tmp /= 10;
			}
			if(i == sum){
				System.out.println(i);
			}
		}
	}	
	//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
	public static void main(String[] args) {
		int i = 0;
		double sum = 0;
		int flag = 1;
		for(i = 1; i <= 100; i++){
			sum += (1.0/i) * flag;
			flag = -flag;
		}
		System.out.println(sum);
	}
}








