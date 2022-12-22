package com.microservices.demo.config;

import lombok.Data;

@Data
public class Instance {

    private String id;
    private String host;
    private Integer port;

}