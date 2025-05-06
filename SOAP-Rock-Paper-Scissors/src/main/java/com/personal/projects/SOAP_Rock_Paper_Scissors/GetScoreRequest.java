package com.personal.projects.SOAP_Rock_Paper_Scissors;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user"
})
@XmlRootElement(name = "getScoreRequest")
public class GetScoreRequest {

    @XmlElement(required = true)
    protected String user;

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }

}
