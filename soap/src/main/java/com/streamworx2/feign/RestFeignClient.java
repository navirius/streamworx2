package com.streamworx2.feign;

import com.streamworx2.data.feign.RequestModel;
import com.streamworx2.data.feign.ResponseModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "test", url = "${test.rest.host}", fallbackFactory = RestFeignFallbackFactory.class)
public interface RestFeignClient {

    @PostMapping("/external/services/rest/sample-service")
    @ResponseBody
    ResponseModel getData(@RequestBody RequestModel request);
}
