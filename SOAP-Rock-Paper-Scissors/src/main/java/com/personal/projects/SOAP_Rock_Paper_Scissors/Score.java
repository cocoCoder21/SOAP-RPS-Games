package com.personal.projects.SOAP_Rock_Paper_Scissors;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score", propOrder = {
    "user",
    "wins",
    "losses",
    "ties"
})
public class Score {

    @XmlElement(required = true)
    protected String user;
    protected int wins;
    protected int losses;
    protected int ties;

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int value) {
        this.wins = value;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int value) {
        this.losses = value;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int value) {
        this.ties = value;
    }

}
