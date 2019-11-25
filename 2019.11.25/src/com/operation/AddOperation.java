package com.operation;

import com.book.Book;
import com.book.BookList;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍");
        System.out.println("请输入图书的名字");
        String name = scan.next();
        System.out.println("请输入图书的作者");
        String author = scan.next();
        System.out.println("请输入图书的价格");
        int price = scan.nextInt();
        System.out.println("请输入图书的类型");
        String type = scan.next();

        Book book = new Book(name,author,price,type);
        int pos = bookList.getUsedSize();
        bookList.setBooks(pos,book);

        bookList.setUsedSize(pos+1);
    }
}

