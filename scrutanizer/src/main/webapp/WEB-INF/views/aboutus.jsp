<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome!</title>
<link href="<c:url value="/resources/css/home_style.css" />"
	rel="stylesheet">
</head>

<body>
	<header>
		<nav class="nav" id="navigation">
			<table id="nav_table" width="200" border="0">
				<tbody>
					<tr>
						<td><a href="../">
								<button>
									<pre>Home</pre>
								</button>
						</a></td>
					</tr>
				</tbody>
			</table>
		</nav>
	</header>
	<img id="logo" src="<c:url value="/resources/images/logo.png" />"
		width="100" height="100" alt="" />
	<h1 id="companyname">
		<strong>Scrutinize</strong>
	</h1>
	<h6 id="tagline">Your skill scale partner!</h6>
	<section class="container">
		<div>
			<p style="color:white; font-size: 18px">Since 1998, Scrutinizer has been the best way to measure, improve, and promote your skills through certifications. By utilizing Scrutinizer, 11 million members have advanced their skills and careers, and over 15,000 businesses have found better ways to select candidates, track and develop employee skills, and differentiate employees to current and prospective clients. Scrutinizer is an independent certification authority, assessing a variety of skills including IT, Finance, Health Care and Office Skills, to name a few. Independence from other professional organizations permits them to objectively assess skills in a variety of content areas. Scrutinizer has delivered over 30 million tests to over 11 million of their registered users. Using rigorous test development process, Scrutinizer has developed one of the largest online test libraries in the world, totaling over 600 tests.</p>
		</div>
	</section>
</body>
</html>
