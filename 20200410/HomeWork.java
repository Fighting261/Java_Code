import java.util.Scanner;
public class HomeWork {
	  //1. 根据年龄, 来打印出当前年龄的人是:
	  //少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age <= 18){
			System.out.println("少年");
		}
		else if(age >= 19 && age <= 28){
			System.out.println("青年");
		}
		else if(age >= 29 && age < 55){
			System.out.println("中年");
		}
		else{
			System.out.println("老年");
		}
		}
		// 打印 1 - 100 之间所有的素数
		public static void main2(String[] args) {
			int i = 0, j = 0;
			for (i = 1; i <= 100; i++){
				for (j = 2; j <= i; j++)
					if (i % j == 0){
						break;
						}
						{
							if (i == j)
							{
								System.out.println(i);
								}
								}
								}
		}
		//输出 1000 - 2000 之间所有的闰年
		public static void main(String[] args) {
			int year = 0;
			for(year = 1000; year <= 2000; year++){
				if((year%4 == 0 && year%100 != 0)||(year % 400 == 0)){
					System.out.println(year);
				} 
			}
		}
}

	