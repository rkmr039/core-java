/**
 * 
 */
var i = 0;
var ans = 0;
questions = [
             ['1. What is Object Oriented Programming?',['A1','A2','A3','A4'],1],
             ['2. Who Introduce Java',                  ['B1','B2','B3','B4'],3],
             ['3. How to declare Generics?',            ['C1','C2','C3','C4'],2],
             ['4. String.format() is used for... ? ',   ['D1','D2','D3','D4'],4]
             ];



function show() {
	document.getElementById("question").innerHTML = questions[i][0];
	// options
	document.getElementById("opt1").innerHTML =  questions[i][1][0];
	document.getElementById("opt2").innerHTML =  questions[i][1][1];
	document.getElementById("opt3").innerHTML =	 questions[i][1][2];	
	document.getElementById("opt4").innerHTML =  questions[i][1][3];
    // answers
	document.getElementById("a1").value =  1;
	document.getElementById("a2").value =  2;
	document.getElementById("a3").value =  3;	
	document.getElementById("a4").value =  4;
	
	
}
function chkAnswer() {
	var answer = questions[i][2];
	var radio = frmOnline.elements["exam"];
	
	if(radio[0].checked && answer == document.getElementById("a1").value) {
		ans++;
	} else if(radio[1].checked && answer == document.getElementById("a2").value) {
		ans++;
	} else if(radio[2].checked && answer == document.getElementById("a3").value) {
		ans++;
	} else if(radio[3].checked && answer == document.getElementById("a4").value) {
		ans++;
	} else {
		alert("Select any one option...");
	}
	
}
function nextQuestion() {
	chkAnswer();
	i = i + 1;
	if (i < 4) {
		show();
	} else {
		alert("Exam Over....");
	}
	if(i == 4) {
		document.getElementById("res").innerHTML = "Correct Answers : " + ans;
	}
}