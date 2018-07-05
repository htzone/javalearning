package com.redpig.DesignPattern.PrototypePattern;

import java.io.*;

/**
 * Created by hetao on 2018/7/5.
 */
public class Book implements Cloneable, Serializable{

    private String title;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                ", author=" + author +
                '}';
    }

    private int pageNum;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * 浅克隆
     * @return
     */
    public Book clone(){
        Book book = null;
        try{
            book = (Book) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return book;
    }

    /**
     * 利用序列化进行深克隆
     * @return
     */
    public Book deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Book) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

}
