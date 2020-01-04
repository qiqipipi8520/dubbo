/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.URL;

/**
 * @author ZhaoQi.Zheng
 * @version : DubboAdaptiveExtImpl.java,v 0.1 2019年11月20日 19:15
 */
public class DubboAdaptiveExtImpl implements  AdaptiveExt {
    @Override
    public String echo(String msg, URL url) {
        return "dubbo";
    }

    @Override
    public String e() {
        return "DubboAdaptiveExtImpl";
    }
}