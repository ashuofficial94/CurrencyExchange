function validate() {
	
	var x = document.getElementById("amount").value.trim();
	if(x.length == 0) {
		alert("Enter the amount");
		return false;
	}
	
	if(isNaN(x)) {
		alert("Enter the valid value");
		return false;
	}
	
	return true;
}