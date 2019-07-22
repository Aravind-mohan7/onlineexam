<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!doctype html>
<html>
<head>
<link href="<c:url value="/resources/css/home_style.css" />"
	rel="stylesheet">
<meta charset="utf-8">
<title>Welcome!</title>
</head>

<body>
	<script>
		function check(form) {

			if (form.userid.value == "admin"
					&& form.password.value == "admin123") {
			
				window.location = "../admin/adminHome"
				
				
			} else {
				alert("Error Password or Username")
				document.getElementById("adminlogin").reset();
			}
		}
	</script>
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
		width="140" height="100" alt="" />
	<h1 id="companyname">
		<strong>Scrutinize</strong>
	</h1>
	<h6 id="tagline">Your skill scale partner!</h6>
	<section class="container">
		<div>
			<form id="adminlogin">
				<h2 id="heading">Admin Login</h2>
				<input name="userid" type="text" class="inputField"
					placeholder="Username" required> <br> <br>
				<div id="forgot">
					<input name="password" type="password" class="inputField"
						placeholder="Password" required>
				</div>
				<br> <input type="button" onclick="check(this.form)"
					name="submit" id="submit" value="Submit">
			</form>
		</div>
	</section>
</body>
</html>
