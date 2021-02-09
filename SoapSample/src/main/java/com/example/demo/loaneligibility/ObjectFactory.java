package com.example.demo.loaneligibility;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {


   
    public ObjectFactory() {
    }

    
    public CustomerRequest createCustomerRequest() {
        return new CustomerRequest();
    }

    
    public Acknowledgement createAcknowledgement() {
        return new Acknowledgement();
    }

}
