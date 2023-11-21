package com.streamworx2;

import com.streamworx2.data.feign.RequestModel;
import com.streamworx2.data.feign.ResponseModel;
import com.streamworx2.data.feign.SampleServiceRQ;
import com.streamworx2.data.request.Envelope;
import com.streamworx2.data.request.Sampleservicerq;
import com.streamworx2.data.response.Sampleservicers;
import com.streamworx2.feign.RestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SampleServiceEndpoint {
    private static final String NAMESPACE_URI = "http://sample-service.com/request";

    @Autowired
    RestFeignClient feignClient;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Envelope")
    @ResponsePayload
    public com.streamworx2.data.response.Envelope getData(@RequestPayload com.streamworx2.data.request.Envelope request){


        RequestModel requestRest = new RequestModel();
        requestRest.setSampleservicerq(new SampleServiceRQ(){
            {
                setService_id("20200421201455122");
                setOrder_type("PRO");
                setType("20221120233514");
                setTrx_id(request.getBody().getSampleservicerq().getTrxId());
            }
        });

        ResponseModel responseRest = feignClient.getData(requestRest);

        com.streamworx2.data.response.Envelope response = new com.streamworx2.data.response.Envelope();
        com.streamworx2.data.response.Body body = new com.streamworx2.data.response.Body();
        Sampleservicers rs = new Sampleservicers();
        rs.setErrorCode("0000");
        rs.setErrorMsg("SUCCESS");
        rs.setTrxId(responseRest.getSampleservicers().getTrx_id());
        response.setBody(body);
        response.setHeader(null);
        return response;
    }

    @PayloadRoot(namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", localPart = "sampleservicerq")
    @ResponsePayload
    public com.streamworx2.data.response.Envelope getData2(@RequestPayload Sampleservicerq request){
        RequestModel requestRest = new RequestModel();
        requestRest.setSampleservicerq(new SampleServiceRQ(){
            {
                setService_id("20200421201455122");
                setOrder_type("PRO");
                setType("20221120233514");
                setTrx_id(request.getTrxId());
            }
        });

        ResponseModel responseRest = feignClient.getData(requestRest);

        com.streamworx2.data.response.Envelope response = new com.streamworx2.data.response.Envelope();
        com.streamworx2.data.response.Body body = new com.streamworx2.data.response.Body();
        Sampleservicers rs = new Sampleservicers();
        rs.setErrorCode("0000");
        rs.setErrorMsg("SUCCESS");
        rs.setTrxId(responseRest.getSampleservicers().getTrx_id());
        body.setSampleservicers(rs);
        response.setBody(body);
        response.setHeader(null);
        return response;
    }
}
