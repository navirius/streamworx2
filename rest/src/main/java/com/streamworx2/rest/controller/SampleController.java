package com.streamworx2.rest.controller;

import com.streamworx2.rest.model.RequestModel;
import com.streamworx2.rest.model.ResponseModel;
import com.streamworx2.rest.model.SampleServiceRS;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/external/services/rest/")
public class SampleController {
    @PostMapping(value = "sample-service")
    @ResponseBody
    public ResponseModel getData(@RequestBody RequestModel request){
        SampleServiceRS rs = new SampleServiceRS();
        rs.setType("20221120233514");
        rs.setService_id("20200421201455122");
        rs.setOrder_type("PRO");
        rs.setTrx_id(request.getSampleservicerq().getTrx_id());
        ResponseModel response = new ResponseModel();
        response.setSampleservicers(rs);
        return response;
    }
}
