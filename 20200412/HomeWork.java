import java.util.Scanner;
public class HomeWork {
	//输出n*n的乘法口诀表，n由用户输入。
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		int j = 0;
		for(i = 1;i <= n; i++){
			for(j = 1;j <= i; j++){
				System.out.print(j+"*"+i+"="+ i * j+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	
	//输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
	public static void main5(String[] args) {
		int i = 123;
		while(i != 0){
			int num = i %10;
			System.out.print(num + " ");
			i /= 10;
		}
	}
	
	
	//编写代码模拟三次密码输入的场景。最多能输入三次密码，密码正确，
	//提示“登录成功”,密码错误，可以重新输 入，最多输入三次。三次均错，
	//则提示退出程序
	public static void main4(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 3;
		while (count != 0) {
			System.out.println("请输入密码:");
			String password = scan.nextLine();
			if(password.equals("123456")) {
				System.out.println("密码正确");
				break;
			}else {
				count--;
				System.out.println("密码错误！！你还有"+count+"次机会！");
			}
		}
	}
	
	
   	//求一个整数，在内存当中存储时，二进制1的个数。
	public static void main3(String[] args) {
        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while(n != 0) {
            n = n & (n-1);
            count++;
            }
        System.out.println("count=" + count);
        }
	
	//获取一个数二进制序列中所有的偶数位和奇数位,分别输出二进制序列
	public static void main2(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 31; i >= 1; i -= 2){
            System.out.print(((n >> i) & 1) + " ");
        }
        System.out.println();
        for(int i = 30; i >= 0; i -= 2){
            System.out.print(((n >> i) & 1) + " ");
        }
    }
	
	//求两个正整数的最大公约数
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		while (a%b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		System.out.println(c);
	}
}