<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>candidate home</title>
<link href="<c:url value="/resources/css/home_style.css" />"
	rel="stylesheet">
</head>
<body>
	<img id="logo" src="<c:url value="/resources/images/logo.png" />"
		width="140" height="100" alt="" />
	<h1 id="companyname">
		<strong>Scrutanize</strong>
	</h1>
	<h6 id="tagline">Your skill scale partner!</h6>
	<h5 style="float:right;">welcome, ${usr.name}!</h5>
	
	<header>
  <nav class="nav" id="navigation">
      <table id="nav_table" width="200" border="0" >
      <tbody>
        <tr>
        <td><a href="report">
            <button>
            <pre>view report</pre>
            </button>
            </a></td>
            <td><a href="../">
            <button>
            <pre>logout</pre>
            </button>
            </a></td>
        </tr>
      </tbody>
    </table>
  </nav>
  </header>
  
  <section class="container">
 <div style="float:left;"> 
<h3>Instructions</h3>
<P>	Please read and understand the Test instructions so that you will be able to easily navigate through the Test.</P>
<p>Once you click on the 'Start exam ' button the actual test time will begin. </p>
<p>	On the Upper right-hand side you will see the count-down timer for the Test.</p>
<p>Only one Question will be displayed on the computer screen at a time. Select an answer of your choice and press next button leaving field empty results in incorrect answer. </p>
<p>Questions are displayed in sequence one by one, ansewring the last question auto submits the test.</p>
<p><b>There is no negative marking.</b> </p>
<p>Kindly do not click finish button if you have not answered all questions..</p>
<h3>ALL THE BEST !</h3><br>
</div>

		<h2>Select Test Module</h2>
		<div style="padding-left: 100px;">

			<table width="200">
				<tbody>
					<tr>
						<td><a href="../test/startTestjava">
								<button>
									<pre>JAVA</pre>
								</button>
						</a></td>
					</tr>
					<tr>
						<td><a href="../test/startTestcpp"">
								<button>
									<pre>C++</pre>
								</button>
						</a></td>
					</tr>
					<tr>
						<td><a href="../test/startTestphp">
								<button>
									<pre>PHP</pre>
								</button>
						</a></td>
					</tr>
				</tbody>
			</table>
		</div>
	</section>
</body>
</html>