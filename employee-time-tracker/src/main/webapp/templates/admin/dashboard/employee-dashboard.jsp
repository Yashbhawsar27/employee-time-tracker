<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <%@ include file="add-css.jsp" %>
 <body>
  <div class='dvv'>
   <label class='lah'>Employee DashBaord</label>
  </div>
  <div class='container'>
  <a href='add' class='la'><i class='fa fa-user-plus'></i>Add Employee</a>
   <div class='card col-md-12 mx-auto'>
    <div class='card-body'>
      <c:if test="${elist=='[]'}">
      <div class='dv'>
         <label class='la' style='color:red'>Employee dash board has no record</label>
       </div>
      </c:if>
     <c:if test="${elist!='[]'}">
     <table class='table table-hover'>
      <thead>
       <tr>
        <th>Employee id</th><th>First name</th><th>Last name</th>
        <th>Phone number</th><th>Email id</th><th>Department</th>
        <th>Salary</th><th style='color:blue'>Action</th>
       </tr>
      </thead>
      <tbody>
      <c:forEach var="emp" items="${elist}">
        <tr>
    	   <td>${emp.eid}</td>
    	   <td>${emp.firstname}</td>
    	   <td>${emp.lastname}</td>
    	   <td>${emp.phone}</td>
    	   <td>${emp.email}</td>
    	   <td>${emp.department}</td>
    	   <td>${emp.salary}</td>
    	   <td>
    	      <a href='edit-record?eid=${emp.eid}'>Edit |</a>
    	      <a href='delete-record?eid=${emp.eid}' onclick='return confirm("Are you sure to delete?")'>Delete</a>
    	   </td>
    	  </tr>
    	</c:forEach>  
      </tbody>
     </table>
     </c:if>
    </div>
   </div>
   <a href='/employee-time-tracker/admin' class='la'><i class='fa fa-home'></i>Home</a>
  </div>
 </body>
</html>