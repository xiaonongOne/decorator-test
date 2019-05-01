package com.test.decorator;

/**
 * @ProjectName: decorator-test
 * @Package: com.packae
 * @ClassName: BufferCakeImpl
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class BufferCakeImpl extends  CakeDecorator {

    public BufferCakeImpl(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetails() {
        return "奶油"+cake.nameDetails();
    }

    @Override
    public double price() {
        return cake.price()+3.0;
    }


}
