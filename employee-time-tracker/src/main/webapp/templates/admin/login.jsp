<html>
 <head> 
  <link href='../CSS/style.css' rel='stylesheet'>
 </head>
 <body>
  <form action="authenticate-user">
   <table class="ta" cellpadding="15px">
    <tr>
     <td>Enter your id:</td>
     <td><input type="text" name="adminid" value="${id}" class="tb" style="height:2.5vw" required></td>
    </tr>
    <tr>
     <td>Enter your password:</td>
     <td><input type="password" name="pass" class="tb" style="height:2.5vw" required></td>
    </tr>
    <tr>
     <td colspan="2" align="right">
      <button class="btr" style="background-color:black">Submit</button>
     </td>
    </tr>
   </table>
  </form>
  <div class='dvv'>
   	<label class='la' style="color:red">${msg}</label>
  </div>
 </body>
</html>
