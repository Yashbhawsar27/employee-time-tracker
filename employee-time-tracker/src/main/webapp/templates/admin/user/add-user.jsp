<html>
 <%@ include file="add-css.jsp" %>
 <body>
 <div class='dvv'>
   <label class='lah'>Add User Form</label>
  </div>
  <div class='container'>
   <div class='dvv'>
    <label class='la' style='color:red'>${msg}</label>
   </div>
   <div class='card col-md-10 mx-auto'>
    <div class='card-body'>
    <form action="save-record" method="post">
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='userid' class='la'>Enter user id</label><span> *</span>
      	<input class='form-control' type='text' id='userid' name='userid' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='password' class='la'>Enter password</label><span> *</span>
      	<input class='form-control' type='password' id='password' name='password' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='name' class='la'>Enter user name</label><span> *</span>
      	<input class='form-control' type='text' id='name' name='name' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='phone' class='la'>Enter phone number</label><span> *</span>
      	<input class='form-control' type='text' id='phone' name='phone' required>
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