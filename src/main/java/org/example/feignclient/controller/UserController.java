package org.example.feignclient.controller;

import lombok.AllArgsConstructor;
import org.example.feignclient.FeignClientUserConnector;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@AllArgsConstructor
public class UserController {

    private final FeignClientUserConnector connector;

    @GetMapping("/username")
    public String getUserName() {
       return connector.gerUserName();
    }



}
