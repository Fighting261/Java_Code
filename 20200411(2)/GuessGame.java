import java.util.Random;
import java.util.Scanner;
public class GuessGame {
	//猜数字游戏
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
	    int num = random.nextInt(100);
		System.out.println(num);
		while(true){
			//System.out.println("请输入一个数字（1-100）");
			int Guess = scan.nextInt();
			if(Guess < num){
				System.out.println("太小了");
			}else if(Guess > num){
				System.out.println("太小了");
			}else{
				System.out.println("猜对了");
				break;
			}
		}	
	}
}