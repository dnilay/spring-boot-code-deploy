package com.sha.awscodedeploydemo.controller;

import com.sha.awscodedeploydemo.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

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

    @GetMapping("/api/products")
    public ResponseEntity<?> getProducts2()
    {
      return ResponseEntity.ok(List.of(new Product("1L", "Product 1",12),new Product("2l","Product 2",13))) ;
    }

}
