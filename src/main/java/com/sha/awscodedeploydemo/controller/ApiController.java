package com.sha.awscodedeploydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author sa
 * @date 6.02.2021
 * @time 14:05
 */
@RestController
public class ApiController
{
    @GetMapping
    public ResponseEntity<?> getStatus() throws UnknownHostException {
        return ResponseEntity.ok("It works successfullyv2. Hostname: " + InetAddress.getLocalHost().getHostName());
    }
    @GetMapping("api/health")
    public ResponseEntity<?> healthCheck()
    {
        return ResponseEntity.ok("It works successfully. v2");
    }
}
