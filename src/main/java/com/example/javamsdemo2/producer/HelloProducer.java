package com.example.javamsdemo2.producer;

import com.gexin.ad.javams.framework.rpc.boot.RpcControllor;
import com.gexin.ad.javams.framework.rpc.server.annotation.RpcMethod;

@RpcControllor
public class HelloProducer {

    @RpcMethod
    public String sayHello() {
        return "hello world javams-demo2";
    }
}
