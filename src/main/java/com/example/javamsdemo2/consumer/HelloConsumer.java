package com.example.javamsdemo2.consumer;

import com.gexin.ad.javams.framework.rpc.boot.App;
import com.gexin.ad.javams.framework.rpc.client.app.RpcApp;
import org.springframework.stereotype.Component;

@Component
public class HelloConsumer {

    @App(name = "javams-demo2")  // 此处的 name 即是 rpc-client.yml 里配置的 name 值
    private RpcApp rpcApp;

    public String callSayHello(String methodName) throws Exception {
        /**
         * 第一个参数：要调用的方法名
         * 第二个参数：返回值类型
         * 第三个参数：参数
         */
        String result = rpcApp.invoke(methodName, String.class);
        return result;
    }

}
