package com.streamworx2;

import com.oracle.external.services.sampleservice.response.v1.Sampleservicers;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xmlsoap.schemas.soap.envelope.Envelope;

@Endpoint
public class SampleServiceEndpoint {
    private static final String NAMESPACE_URI = "http://www.oracle.com/external/services/sampleservice/response/v1.0";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getData")
    @ResponsePayload
    public Sampleservicers getData(@RequestPayload Envelope request){

        Sampleservicers response = new Sampleservicers();
        response.setErrorCode("0000");
        response.setErrorMsg("Success");
        response.setTrxId(request.getBody().getSampleservicers().getTrxId());
        return response;
    }
}
