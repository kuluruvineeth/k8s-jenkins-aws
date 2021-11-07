package com.jhooq.Jhooqk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - vineethkarthick-k8s i Have updated the message.I did learn fairly early that the best and most effective way to lead is by letting people do things because they want to do them, not because you want them to. The best leaders also know when they are wrong, and are capable of pulling themselves out. And the best leaders enable others to make decisions for them";
    }
}
