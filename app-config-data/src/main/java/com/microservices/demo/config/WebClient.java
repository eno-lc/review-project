package com.microservices.demo.config;

import lombok.Data;

import java.util.List;

@Data
public class WebClient {
    private Integer connectTimeoutMs;
    private Integer readTimeoutMs;
    private Integer writeTimeoutMs;
    private Integer maxInMemorySize;
    private String contentType;
    private String acceptType;
    private String baseUrl;
    private String serviceId;
    private List<Instance> instances;
}
