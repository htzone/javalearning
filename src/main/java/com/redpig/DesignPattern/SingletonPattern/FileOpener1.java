package com.redpig.DesignPattern.SingletonPattern;

/**
 * Created by hetao on 2018/7/4.
 * 单例模式（枚举）
 */
public enum FileOpener1 implements Open{
    INSTANCE;

    public void openFile(){
        System.out.println("open file1...");
    }
}
