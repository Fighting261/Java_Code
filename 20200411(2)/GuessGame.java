import java.util.Random;
import java.util.Scanner;
public class GuessGame {
	//猜数字游戏
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
<<<<<<< HEAD
	    int num = random.nextInt(100);
=======
	        int num = random.nextInt(100);
>>>>>>> da3dcfc2ddd729569cfe53b31ce2f4e6bae3d491
		//System.out.println(num);
		while(true){
			System.out.println("请输入一个数字（1-100）");
			int Guess = scan.nextInt();
			if(Guess < num){
				System.out.println("太小了");
			}else if(Guess > num){
				System.out.println("太大了");
			}else{
				System.out.println("猜对了");
				break;
			}
		}	
	}
}
