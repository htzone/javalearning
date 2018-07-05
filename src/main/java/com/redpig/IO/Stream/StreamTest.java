package com.redpig.IO.Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hetao on 2018/5/9.
 */
public class StreamTest {
    public static void main(String[] args){
        convertStreamReader();
    }

    /**
     * 流转换：字节流转化为字符流
     */
    private static void convertStreamReader(){
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(reader);

            String line;
            while((line = bf.readLine()) != null){
                if("exit".equals(line)){
                    System.exit(1);
                }
                System.out.println("输入内容：" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
