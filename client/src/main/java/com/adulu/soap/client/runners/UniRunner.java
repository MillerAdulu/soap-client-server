package com.adulu.soap.client.runners;

import com.adulu.soap.client.delivery.SOAPConnector;
import localhost._7000.universities.GetAllUniversitiesResponse;
import localhost._7000.universities.GetUniversityResponse;
import localhost._7000.universities.University;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class UniRunner implements CommandLineRunner {
    private final SOAPConnector soapConnector;

    public UniRunner(SOAPConnector soapConnector) {
        this.soapConnector = soapConnector;
    }

    @Override
    public void run(String... args) throws Exception {
        GetAllUniversitiesResponse universitiesResponse = soapConnector.getAllUniversities();
        List<University> unis = universitiesResponse.getUniversity();

        for (University uni : unis) {
            System.out.println("------ Init Uni ------\n" +
                    "Name: " + uni.getName() + "\n" +
                    "Location:" + uni.getLocation() + "\n" +
                    "Year Founded:" + uni.getYearFounded() +
                    "------ End Uni ------"
            );

        }

        System.out.println("The system is now performing a random search");
        Random random = new Random();


        GetUniversityResponse universityResponse = soapConnector.getUniversity(unis.get(
                random.nextInt(unis.size())
        ).getName());
        University uni = universityResponse.getUniversity();
        System.out.println("------ Init Uni ------\n" +
                "Name: " + uni.getName() + "\n" +
                "Location:" + uni.getLocation() + "\n" +
                "Year Founded:" + uni.getYearFounded() +
                "------ End Uni ------"
        );

    }
}
