package com.test.decorator;

/**
 * @ProjectName: decorator-test
 * @Package: com.packae
 * @ClassName: Test
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {

    public static void main(String [] args) {
        Cake cake = new CakeImpl();
        System.out.println(cake.nameDetails() +"价格："+cake.price());
        System.out.println("==========");

        Cake cake1 = new EggCakeImpl(cake);
        System.out.println(cake1.nameDetails() +"价格："+cake1.price());
        // 标识了制作顺序与流程，再生产中流水线制作程序时，可能会比较严格的把控，制作流程。
        // 装饰者模式不仅仅完成操作细节的流程，提供很好的调用方式。
        Cake cake2 = new EggCakeImpl(cake);
        Cake cake3 = new BeefCakeImpl(cake2);
        System.out.println(cake3.nameDetails() +"价格："+cake3.price());

    }

}
