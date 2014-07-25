package org.sample.client;

import org.sample.ws.HelloService;
import org.sample.ws.*;

public class HelloClient {

    public static void main(String[] args) {
        HelloService service = new HelloService();
        HelloPortType portType = service.getHelloPort();
        String response = portType.sayHello("Malith");
        System.out.println(response);
    }

}
