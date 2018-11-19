package com.cosin.servicecomb.provider;

import com.cosin.servicecomb.api.RpcService;
import org.apache.servicecomb.provider.pojo.RpcSchema;

@RpcSchema(schemaId = "sayHello")
public class RpcProvider implements RpcService {

    @Override
    public String helloServicecomb() {
        return "helloServicecomb";
    }
}
