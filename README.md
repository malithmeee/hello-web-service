hello-web-service
=================

Sample web service/client create using WSDL file with Maven & JAX-WS

How to generate client via WSDL file
====================================

By executing following command on linux bash command line, cloud be obtain the service port classes

> wsimport -keep -verbose http://compA.com/ws/HelloService.wsdl -b binding.xml
OR
> wsimport -keep -verbose /home/malith/HelloService.wsdl -b binding.xml

Note : The binding xml is need to avoid generating JAXB element contents
------

How to create web service
=========================

By above code generation, we can obtain Interface class which contains the service bridge.
We could be wright sample web service by implementing the interface by additionally adding teh @WebService annotation
Create the sun-javaws.xml in WEB-INF folder to define web service mappings

E.g.

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

Deploy the web service
======================
Build the above project using maven and deploy the ***.war archive in tomcat.

Type in web browser like http://localhost:8080/webservice-1.0.0/hello, then we can visible the deployed web service details