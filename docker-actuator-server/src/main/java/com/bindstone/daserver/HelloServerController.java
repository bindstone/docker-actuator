package com.bindstone.daserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloServerController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello Server [" + port + "]", HttpStatus.ACCEPTED);
    }

}
