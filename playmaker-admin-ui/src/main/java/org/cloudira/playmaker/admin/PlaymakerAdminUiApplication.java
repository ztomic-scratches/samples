package org.cloudira.playmaker.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class PlaymakerAdminUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaymakerAdminUiApplication.class, args);
    }
}
