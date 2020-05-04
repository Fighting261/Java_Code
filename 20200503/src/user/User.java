package user;

import book.BookList;
import operation.IOperation;

/**
 * @program: 20200503
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-03 20:31
 **/
public abstract class User {

    protected String name;

    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu() ;

    public void doOperation(BookList bookList, int choice) {
        this.operations[choice].work(bookList);
    }
}
