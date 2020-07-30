package com.server.model;

import lombok.Data;

@Data
public class PaymentDetails {

    private String dateTime;
    private Integer code;
    private String kktRegId;
    private Integer shiftNumber;
    private Integer requestNumber;
    private String operator;
    private String merchantAddress;
    private String user;
    private Item[] items;
}
