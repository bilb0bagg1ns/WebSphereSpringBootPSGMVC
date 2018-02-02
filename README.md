# WebSphereSpringBootPSGMVC
Spring Boot App built to run on WebSphere

Sourced From: All related posts by same author
  http://www.adeveloperdiary.com/java/spring-boot/an-introduction-to-spring-boot/
  http://www.adeveloperdiary.com/java/spring-boot/create-spring-boot-application-step-step/ 
  http://www.adeveloperdiary.com/java/spring-boot/create-restful-webservices-using-spring-boot/
  http://www.adeveloperdiary.com/java/spring-boot/deploy-spring-boot-application-ibm-liberty-8-5/
  
URL: 
     http://localhost:9080/psgspringboot
     http://localhost:9080/psgspringboot/student
     http://localhost:9080/psgspringboot/payment


View:	psgspringboot\psgspringboot-web\src\main\webapp\WEB-INF\jsp\payment.jsp
	psgspringboot\psgspringboot-web\src\main\webapp\WEB-INF\jsp\paymentResult.jsp
	psgspringboot\psgspringboot-web\src\main\webapp\WEB-INF\jsp\result.jsp
	psgspringboot\psgspringboot-web\src\main\webapp\WEB-INF\jsp\student.jsp


Configuration:
	psgspringboot\psgspringboot-web\src\main\java\com\tp\MvcConfiguration.java

Controller:
	psgspringboot\psgspringboot-web\src\main\java\com\tp\ServletInitializer.java
	psgspringboot\psgspringboot-web\src\main\java\com\tp\StudentController.java

  
Service:
	psgmvc\psgmvc-web\src\main\java\us\co\state\sos\auth\service\LoginService.java
  
WEB-INF:
  psgspringboot\psgspringboot-web\src\main\webapp\WEB-INF\web.xml
	<servlet>
		<servlet-name>psgspringboot</servlet-name>
		<servlet-class> org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
		<servlet-mapping>
		<servlet-name>psgspringboot</servlet-name>
		<url-pattern>/</url-pattern>       
	</servlet-mapping>

  psgspringboot\psgspringboot-web\src\main\webapp\WEB-INF\psgspringboot-servlet.xml
  
