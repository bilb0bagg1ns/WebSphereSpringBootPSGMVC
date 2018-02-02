<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Payment Information</h2>
      <form:form method = "POST" action = "/psgspringboot/addPayment">
         <table>
            <tr>
               <td><form:label path = "amount">Amount</form:label></td>
               <td><form:input path = "amount" /></td>
            </tr>
            <tr>
               <td><form:label path = "register">Register</form:label></td>
               <td><form:input path = "register" /></td>
            </tr>
            <!-- 
            <tr>
               <td><form:label path = "transactionId">TransactionId</form:label></td>
               <td><form:input path = "transactionId" /></td>
            </tr>
             -->
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>