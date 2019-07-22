<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>register</title>
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
	<section class="container">
		<div>
			<form:form action="saveCandidate" method="post"
				modelAttribute="candidate">
				
				<form:hidden path="id" />
				<h2 id="heading">Register</h2>
                <label for="name">Name</label>
				<br>
				<br>
				<form:input path="name"  placeholder="Name" class="inputField"/>
				<br>
				<br>
				<form:input path="email" placeholder="Email" class="inputField"/>
				<br>
				<br>
				<form:password path="password" placeholder="Password" class="inputField"/>
				<br>
				<br>
				<form:input path="dob" placeholder="DOB dd-mm-yyyy" class="inputField"/>
				<br>
				<br>
				<form:input path="mobileNumber" placeholder="Mobile Number" class="inputField"/>
				<br>
				<br>
				<form:input path="city" placeholder="City" class="inputField"/>
				<br>
				<br>
				<form:input path="country" placeholder="Country" class="inputField"/>
				<br>
				<br>
				<form:button>Submit</form:button>
			</form:form>
			
		</div>
	</section>
</body>
</html>
