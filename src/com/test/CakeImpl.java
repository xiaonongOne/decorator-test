package com.test;

/**
 * @ProjectName: decorator-test
 * @Package: com.test
 * @ClassName: EggCakeImpl
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class CakeImpl implements Cake {
    @Override
    public String nameDetails() {
        return "普通版本手抓饼";
    }

    @Override
    public double price() {
        return 5.0;
    }
}
