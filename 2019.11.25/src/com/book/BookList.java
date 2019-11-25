package com.book;

public class BookList {
    //Book[] books = new Book[10];
    private Book[] Books = new Book[10];
    private int usedSize;

    public BookList() {
        Books[0] = new Book("三国演义","罗贯中",56,"小说");
        Books[1] = new Book("西游记","吴承恩",76,"小说");
        Books[2] = new Book("水浒传","施耐庵",96,"小说");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
