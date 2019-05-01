package com.test;

/**
 * @ProjectName: decorator-test
 * @Package: com.test
 * @ClassName: EggCakeImpl
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class EggCakeImpl implements Cake {
    @Override
    public String nameDetails() {
        return "加蛋手抓饼";
    }

    @Override
    public double price() {
        return 6.0;
    }
}
