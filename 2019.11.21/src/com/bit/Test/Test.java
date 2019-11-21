package com.bit.Test;
import java.util.Date;
        /*1java.lang:系统常用基础类(String、Object),此包从JDK1.1后自动导入。
        2. java.lang.reflect:java 反射编程包;
        3. java.net:进行网络编程开发包。
        4. java.sql:进行数据库开发的支持包。
        5. java.util:是java提供的工具程序包。(集合类等) 非常重要
        6. java.io:I/O编程开发包。*/
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
// 得到一个毫秒级别的时间戳
        System.out.println(date.getTime());
    }
}