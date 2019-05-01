package com.test;

/**
 * @ProjectName: decorator-test
 * @Package: com.test
 * @ClassName: Test
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {


    public static void main(String [] args) {
        Cake cake = new CakeImpl();
        System.out.println("小明"+cake.nameDetails()+"价格："+cake.price());


        Cake cake1 = new EggCakeImpl();
        System.out.println("小白"+cake1.nameDetails()+"价格："+cake1.price());


        Cake cake2 = new BeefAndEggCakeImpl();
        System.out.println("小农"+cake2.nameDetails()+"价格："+cake2.price());



    }
}
