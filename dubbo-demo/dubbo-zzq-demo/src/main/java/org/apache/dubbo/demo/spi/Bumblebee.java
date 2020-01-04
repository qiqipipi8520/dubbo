/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package org.apache.dubbo.demo.spi;

/**
 * @author ZhaoQi.Zheng
 * @version : Bumblebee.java,v 0.1 2019年11月20日 10:19
 */
public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}