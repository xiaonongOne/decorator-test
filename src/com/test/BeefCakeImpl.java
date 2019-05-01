package com.test;

/**
 * @ProjectName: decorator-test
 * @Package: com.test
 * @ClassName: BeefCakeImpl
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class BeefCakeImpl implements Cake {

    @Override
    public String nameDetails() {
        return "加牛肉手抓饼";
    }

    @Override
    public double price() {
        return 6.0;
    }
}
