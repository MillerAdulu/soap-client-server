package com.adulu.soap.client.delivery;

import localhost._7000.universities.GetAllUniversitiesRequest;
import localhost._7000.universities.GetAllUniversitiesResponse;
import localhost._7000.universities.GetUniversityRequest;
import localhost._7000.universities.GetUniversityResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SOAPConnector extends WebServiceGatewaySupport {

    private static final String ENDPOINT = "http://localhost:7000/ws";

    public GetAllUniversitiesResponse getAllUniversities() {
        GetAllUniversitiesRequest request = new GetAllUniversitiesRequest();

        return (GetAllUniversitiesResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, request);
    }

    public GetUniversityResponse getUniversity(String name) {
        GetUniversityRequest request = new GetUniversityRequest();
        request.setName(name);

        return (GetUniversityResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, request);

    }
}
