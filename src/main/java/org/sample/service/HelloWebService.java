package org.sample.service;

import org.sample.ws.*;

import javax.jws.*;

@WebService(name = "Hello_", targetNamespace = "http://www.examples.com/wsdl/HelloService.wsdl")
public class HelloWebService implements HelloPortType {

    /**
     * @param firstName
     * @return returns java.lang.String
     */
    public String sayHello(@WebParam(name = "firstName", partName = "firstName") String firstName) {
        System.out.println("Name received : " + firstName);
        return "Hello "+ firstName+ " welcome to the web service";
    }
}