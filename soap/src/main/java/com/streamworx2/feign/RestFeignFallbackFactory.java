package com.streamworx2.feign;

import org.springframework.cloud.openfeign.FallbackFactory;

public class RestFeignFallbackFactory implements FallbackFactory<RestFeignClient> {
    @Override
    public RestFeignClient create(Throwable cause) {
        return null;
    }
}
