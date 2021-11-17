package rs_midtest.service;

import javax.jws.WebMethod;  
import javax.jws.WebService;  
import javax.xml.ws.Endpoint;  

@WebService  
public class HelloWorldWebService {
  
   public String EchoHelloWorld(String name){  
       System.out.println("service HelloWorld: "+name);  
       return"HelloWorld: "+name;  
   } 
   public int GetMax(int x,int y){
      int result=0;
    result=x>y?x:y;
      return result;
   }
     


  @WebMethod(exclude=true)  
  public String EchoHelloWord2(String name){  
   System.out.println("service HelloWorld2: "+name);  
     return"HelloWorld2: "+name;  
   }  
  public static void main(String[] args) {  
    
    Endpoint.publish("http://127.0.0.1:456/helloworld",new HelloWorldWebService());
    System.out.println("webservice has started.");
  }
}  
