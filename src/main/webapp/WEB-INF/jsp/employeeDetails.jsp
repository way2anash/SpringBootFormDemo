
<html>
   <head>
 <title>Spring MVC Form Handling</title>
   </head>
<body>
 <h1>${headermsg }</h1>
  <p>   ${quotemsg } </p>
<h2>
Submitted Employee Information</h2>
<table border="1"><tbody>
<tr>     <td>Employee ID </td>      <td>${emp.empId}</td>   </tr>
<tr>      <td>Employee Name</td>      <td>${emp.name}</td>  </tr>
<tr>     <td>Employee Age</td>      <td>${emp.age}</td>     </tr>
<tr>      <td>Employee Salary</td>       <td>${emp.salary}</td> </tr>

</tbody></table>
</body>
</html>