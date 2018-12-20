package com.redpig;

import com.redpig.common.Service.BaseService;
import com.redpig.common.spring.AppCtxHolder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hetao on 2018/7/5.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("hello world!");
        new ClassPathXmlApplicationContext("context.xml");
        BaseService baseService = AppCtxHolder.getBean("baseService");
    }
}
