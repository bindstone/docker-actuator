package com.bindstone.daserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DockerActuatorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerActuatorServerApplication.class, args);
    }

}
