package com.streamworx2.feign;

import com.streamworx2.data.feign.RequestModel;
import com.streamworx2.data.feign.ResponseModel;
import org.springframework.cloud.openfeign.FallbackFactory;


public class RestFeignFallbackFactory implements FallbackFactory<RestFeignClient> {
    @Override
    public RestFeignClient create(Throwable cause) {
        return new RestFeignClient() {
            @Override
            public ResponseModel getData(RequestModel request) {
                return null;
            }
        };
    }
}
