package com.test;

/**
 * @ProjectName: decorator-test
 * @Package: com.test
 * @ClassName: BeefCakeImpl
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class BeefAndEggCakeImpl implements  Cake {
    @Override
    public String nameDetails() {
        return "加蛋加牛肉的手抓饼";
    }

    @Override
    public double price() {
        return 7.0;
    }
}
