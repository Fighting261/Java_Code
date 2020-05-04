package operation;


import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: 20200503
 * @description:新增书籍
 * @author: Zhang Baolu
 * @create: 2020-05-03 20:17
 **/
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型：");
        String type = scanner.next();//nextLine和nextInt不能混用

        Book book = new Book(name,author,price,type);
        int curSize = bookList.getUsedSize();
        bookList.setBooks(curSize,book);
        bookList.setUsedSize(curSize+1);
        System.out.println("新增成功！");
    }
}
