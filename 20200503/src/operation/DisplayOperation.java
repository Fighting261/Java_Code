package operation;

import book.Book;
import book.BookList;

/**
 * @program: 20200503
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-03 20:20
 **/
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍");
        for(int i = 0;i < bookList.getUsedSize();i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
