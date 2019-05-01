package com.test.decorator;

/**
 * @ProjectName: decorator-test
 * @Package: com.packae
 * @ClassName: EggCakeImpl
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class EggCakeImpl extends  CakeDecorator {

    public EggCakeImpl(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetails() {
        return "鸡蛋"+cake.nameDetails();
    }

    @Override
    public double price() {
        return cake.price()+1.5;
    }
}
