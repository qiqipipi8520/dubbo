/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package org.apache.dubbo.demo.spi;

/**
 * @author ZhaoQi.Zheng
 * @version : XxxProtocolWrapper.java,v 0.1 2019年11月20日 10:50
 */
public class XxxProtocolWrapper implements Protocol {
    Protocol impl;

    public XxxProtocolWrapper (Protocol protocol) {
        impl = protocol;
    }

    @Override
    public void refer() {
        System.out.println("Wrapper start!");
        impl.refer();
        System.out.println("Wrapper stop!");
    }
}