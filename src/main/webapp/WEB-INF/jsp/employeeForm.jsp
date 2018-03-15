<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
 <head>
  
  <title>Spring MVC Form Handling</title>
 </head>
 <body>
 <h1>${headermsg }</h1> 
  <p>   ${quotemsg } </p>
<h2>
Employee Data Form</h2>
<form:errors path="emp.*"/>
<form action="/employee/addemployee" method="post" >    
<table>
 <tr><td>Employee Id:      </td> <td> <input type="number" name="empId"/>  </td> </tr>
 <tr><td>Employee Name:    </td> <td> <input type="text" name="name"/>     </td> </tr>
 <tr><td>Employee Salary:  </td> <td> <input type="number" name="salary">  </td> </tr>
 <tr><td>Employee Age:     </td> <td><input type="number" name="age">      </td> </tr>
 <tr><td><input type="submit" value="click here to submit">                </td> </tr>
</table>
</form>
</body>
</html>