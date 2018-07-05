package com.redpig.DesignPattern.SingletonPattern;

/**
 * Created by hetao on 2018/7/4.
 *单例模式（双重检查锁）
 */
public class FileOpener2 implements Open{
    private static volatile FileOpener2 instance;
    private FileOpener2(){}

    //JDK1.5+
    public static FileOpener2 getInstance(){
        if(instance == null){
            synchronized(FileOpener2.class){
                if(instance == null){
                    instance = new FileOpener2();
                }
            }
        }
        return instance;
    }

    public void openFile() {
        System.out.println("open file2...");
    }
}
