package com.test.decorator;

/**
 * @ProjectName: decorator-test
 * @Package: com.packae
 * @ClassName: CakeDecorator
 * @Description: 装饰抽象类继承Cakec 从外部来看扩展了Cake
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public abstract class CakeDecorator implements Cake {

    Cake cake;

    public CakeDecorator (Cake cake) {
        this.cake = cake;

    }

    @Override
    public String nameDetails() {
        return cake.nameDetails();
    }

    @Override
    public double price() {
        return cake.price();
    }

}
