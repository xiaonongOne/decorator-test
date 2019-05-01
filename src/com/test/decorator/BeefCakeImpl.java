package com.test.decorator;

/**
 * @ProjectName: decorator-test
 * @Package: com.packae
 * @ClassName: MeetCakeImpl
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class BeefCakeImpl extends  CakeDecorator {

    public BeefCakeImpl(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetails() {
        return "牛肉"+cake.nameDetails();
    }

    @Override
    public double price() {
        return cake.price()+2.0;
    }
}
