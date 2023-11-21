package com.streamworx2.rest.model;

import lombok.Data;

@Data
public class SampleServiceRQ {
    String service_id;
    String order_type;
    String type;
    String trx_id;
}
