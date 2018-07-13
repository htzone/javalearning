package com.redpig.JavaClass.NestedClass;

/**
 * 静态内部类Demo
 * Created by hetao on 2018/7/11.
 */
public class StaticMemberClassDemo {
    private static String className = "StaticMemberClassDemo";
    private String name;

    public StaticMemberClassDemo() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private static void setClassName(String name) {
        className = name;
    }

    /**
     * 静态内部类
     */
    public static class Test {
        private String testName;

        public Test() {
        }

        public String getTestName() {
            return testName;
        }

        public void setTestName(String testName) {
            this.testName = testName;
        }

        public void printOutClassName() {
            System.out.println(className);
        }

        public void setOutClassName(String name) {
            setClassName(name);
        }

    }

    public static void main(String[] args) {
        StaticMemberClassDemo.Test test = new StaticMemberClassDemo.Test();
        test.printOutClassName();
        test.setOutClassName("changeOutClassName");
        test.printOutClassName();
    }
}
