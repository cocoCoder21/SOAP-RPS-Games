package com.personal.projects.SOAP_Rock_Paper_Scissors;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ScoreEndpoint {

    @PayloadRoot(namespace = "http://personal.com/projects/", localPart = "getScoreRequest")
    @ResponsePayload
    public GetScoreResponse getScore(@RequestPayload GetScoreRequest request) {

        Score score = new Score();

        if (request.getUser().equalsIgnoreCase("Anj")) {
            score.setWins(100);
        } else {
            score.setWins(99);
            score.setLosses(66);
            score.setTies(7);
        }

        GetScoreResponse response = new GetScoreResponse();
        response.setScore(score);
        return response;
    }
}
