<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <%@ include file="add-css.jsp" %>
 <body>
 <div class='dvv'>
   <label class='lah'>Edit Employee Form</label>
  </div>
  <div class='container'>
   <div class='card col-md-10 mx-auto'>
    <div class='card-body'>
    <form action="update-record" method="post">
     <input type='hidden' name='eid' value='${emp.eid}'>
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='firstname' class='la'>Edit first name</label>
      	<input class='form-control' value="${emp.firstname}" type='text' id='firstname' name='firstname' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='lastname' class='la'>Edit last name</label>
      	<input class='form-control' value="${emp.lastname}" type='text' id='lastname' name='lastname' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='phone' class='la'>Edit phone number</label>
      	<input class='form-control' value="${emp.phone}" type='text' id='phone' name='phone' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='email' class='la'>Edit email id</label>
      	<input class='form-control' value="${emp.email}" type='text' id='email' name='email' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='department' class='la'>Change department</label>
      	<select name="department" class='la form-control'>
      	 <c:forEach var="dept" items="${dlist}">
      	   <c:if test="${emp.department==dept}">
      	   	<option selected>${dept}</option>
      	   </c:if>
      	   <c:if test="${emp.department!=dept}">
      	   	<option>${dept}</option>
      	   </c:if>
      	 </c:forEach>
      	</select>
      </div>
      <div class='form-group col-md-5'>
      	<label for='salary' class='la'>Edit salary</label>
      	<input class='form-control' value="${emp.salary}" type='text' id='salary' name='salary' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-10'>
       <button class='btn btn-primary'>update Record</button>
       <input type="button"  class='btn btn-secondary'  onclick='history.back()' value="Cancel">
      </div>
     </div> 
     </form>
    </div>
   </div>
  </div>
 </body>
</html>