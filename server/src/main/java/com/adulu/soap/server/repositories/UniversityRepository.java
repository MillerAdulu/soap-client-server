package com.adulu.soap.server.repositories;

import localhost._7000.universities.University;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UniversityRepository {
    private Map<String, University> universityMap = new HashMap<>();

    @PostConstruct
    private void loadData() {
        University strath = new University();
        strath.setLocation("Ole Sangale");
        strath.setName("Strathmore");
        strath.setYearFounded(1960);
        universityMap.put(strath.getName(), strath);

        University jkuat = new University();
        jkuat.setLocation("Juja");
        jkuat.setName("JKUAT");
        jkuat.setYearFounded(1990);
        universityMap.put(jkuat.getName(), jkuat);

        University riara = new University();
        riara.setLocation("Mbagathi");
        riara.setName("Riara");
        riara.setYearFounded(2003);
        universityMap.put(riara.getName(), riara);
    }

    public University getUniversityByName(String name) {
        return universityMap.get(name);
    }


    public List<University> getAllUniversities(){
        return new ArrayList<>(universityMap.values());
    }
}
