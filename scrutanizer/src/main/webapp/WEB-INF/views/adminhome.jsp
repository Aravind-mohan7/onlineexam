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
									<pre>Logout</pre>
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
		
		</div>
	</section>
</body>
</html>