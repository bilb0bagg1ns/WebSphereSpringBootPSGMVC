<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Submitted Information</h2>
      <table>
         <tr>
            <td>Amount:</td>
            <td>${amount}</td>
         </tr>
         <tr>
            <td>Register:</td>
            <td>${register}</td>
         </tr>
         <tr>
            <td>TransactionId:</td>
            <td>${transactionId}</td>
         </tr>
      </table>  
   </body>
   
</html>