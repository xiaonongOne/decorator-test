package com.test.decorator;

/**
 * @ProjectName: decorator-test
 * @Package: com.packae
 * @ClassName: CakeImpl
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class CakeImpl implements Cake {
    @Override
    public String nameDetails() {
        return "手抓饼";
    }

    @Override
    public double price() {
        return 5.0;
    }
}
