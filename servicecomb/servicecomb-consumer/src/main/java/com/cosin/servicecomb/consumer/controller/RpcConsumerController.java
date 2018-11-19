package com.cosin.servicecomb.consumer.controller;

import com.cosin.servicecomb.api.RpcService;
import com.cosin.servicecomb.consumer.service.RpcServiceImpl;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpcConsumerController{

    @Autowired
    private RpcServiceImpl rpcService;

    @GetMapping("rpc")
    public void helloServicecomb(){
        rpcService.helloServicecomb();
    }

}
