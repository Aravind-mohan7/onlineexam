<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/test_style.css" />"rel="stylesheet">
<meta charset="UTF-8">

            <script language ="javascript" >
                
                
                
                
                var pos = 0, test, test_status, question, choice, choices, chA, chB, chC, chD, correct = 0;
            	var questions = new Array;
            	var qline = new Array;
            	var urlmaker;
            	function _(x) {
            		return document.getElementById(x);
            	}
            	
            	function renderQuestion() {
            		test = _("test");
            		if (pos >= questions.length) {
            			 var scr = "he";
            			 var percent = (correct/questions.length)*100;
            			test.innerHTML = "<center><h2>You scored " + (correct/questions.length)*100 + " percent!</h2></center> <br>";
            			//test.innerHTML += "<c:url var='scoreview'  value='/test/testEnd'><c:param name='score'  value='$(percent)'/></c:url><a href='${scoreview}'><button id='terminator'>Proceed</button></a>";
						test.innerHTML = "<a href='testEnd"+"?score=" + percent +"'<button>Finish</button></a>";
            			_("test_status").innerHTML = "Test Completed";
            			pos = 0;
            			correct = 0;
            			return false;
            		}
            		
            		
            		_("test_status").innerHTML = "Question " + (pos + 1) + " of "
            				+ questions.length ;
            		
            		question = questions[pos][0];
            		chA = questions[pos][1];
            		chB = questions[pos][2];
            		chC = questions[pos][3];
            		chD = questions[pos][4];
            		
            		test.innerHTML = "<h3>" + question + "</h3>";
            		test.innerHTML += "<input type='radio' name='choices' value='A'> "
            				+ chA + "<br>";
            		test.innerHTML += "<input type='radio' name='choices' value='B'> "
            				+ chB + "<br>";
            		test.innerHTML += "<input type='radio' name='choices' value='C'> "
            				+ chC + "<br>";
            		test.innerHTML += "<input type='radio' name='choices' value='D'> "
            				+ chD + "<br><br>";
            		test.innerHTML += "<center><button onclick='checkAnswer()'>Next</button>&nbsp;&nbsp</center>";
            		
            		
            	}
            	
            	
            	
            	function endTest(){
            		pos = questions.length;
            		renderQuestion();
            		 
            	}
            	
            	function checkAnswer() {
            		choices = document.getElementsByName("choices");
            		for (var i = 0; i < choices.length; i++) {
            			if (choices[i].checked) {
            				choice = choices[i].value;
            			}
            		}
            		if (choice == questions[pos][5]) {
            			correct++;
            		}
            		choice = "";
            		pos++;
            		renderQuestion();
            		
            	}
            	
            	window.addEventListener("load", renderQuestion, false);
            	
            	
            	var tim;
                
                var min = 0;
                var sec = 5;
                var f = new Date();
                function f1() {
                    f2();
                    document.getElementById("starttime").innerHTML = "You've started your Exam at " + f.getHours() + ":" + f.getMinutes();
                     
                  
                }
                function f2() {
                    if (parseInt(sec) > 0) {
                        sec = parseInt(sec) - 1;
                        document.getElementById("showtime").innerHTML = "Your Left Time is :"+min+" Minutes ," + sec+" Seconds";
                        tim = setTimeout("f2()", 1000);
                    }
                    else {
                        if (parseInt(sec) == 0) {
                            min = parseInt(min) - 1;
                            if (parseInt(min) == 0) {
                                clearTimeout(tim);
//                             location.href = "default5.aspx";
                               

                            }
                            else {
                                sec = 60;
                                document.getElementById("showtime").innerHTML = "Your Left Time  is :" + min + " Minutes ," + sec + " Seconds";
                                tim = setTimeout("f2()", 1000);
                            }
                        }
                       
                    }
                }
            </script>


</head>
<body onload="f1()">
<div>
<section style="float:left;">
<img id="logo" src="<c:url value="/resources/images/logo.png" />"
		width="140" height="100" alt="" />
		</section>
		<section style="float:right;color:white;">
		
			        <table width="100%" align="center">
                <tr>
                  <td colspan="2">
                    
                  </td>
                </tr>
                <tr>
                  <td>
                    <div id="starttime"></div>
         
                    <div id="endtime"></div>
         
                    <div id="showtime"></div>
                  </td>
                </tr>
                <tr>
                  <td>
                  </td>
                </tr>
              </table>
         </section>
         </div>
         <br><br><br><br><br>
<center>
	<h2 id="test_status" style="color:white;"></h2>
	</center>
	<section class = "container">
	<div id="test"></div>
	</section>
	

	
	
<script>
	
	</script>


	<p id = "test"></p> 
		<c:forEach var="tempques" items="${questionlist}">
			<script>
				qline.push('${tempques.content}');
				qline.push('${tempques.option1}');
				qline.push('${tempques.option2}');
				qline.push('${tempques.option3}');
				qline.push('${tempques.option4}');
				qline.push('${tempques.answer}');
				questions.push(qline);
				qline = [];
			</script>
		</c:forEach>
		<br><br><br><br><br>		
		
		
</body>
</html>