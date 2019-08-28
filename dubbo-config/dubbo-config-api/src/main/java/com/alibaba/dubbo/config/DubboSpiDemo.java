package com.alibaba.dubbo.config;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author unovo
 * @create 2019-08-28 8:59
 */
public class DubboSpiDemo {

    public static void main(String[] args) {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        System.out.println(protocol);

        Protocol extension = (Protocol)ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("registry");
    }
}
