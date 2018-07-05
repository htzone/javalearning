package com.redpig.DesignPattern.PrototypePattern;

/**
 * Created by hetao on 2018/7/5.
 * 原型模式
 */
public class PrototypePatternDemo {

    public static void main(String[] args){
//        shallowClone();
//        deepClone();
    }

    private static Book initBook(){
        Book book = new Book();
        book.setTitle("AGoodBook");
        book.setPageNum(500);
        Author author = new Author();
        author.setName("redpig");
        author.setAge(25);
        book.setAuthor(author);
        return book;
    }
    /**
     * 浅克隆
     */
    private static void shallowClone(){
        Book book = initBook();
        Book shallowCloneBook = book.clone();
        System.out.println(book.toString());
        System.out.println(shallowCloneBook.toString());

        System.out.println(book.getTitle() == shallowCloneBook.getTitle()); //true
        System.out.println(book.getPageNum() == shallowCloneBook.getPageNum()); //true

        //意味着此引用类型的属性所指向的对象本身是相同的， 并没有重新开辟内存空间存储
        //换句话说，引用类型的属性所指向的对象并没有复制。
        System.out.println(book.getAuthor() == shallowCloneBook.getAuthor()); //true
    }

    /**
     * 深克隆
     */
    private static void deepClone(){
        Book book = initBook();
        Book deepCloneBook = book.deepClone();

        System.out.println(book.toString());
        System.out.println(deepCloneBook.toString());

        System.out.println(book.getTitle() == deepCloneBook.getTitle()); //false
        System.out.println(book.getPageNum() == deepCloneBook.getPageNum()); //true

        //意味着此引用类型的属性所指向的对象本身是相同的， 并没有重新开辟内存空间存储
        //换句话说，引用类型的属性所指向的对象并没有复制。
        System.out.println(book.getAuthor() == deepCloneBook.getAuthor()); //false
    }

}
