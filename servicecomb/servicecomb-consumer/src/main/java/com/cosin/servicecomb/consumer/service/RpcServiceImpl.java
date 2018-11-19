package com.cosin.servicecomb.consumer.service;

import com.cosin.servicecomb.api.RpcService;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RpcServiceImpl{
//    从注册中心获取
//    从APPLICATION_ID获取id；从service_description.name获取name
//    schemaId来自于服务提供者
    @RpcReference(microserviceName = "start.servicecomb.io:HelloServiceComb", schemaId = "sayHello")
    private RpcService rpcService;

    public void helloServicecomb() {
        System.out.println(rpcService.helloServicecomb());
    }
}
