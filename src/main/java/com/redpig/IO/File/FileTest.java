package com.redpig.IO.File;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by hetao on 2018/5/6.
 */
public class FileTest {

    public static void main(String[] args){
        fileTest2();
    }

    public static void fileStaticParamsTest(){
        File[] roots = File.listRoots();
        System.out.println(roots.length);
        for(File root : roots){
            System.out.println(root.getName());
        }

        //文件路径字符
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator);

        try {
            //创建temp文件
            File.createTempFile("abcd", ".txt", new File("D:/"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fileTest1(){
        File file = new File(".");
        String[] lists = file.list();
        for(String temp : lists){
            System.out.println(temp);
        }

        String[] list2 = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return Pattern.matches("src",name);
            }
        });
        for(String temp : list2){
            System.out.println(temp);
        }
    }

    public static void fileTest2(){
        try {
            File file = new File(".");
            System.out.println(file.getAbsoluteFile().getParent());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println(file.getName());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.getParent());
            System.out.println(file.length());
            System.out.println(new Date(file.lastModified()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileTest3(){
        try {
//            FilterInputStream fis = new FilterInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
