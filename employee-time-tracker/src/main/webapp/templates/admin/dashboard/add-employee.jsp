<html>
 <%@ include file="add-css.jsp" %>
 <body>
 <div class='dvv'>
   <label class='lah'>Add Employee Form</label>
  </div>
  <div class='container'>
   <div class='card col-md-10 mx-auto'>
    <div class='card-body'>
    <form action="save-record" method="post">
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='firstname' class='la'>Enter first name</label><span> *</span>
      	<input class='form-control' type='text' id='firstname' name='firstname' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='lastname' class='la'>Enter last name</label><span> *</span>
      	<input class='form-control' type='text' id='lastname' name='lastname' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='phone' class='la'>Enter phone number</label><span> *</span>
      	<input class='form-control' type='text' id='phone' name='phone' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='email' class='la'>Enter email id</label><span> *</span>
      	<input class='form-control' type='text' id='email' name='email' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='department' class='la'>Select department</label><span> *</span>
      	<select name="department" class='la form-control'>
      	 <option>Training</option>
      	 <option>Marketing</option>
      	 <option>Accounts</option>
      	 <option>Inventory</option>
      	 <option>Sales</option>
      	 <option>Human Resource</option>
      	</select>
      </div>
      <div class='form-group col-md-5'>
      	<label for='salary' class='la'>Enter salary</label><span> *</span>
      	<input class='form-control' type='text' id='salary' name='salary' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-10'>
       <button class='btn btn-primary'>Save Record</button>
       <input type="button"  class='btn btn-secondary'  onclick='history.back()' value="Cancel">
      </div>
     </div> 
     </form>
    </div>
   </div>
  </div>
 </body>
</html>