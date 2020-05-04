package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: 20200503
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-03 20:20
 **/
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除图书的名字：");
        String name = scanner.nextLine();
        int i = 0;
        for(;i < bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                break;
            }
        }
        if(i == bookList.getUsedSize()) {
            System.out.println("没有这本书!");
            return;
        }
        //开始删除
        for(int pos = i;pos < bookList.getUsedSize() - 1;pos++){
            Book book = bookList.getBook(pos+1);
            bookList.setBooks(pos,book);
            //bookList.setBooks(pos,bookList.getBook(pos+1););
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
    }
}
