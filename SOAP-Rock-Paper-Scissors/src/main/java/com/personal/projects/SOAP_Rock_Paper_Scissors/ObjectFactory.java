package com.personal.projects.SOAP_Rock_Paper_Scissors;

import jakarta.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {}

    public GetScoreRequest createGetScoreRequest() {
        return new GetScoreRequest();
    }

    public GetScoreResponse createGetScoreResponse() {
        return new GetScoreResponse();
    }

    public Score createScore() {
        return new Score();
    }

}
