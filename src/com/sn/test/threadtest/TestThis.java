package com.sn.test.threadtest;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/5/13.
 */
public class TestThis {

    static {

        System.out.println("bingo");
    }

    public TestThis() {
        this("helleo");
        System.out.println("t1");

    }

    public  TestThis(String string) {
        System.out.println(string);
    }
    private static final String TEST = "t";
    public TestThis test(){
        return this;
    }

    public  void test1(){
        System.out.println(TEST);
    }
    public static void main(String[] args) {
        TestThis t = new TestThis();
        System.out.println("main");
        t.test1();
    }


}
