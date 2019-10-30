package com.adulu.soap.client;

import com.adulu.soap.client.delivery.SOAPConnector;
import localhost._7000.universities.GetAllUniversitiesResponse;
import localhost._7000.universities.GetUniversityResponse;
import localhost._7000.universities.University;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
