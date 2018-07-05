package com.redpig.DesignPattern.SingletonPattern;

/**
 * Created by hetao on 2018/7/4.
 */
public class SingletonPatternTest {
    public static void main(String[] args){
        FileOpener1.INSTANCE.openFile();
        for(int i =0; i<10;i++){
            FileOpener2.getInstance().openFile();
        }
    }
}
