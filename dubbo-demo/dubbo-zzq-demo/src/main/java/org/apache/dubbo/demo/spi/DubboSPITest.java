/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @author ZhaoQi.Zheng
 * @version : DubboSPITest.java,v 0.1 2019年11月20日 10:20
 */
public class DubboSPITest {
    @Test
    public void sayHello() throws Exception {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }

    @Test
    public void protocol() throws Exception {
        ExtensionLoader<Protocol> extensionLoader =
                ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol myProtocol = extensionLoader.getExtension("myProtocol");
        myProtocol.refer();
    }

    @Test
    public void testAdaptive1() {
        ExtensionLoader<AdaptiveExt> extExtensionLoader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExt = extExtensionLoader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?adaptive.ext=spring");
        System.out.println(adaptiveExt.echo("d", url));
    }

    @Test
    public void testAdaptive2() {
        ExtensionLoader<AdaptiveExt> extExtensionLoader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExt = extExtensionLoader.getAdaptiveExtension();
        System.out.println(adaptiveExt.e());
    }
}