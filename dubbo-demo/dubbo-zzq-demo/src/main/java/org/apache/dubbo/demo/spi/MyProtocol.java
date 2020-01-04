/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package org.apache.dubbo.demo.spi;

/**
 * @author ZhaoQi.Zheng
 * @version : MyProtocolWrapper.java,v 0.1 2019年11月20日 10:54
 */
public class MyProtocol implements Protocol {
    @Override
    public void refer() {
        System.out.println("My Protocol");
    }
}