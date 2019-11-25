package com.user;

import com.book.BookList;
import com.operation.IOperation;

public abstract class User {
    public String name;
    //IOperation-->实现了这个接口的类都可以存放进去public
    public IOperation[] operations;

    // 根据用户选项执行操作
    public void doOperation(int choice, BookList bookList) {
        operations[choice].work(bookList);
        //对象  .
    }
    public abstract int menu();
}
