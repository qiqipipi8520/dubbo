/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author ZhaoQi.Zheng
 * @version : Robot.java,v 0.1 2019年11月20日 10:18
 */
@SPI
public interface Robot {
    void sayHello();
}