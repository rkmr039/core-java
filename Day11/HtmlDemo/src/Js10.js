                                    /**
 * 
 */

function show() {
	var res="";
	var obj = new Date();
	res += "Today's Date is : " + obj.getDate()  + "<br/><br/>";
	var month = obj.getMonth();
	month = month + 1;
	res += "Month is : " + month + "<br/><br/>";
	res += "Year is  : " + obj.getFullYear() + "<br/><br/>";
	res += "Hours is : " + obj.getHours() + "<br/><br/>";
	res += "Months is : " + obj.getMinutes() + "<br/><br/>";
	res += "Seconds is : " + obj.getSeconds() + "<br/><br/>";
	
	document.getElementById("res").innerHTML = res;
}