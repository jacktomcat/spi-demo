package com.chsoft.spi;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2019-03-27 下午9:58
 */
public class AddCalculator implements  Calculator {


    @Override
    public int calculator(int params1, int params2) {
        return params1+params2;
    }
}
