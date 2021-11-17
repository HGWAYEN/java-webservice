package rs_midtest.client.test;  
import rs_midtest.client.rs_midtest.service.*;

public class MyClient {  

  public static void main(String[] args) {  
     HelloWorldWebServiceService hwss = new HelloWorldWebServiceService(); 
     HelloWorldWebService hws =hwss.getHelloWorldWebServicePort();  
                       
     String result=hws.echoHelloWorld("hgwayen");
     System.out.println(result);  

	 int max=hws.getMax(2,3);
	 System.out.println("max 2,3: "+max);
  }  
}
