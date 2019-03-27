package com.chsoft.spi;

import java.util.ServiceLoader;

/**
 * ${DESCRIPTION}
 *
 * @auhtor jacktomcat
 * @create 2019-03-27 下午10:08
 */
public class TestCalculator {


    public static void main(String[] args) {
        ServiceLoader<Calculator> load = ServiceLoader.load(Calculator.class);
        load.forEach(calculator -> {
            int result = calculator.calculator(3,5);
            System.out.println(result);
        });

    }
}
