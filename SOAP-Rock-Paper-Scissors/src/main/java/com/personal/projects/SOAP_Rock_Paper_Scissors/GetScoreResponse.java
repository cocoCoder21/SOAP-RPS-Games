package com.personal.projects.SOAP_Rock_Paper_Scissors;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "score"
})
@XmlRootElement(name = "getScoreResponse")
public class GetScoreResponse {

    @XmlElement(required = true)
    protected Score score;

    public Score getScore() {
        return score;
    }

    public void setScore(Score value) {
        this.score = value;
    }

}
