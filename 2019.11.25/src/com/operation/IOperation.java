package com.operation;

import com.book.BookList;

import java.util.Scanner;

public interface IOperation {
    Scanner scan = new Scanner(System.in);
    void work(BookList bookList);
}
