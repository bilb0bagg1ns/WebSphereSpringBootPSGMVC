# WebSphereSpringBootPSGMVC
Spring Boot App built to run on WebSphere

URL: http://localhost:9080/psgmvc/

View:
  psgmvc\psgmvc-web\src\main\webapp\index.jsp

Controller:
  psgmvc\psgmvc-web\src\main\java\us\co\state\sos\auth\controller\PSGMVCController.java
  
Service:
  psgmvc\psgmvc-web\src\main\java\us\co\state\sos\auth\service\LoginService.java
  
WEB-INF:
  psgmvc\psgmvc-web\src\main\webapp\WEB-INF\web.xml

	<servlet-mapping>
        <servlet-name>psgmvc</servlet-name>
        <url-pattern>/welcome.jsp</url-pattern>
 </servlet-mapping>
 
   <welcome-file-list>
    <welcome-file>index.jsp</welcome-file>
  </welcome-file-list>
  
  psgmvc\psgmvc-web\src\main\webapp\WEB-INF\psgmvc-servlet.xml
  
