package org.example.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo", url = "http://localhost:8081/users")
public interface FeignClientUserConnector {

    @GetMapping("name")
    String  gerUserName();
}
