function makeActive(link){
	var element=document.getElementById(link);
	element.style.color="red";
}
function checkEmployee(db){
	if(db.value!=-1)
		document.getElementById("bt").disabled=false;
	else
		document.getElementById("bt").disabled=true;
}
function compareDate(){
	if(document.getElementById("date1").value>=document.getElementById("date2").value){
		alert("First date should be smaller than second date");
		return false;
	}
	return true;
}