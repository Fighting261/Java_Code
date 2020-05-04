import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @program: 20200503
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-03 19:48
 **/

public class TestMain {

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1--》管理员,2--》普通用户");
        int choice = scanner.nextInt();

        if(choice == 1) {
            return new Admin(name);//向上转型
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {

        BookList bookList = new BookList();
        //登录
        User user = login();
        while(true) {
            int choice = user.menu();
            user.doOperation(bookList, choice);
        }
    }
}
